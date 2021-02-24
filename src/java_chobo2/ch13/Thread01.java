package java_chobo2.ch13;

public class Thread01 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
