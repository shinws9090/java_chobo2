package java_chobo2.ch12;

class Parent{
	void parentMethod() {}
}

class Child extends Parent{
//	@Override
//	void parentMethod2() {} //오버라이드 애너테이션으로 에러 발생
}


@SuppressWarnings("serial")
public class Ex extends Exception {

}
