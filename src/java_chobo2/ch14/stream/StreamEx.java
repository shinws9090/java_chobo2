package java_chobo2.ch14.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		String[] strArr = {"aaa","ddd","ccc"};
		List<String> strList = Arrays.asList(strArr);
		
		System.out.println(Arrays.toString(strArr));
		System.out.println(strList);
		
		//1.정렬
		//2.출력
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Collections.sort(strList);
		System.out.println(strList);
		
		//stream 으로
		String[] strArr2 = {"aaa","ddd","ccc"};
		List<String> strList2 = Arrays.asList(strArr);
		
		Stream<String> strStream1 = Arrays.stream(strArr);
		Stream<String> strStream2 = strList2.stream();
		
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);// 다 소모한것
		
		
		//1.스트림은 데이터 소스로부터 데이터를 읽기만 할뿐 변경하지않는다.-----------------------------------
		
		//스트림을 리스트 타입으로 반환
		List<String> list = strList2.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		
		//2. 스트림은 일회용이다.(필요하면 다시 생성 해야됨)----------------------------------------------
		
		// strStream1.sorted().forEach(System.out::println);
		//위코드에서 사용했으므로 사용 불가능 
//		long cnt = strStream1.count();
//		System.out.println(cnt);
		
		long cnt = Arrays.stream(strArr2).count();
		System.out.println(cnt);
		
		
		//3. 지연된 연산(최종 연산전까지는 중간연산이 수행되지않음)
		IntStream intStream = new Random().ints(1,46);
		intStream.distinct().limit(6).sorted()          //중간연산
				 .forEach(i->System.out.print(i+", ")); //최조연산
		System.out.println();
		
		intStream = new Random().ints(1,46);
		intStream 
		.distinct()
		.limit(6)
		.sorted()          
		.forEach(i->System.out.print(i+", "));
		System.out.println();
		
		//스트림의 잡업을 병렬로 처리 - 병렬 스트림
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		int sum = strStream.parallel().mapToInt(s->s.length()).sum();
		System.out.println(sum);
		
		
	}

}
