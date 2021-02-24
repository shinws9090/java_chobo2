package java_chobo2.ch12;

import java.util.ArrayList;

public class Box<T> {
//	private ArrayList<T> list = new ArrayList<>();
	private ArrayList<T> list;
	
	public Box() {
		 list = new ArrayList<>();
	}
	public void add(T item) {
		list.add(item);
	}
	public T get(int idx) {
		return list.get(idx);
	}
	public ArrayList<T> getList() {
		return list;
	}
	
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return String.format("%s", list.toString());
	}
	
	
}
