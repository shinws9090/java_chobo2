package java_chobo2.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionEx {  
	public static void main(String[] args) {
		//람다식
		Supplier<Integer> f = () -> (int) (Math.random() * 100) + 1;
		System.out.println(f.get());
		//익명클래스 방식
		Supplier<Integer> f01 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return (int) (Math.random() * 10) + 1;
			}
		};
		System.out.println(f01.get());
		//클래스 방식
		class MySupplier implements Supplier<Integer>{

			@Override
			public Integer get() {
				return (int) (Math.random() * 10) + 1;
			}
			
		}
		MySupplier ms = new MySupplier();
		System.out.println(ms.get());
		
		Consumer<Integer> f1 = i -> System.out.println(i + ", ");
		f1.accept(10);

		Consumer<Integer> f1_01 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t + ", ");
				
			}
		};
		f1_01.accept(5);

		
		Predicate<Integer> f2 = i -> i % 2 == 0;
		System.out.println(f2.test(3) + ", " + f2.test(4));

		Predicate<Integer> f2_01 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		};
		System.out.println(f2_01.test(3) + ", " + f2_01.test(4));
		
		
		Function<Integer, Integer> f3 = i -> i / 10 * 10;
		System.out.println(f3.apply(20));
		
		Function<Integer, Integer> f3_01 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t / 10 * 10;
			}
		};
		System.out.println(f3_01.apply(103));
		
	}
}
