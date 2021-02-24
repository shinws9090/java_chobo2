package java_chobo2.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;import com.sun.javafx.cursor.StandardCursorFrame;

public class DateFormatEx {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 , MM월 , dd일 , E요일 , a , K시");
		System.out.println(sdf.format(today));
		
		String str = "2021년 , 02월 , 16일 , 화요일 , 오후 , 2시";
		sdf.applyPattern("yyyy년 , MM월 , dd일 ");
		System.out.println(sdf.parse(str));
	}
}
