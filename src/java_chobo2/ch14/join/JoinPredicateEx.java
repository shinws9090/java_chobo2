package java_chobo2.ch14.join;

import java.util.function.Predicate;

public class JoinPredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> p1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t < 100;
			}
		};

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;

		Predicate<Integer> notP = p.negate();
		System.out.println(p.test(101) + " : " + p.test(99));
		System.out.println(notP.test(101) + " : " + notP.test(99));

		Predicate<Integer> all = notP.and(q).or(r); // ((i >=100) && (i <200))||(i%2 ==0)

		System.out.println(all.test(201) + " : " + all.test(101) + " : " + all.test(98));

		Predicate<Integer> all2 = notP.and(q.or(r)); // (i >=100) && ((i <200)||(i%2 ==0))

		System.out.println(all2.test(201) + " : " + all2.test(101) + " : " + all2.test(98));
		
		String str1	 = "abc";
		String str2	 = "abc";
		
		Predicate<String> pEq = Predicate.isEqual(str1);	
		boolean result = pEq.test(str2);
		System.out.println(result);
		
		result = Predicate.isEqual(str1).test(str2);
		System.out.println(result);
	}
}
