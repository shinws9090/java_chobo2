package java_chobo2.ch12;

import java.util.ArrayList;
import java.util.Iterator;

class Product{}
class Tv extends Product{}
class Audio extends Product{}


public class TestMain2 {
	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>();
//		ArrayList<Product> listProduct = new ArrayList<Tv>(); //불가능 제네릭스에서 클래스의 상속관계는 안따라감 , 별계의 클래스로 인식함
		ArrayList<Product> listProduct = new ArrayList<>(); 
		
		list.add(new Tv());
		
		listProduct.add(new Product());
		listProduct.add(new Tv());   //넣는 객체타입은 상속관계라서 가능함
		listProduct.add(new Audio());
		
		
		Iterator<Product> it = listProduct.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
