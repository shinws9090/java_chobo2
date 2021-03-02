package java_chobo2.ch14;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionEx {
	public static void main(String[] args) {
		BiConsumer<String, Integer> bic = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				if (t.length() == u) {
					System.out.println("같음");
				} else {
					System.out.println("다름");
				}
			}
		};
		bic.accept("acd", 2);
		bic.accept("acd", 3);

		BiConsumer<String, Integer> bic01 = (t, u) -> {
			if (t.length() == u) {
				System.out.println("같음");
			} else {
				System.out.println("다름");
			}
		};
		bic01.accept("sdfg", 3);
		bic01.accept("sdfg", 4);

		BiPredicate<String, String> bip = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};
		System.out.println(bip.test("abc", "ab"));
		System.out.println(bip.test("abc", "abc"));

		BiPredicate<String, String> bip01 = (t, u) -> t.equals(u);
		System.out.println(bip01.test("abc", "ab"));
		System.out.println(bip01.test("abc", "abc"));

		BiFunction<Integer, Integer, String> bif = new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer t, Integer u) {
				if (t == u) {
					return "true";
				} else {
					return "false";
				}
			}
		};
		System.out.println(bif.apply(5, 7));
		System.out.println(bif.apply(7, 7));

		BiFunction<Integer, Integer, String> bif01 = (t, u) -> t == u ? "true" : "false";
		System.out.println(bif.apply(5, 7));
		System.out.println(bif.apply(7, 7));

	}

}
