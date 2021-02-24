package java_chobo2.ch13;

import javax.swing.JOptionPane;

public class ThreadEx04 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무거나 입력");
		System.out.println("입력한 값은"+input+"입니다.");
		
		for(int i = 10 ; i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
