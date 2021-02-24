package java_chobo2.ch13;

class RunnableEx12_1 implements Runnable {

	@Override
	public void run() {
		while (Account.getBalance() > 0) {
			int money = 100;
			Account.withdraw(money);
			System.out.printf("balance1: %d%n ", Account.getBalance());
		}
	}

}
class RunnableEx12_2 implements Runnable {
	
	@Override
	public void run() {
		while (Account.getBalance() > 0) {
			int money = 100;
			Account.withdraw(money);
			System.out.printf("balance2: %d%n ", Account.getBalance());
		}
	}
	
}

class Account {
	static int balance = 1000;

	public static int getBalance() {
		return balance;
	}

	public synchronized static void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}

}

public class Ex13_12 {
	public static void main(String[] args) {
		Runnable r1 = new RunnableEx12_1();
		Runnable r2 = new RunnableEx12_2();
		new Thread(r1).start();
		new Thread(r2).start();

	}

}
