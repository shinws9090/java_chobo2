package java_chobo2.ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx02 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		System.out.println(list);
		// 정렬(abc순)
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); // 해쉬코드 정렬
			}
		};
		Collections.sort(list, comp);
		System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));//간단하네
		System.out.println(list);
	}
}
