package java_chobo2.ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableEx { //직렬화 ㄱㄱ
	public static void main(String[] args) {
		String filename = "UserInfo2.ser";
		
		try(FileOutputStream fos = new FileOutputStream(filename);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)){
			UserInfo u1 = new UserInfo("JavaMan","1234",30);
			UserInfo u2 = new UserInfo("JavaWoMan","4321",26);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);
			
			oos.writeObject(list.get(0));
			oos.writeObject(list.get(1));
			oos.writeObject(list);
			
			System.out.println("Done.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
