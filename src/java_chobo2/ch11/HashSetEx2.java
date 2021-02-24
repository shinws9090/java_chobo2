package java_chobo2.ch11;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
	@Override  //간단화
	public int hashCode() {
		return (name + age).hashCode();
	}
	@Override  //간단화
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person object = (Person) obj;
			if(this.name.equals(object.name)&&this.age == object.age) {
				return true;
			}
		}
		return false;
	}
	
}


public class HashSetEx2 {
	public static void main(String[] args) {
//		hashCodeAndEquals();
		Person p1 = new Person("전수린",40);
		Person p2 = new Person("전수린",40);
		Person p3 = new Person("우정아",40);
		Person p4 = new Person("정민강",30);
		
		HashSet<Person> ban = new HashSet<Person>();
		ban.add(p1);
		System.out.println("size : "+ ban.size());
		ban.add(p2);
		System.out.println("size : "+ ban.size());
		ban.add(p3);
		System.out.println("size : "+ ban.size());
		ban.add(p4);
		System.out.println("size : "+ ban.size());

	}

	public static void hashCodeAndEquals() {
		Person p1 = new Person("전수린",40);
		
		int hasCode1 = p1.hashCode();
		int hasCode2 = p1.hashCode();
		
		System.out.printf("%d = %d %n",hasCode1,hasCode2);
//		p1.age = 30;
		
		int hasCode3 = p1.hashCode();
		System.out.println("hasCode3 " + hasCode3);
		
		
		Person p2 = new Person("전수린",40);
		
		int hasCode4 = p2.hashCode();
		System.out.println("hasCode4 "+ hasCode4);
		
		boolean isEquals = p1.equals(p2);
		System.out.println("p1==p2 : "+ isEquals);
	}

}
