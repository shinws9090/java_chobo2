package java_chobo2.ch15;

import java.io.Serializable;

public class UserInfo implements Serializable{
	/**
	 * 2021.02.25 버전 날짜
	 */
	private static final long serialVersionUID = 922167899509951820L; //클래스 버전
	private String name;
	private String password;
	private int age;

	public UserInfo() {
		this("Unknown", "1111", 0); // 기본값 초기화 프로잭트할때 참고해라
	}

	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("UserInfo [%s, %s, %s]", name, password, age);
	}

}
