package java_chobo2.ch14;

@FunctionalInterface  //추상매서드를 무조껀 하나만 가지게 하는 설정
interface MyFunction{
	void myMethod();
}

public class LambdaEx03 { // 함수도 매계변수로 쓸수잇게 만든다
	public static void main(String[] args) {
		MyFunction f = () -> System.out.println("myMethod");
		aMethod(f);
		
		aMethod(() -> System.out.println("myMethod"));
	}
	
	public static void aMethod(MyFunction f) {
		f.myMethod();
	}

}
