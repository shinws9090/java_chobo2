package java_chobo2.ch14.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class Collection { // 컬랙션프레임웍 함수형 인터페이스
	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		// list 반복문
		for (int i = 0; i < 10; i++) {
			arList.add(i);
		}

		for (int i : arList) {
			System.out.print(i + ", ");
		}
		System.out.println();
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + ", ");

			}
		};
		Consumer<Integer> d = i -> System.out.print(i + ", ");
		arList.forEach(c);
		System.out.println();
		arList.forEach(d);
		System.out.println();
		arList.forEach(i -> System.out.print(i + ","));
		System.out.println();

		
		
		// list에서 2또는 3의 배수 제거
		arList.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		arList.forEach(i -> System.out.print(i + ","));
		System.out.println();

		// list에서 5또는 7의 배수 제거
		Predicate<Integer> p1 = i -> i % 5 == 0;
		Predicate<Integer> p2 = i -> i % 7 == 0;

		arList.removeIf(p1.or(p2));
		arList.forEach(i -> System.out.print(i + ","));
		System.out.println();
		
		
		
		//10 곱하기
		UnaryOperator<Integer> v = new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*10;
			}
		};
		arList.replaceAll(v);
		arList.forEach(i -> System.out.print(i + ","));
		System.out.println();
		UnaryOperator<Integer> u = i->i*10;
		arList.replaceAll(u);
		arList.forEach(i -> System.out.print(i + ","));
		System.out.println();
		
		//Map 출력
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		//중요
		for(Entry<String, String> e : map.entrySet()) {
			System.out.printf("%s:%s%n",e.getKey(),e.getValue());
		}
		System.out.println();
		//중요
		for(String key : map.keySet()) {
			System.out.printf("%s:%s%n",key,map.get(key));
		}
		
		System.out.println();
		map.forEach((i,j)->System.out.println(i+":"+j));
	}
}
