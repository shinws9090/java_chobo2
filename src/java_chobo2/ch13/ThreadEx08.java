package java_chobo2.ch13;

class Thread05	extends Thread{
	@Override
	public void run() {
		while(!isInterrupted()) {
			System.out.println("a");
		}
		System.out.println("end");
	}
}


public class ThreadEx08 {
	public static void main(String[] args) throws InterruptedException {
		Thread05 t = new Thread05();
		t.start();
		
		Thread.sleep(3000);
		t.interrupt();
	}
}
