package java_chobo2.ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializableEx {
	/**
	 * 역질렬화 예제
	 */
	public static void main(String[] args) {
		String fileName = "userInfo.ser";
		
		try(FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis)){
			
//			UserInfo u1 = (UserInfo)ois.readObject();
//			UserInfo u2 = (UserInfo)ois.readObject();
			ArrayList<UserInfo> list =(ArrayList<UserInfo>)ois.readObject();;
			
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
