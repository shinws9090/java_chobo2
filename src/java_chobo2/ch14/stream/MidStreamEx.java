package java_chobo2.ch14.stream;

import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MidStreamEx {
	public static void main(String[] args) {
		//중간연산	
//		extracted01();	//skip , limit , filter , distinct
		
//		extracted02();  //sorted
		
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		
//		studentStream.sorted(Comparator.comparing(Student::getBan)
//					.thenComparing(Comparator.naturalOrder()))
//					.forEach(System.out::println);
		
		
		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
		.forEach(System.out::println);
		
		
	}

	public static void extracted02() {
		//sorted
		//정순
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		
		Stream.of("dd","aaa","CC","cc","b")
		.sorted(Comparator.naturalOrder())
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		Stream.of("dd","aaa","CC","cc","b")
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		Stream.of("dd","aaa","CC","cc","b")
		.sorted(String::compareTo)
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//역순
		Stream.of("dd","aaa","CC","cc","b")
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//대소문자 구분안함 (정순)
		Stream.of("dd","aaa","CC","cc","b")
		.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//대소문자 구분안함 (역순)
		Stream.of("dd","aaa","CC","cc","b")
		.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
		.forEach(s->System.out.print(s+" "));
		System.out.println();
	}

	public static void extracted01() {
		
		//1.skip() 앞에서부터 스킵	, limit() ~까지	
		IntStream.rangeClosed(1, 10)
		.skip(3)
		.limit(5)
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		
		//2.filter()걸러내기 , distinct()중복제거
		IntStream.of(1,2,2,2,3,3,3,4,5,5,5)
		.distinct()
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		IntStream.rangeClosed(1, 20)
		.filter(i->i%2==0)
		.filter(i->i%3==0)
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//프리디케이트 활용 스트림
		IntPredicate p = t -> t % 2 == 0;
		IntStream.rangeClosed(1, 20)
		.filter(p)
		.forEach(s->System.out.print(s+" "));
		System.out.println();
	}
}
