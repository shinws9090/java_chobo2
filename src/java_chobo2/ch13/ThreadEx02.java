package java_chobo2.ch13;

public class ThreadEx02 { //싱글쓰레드
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		for(int i = 0; i<300; i++) {
			System.out.printf("%s",new String("-"));
		}
		
		System.out.println();
		System.out.printf("%s %d 초%n","처음작업 시간:",System.currentTimeMillis() - startTime);
		
		for(int i = 0 ; i <300; i++) {
			System.out.printf("%s","|");
		}
		System.out.println();
		System.out.printf("%s %d 초%n","두번작업 시간:",System.currentTimeMillis() - startTime);
	}
}
