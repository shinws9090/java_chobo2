package java_chobo2.ch14;

import java.util.function.Predicate;

public class FunctionPredicateEx04 { // 함수도 매계변수로 쓸수잇게 만든다
	public static void main(String[] args) {
		String[] strArr = { "", "ab", "", "abc", "def","","" };

		Predicate<String> isEmptyStr = s -> s.length() == 0;

		int cnt = 0;
		for (String str : strArr) {
			if (isEmptyStr.test(str)) {
				cnt += 1;
			}
		}
		System.out.println("공백 문자열의 개수 : " + cnt);
	}

}
