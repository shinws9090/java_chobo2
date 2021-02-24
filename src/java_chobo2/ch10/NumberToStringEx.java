package java_chobo2.ch10;

//문자 형변환
import java.text.DecimalFormat;
import java.text.ParseException;

public class NumberToStringEx {

	public static void main(String[] args) throws ParseException {
//		extracted();
		// 패턴  : #,###
		//  1234567    > format(패턴)  > "1,234,567"
		// "1,234,567" > parse(패턴)   >  1234567

		int salary = 12345678;

		// 숫자 >> 문자 (format)
		DecimalFormat df = new DecimalFormat("#,###.#");
		System.out.println(df.format(salary));

		System.out.printf("%,d", salary);
		System.out.println();

		String str = String.format("%,d", salary);

		System.out.println(str);

		String strDb1 = String.format("%.2f", 1234.56);

		System.out.println(strDb1);

		// 문자 >> 숫자 (parse)
		String strNum = "123,456";
		DecimalFormat df2 = new DecimalFormat("0,000");
		System.out.println(df.parse(strNum));

		Number num = df.parse(strNum);
		int i = num.intValue();
		System.out.println(i);

	}

	public static void extracted() throws ParseException {
		double number = 1234567.89;
		System.out.println("number >" + number);

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,###.#");

		String str = df.format(number);

		System.out.println(str);

		df.applyPattern("000000000.0");
		System.out.println(df.format(number));

		df.applyPattern("##########.#");
		System.out.println(df.format(number));

		df.applyPattern("#.#E0"); // 1234567.89 => 1.2*10^6
		System.out.println(df.format(number));

		// 반대
		Number numberStr = df.parse("1.2E6");
		Double d = numberStr.doubleValue();
		System.out.println(d);

		df.applyPattern("#,###.0");
		numberStr = df.parse("123,456.55");
		d = numberStr.doubleValue();
		System.out.println(d);
	}

}
