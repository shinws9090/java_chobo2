package java_chobo2.ch13;

public class Thread03 implements Runnable {
	static boolean autoSave = false;
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (autoSave) {
				autoSave();
			}
		}
		
	}

	static void autoSave() {
		System.out.println("자동저장 되었습니다.");
	}

}
