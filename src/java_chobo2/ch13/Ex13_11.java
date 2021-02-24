package java_chobo2.ch13;

class Thread11_1 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i <300;i++)	{
			System.out.print("-");
		}
		System.out.println();
	}
}

class Thread11_2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println();
	}
}


public class Ex13_11 {
	public static void main(String[] args) {
		Thread11_1 th1 = new Thread11_1();
		Thread11_2 th2 = new Thread11_2();
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
	}
}
