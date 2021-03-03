package java_chobo2.ch14.ref;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class MyClass {
	int x;
	int y;

	public MyClass() {
	}

	public MyClass(int x) {
		this.x = x;
	}

	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}// hashCode

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyClass) {
			MyClass other = (MyClass) obj;
			if (x == other.x) {
				return true;
			}
		}
		return false;
	}// equals

	@Override
	public String toString() {
		return String.format("MyClass [x=%s, y=%s]", x, y);
	}

}// MyClass

public class MethodRefEx { // 메서드 참조

	public static void main(String[] args) {
		Function<String, Integer> f = s -> Integer.parseInt(s);
		System.out.println(f.apply("16"));

		Function<String, Integer> f2 = Integer::parseInt;
		System.out.println(f2.apply("16"));

		BiFunction<String, String, Boolean> g = (s1, s2) -> s1.equals(s2);
		System.out.println(g.apply("abc", "abc"));

		BiFunction<String, String, Boolean> h = String::equals;
		System.out.println(h.apply("abc", "abc"));

		// 객체간의 참조

		MyClass m1 = new MyClass(5, 2);
		MyClass m2 = new MyClass(4, 3);
		MyClass m3 = new MyClass(5, 3);

		Function<MyClass, Boolean> j = i -> m1.equals(i);
		System.out.println(j.apply(m2));
		System.out.println(j.apply(m3));

		Function<MyClass, Boolean> k = m1::equals;
		System.out.println(k.apply(m2));
		System.out.println(k.apply(m3));

		Supplier<MyClass> s = MyClass::new; //기본생성자
		System.out.println(s.get());
		
		Function<Integer, MyClass> t = MyClass::new; //매계변수가 있는 생성장
		System.out.println(t.apply(10));
		
		BiFunction<Integer, Integer, MyClass> u = MyClass::new;
		System.out.println(u.apply(10, 30));
		
		Function<Integer, int[]> v = int[]::new;
		System.out.println(Arrays.toString(v.apply(5)));
	}// main

}// class
