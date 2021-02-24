package java_chobo2.ch13;



class RunImplEx10 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}



public class Ex13_10 {
public static void main(String[] args) {
	RunImplEx10 r = new RunImplEx10();
	Thread t1 = new Thread(r,"*");
	Thread t2 = new Thread(r,"**");
	Thread t3 = new Thread(r,"***");
	
	//덜함
	
	
	
	
}
}
