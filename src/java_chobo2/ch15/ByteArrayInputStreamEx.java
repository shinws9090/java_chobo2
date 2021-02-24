package java_chobo2.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayInputStreamEx {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  //바이트 범위 -128~127
		byte[] outSrc = null;
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = bais.read())!= -1) { //끝까지가면 -1 이된다 그래서 조건식이 저런거임
			
			baos.write(data);
			
		}
		
		outSrc = baos.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Input Source : " + Arrays.toString(outSrc));
	}
}
