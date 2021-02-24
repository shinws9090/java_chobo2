package java_chobo2.ch13;

public class ThreadEx01 {
	public static void main(String[] args) throws InterruptedException {
		Thread01 th1 = new Thread01();
		th1.start(); //메모리 공간 할당후 동시수행
//		th1.run(); //그냥 하나의 공간에서 호출
		
		Thread02 run = new Thread02();
		Thread th2 = new Thread(run);
		th2.start();
		
		
		for(int i = 0; i<10;i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
		
		System.out.println("Done.");
	}
}
