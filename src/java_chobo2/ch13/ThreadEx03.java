package java_chobo2.ch13;


class Thread04 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i <300; i++) {
			System.out.printf("%s","|");
		}
		System.out.println();
		System.out.printf("%s %d 초%n","2작업 시간:",System.currentTimeMillis() - ThreadEx03.startTime);
		
	}
}



public class ThreadEx03 {  //멀티쓰레드
	static long startTime = 0;

	public static void main(String[] args) {
		Thread04 th = new Thread04();
		th.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i<300; i++) {
			System.out.printf("%s","-");
		}
		
		System.out.println();
		System.out.printf("%s %d 초%n","1작업 시간:",System.currentTimeMillis() - ThreadEx03.startTime);
		
	}
}
