package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.Comparator;


class Department{
	int deptNo;
	String deptName;
	int floor;
	
	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public Department(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department [%s, %s, %s]", deptNo, deptName, floor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptNo != other.deptNo)
			return false;
		return true;
	}
	
	
	
}


public class ArrayListEx {
	public static void main(String[] args) {
//		extracted01();
		
		ArrayList<Department> deptList = new ArrayList<Department>();
		
		deptList.add(new Department(1, "기획", 20));
		deptList.add(new Department(2, "개발", 10));
		deptList.add(new Department(3, "인사", 30));
		
		prnList(deptList);
		
		int idx = deptList.indexOf(new Department(2, "개발", 10));
		System.out.println("idx >"+idx);
		
		boolean con = deptList.contains(new Department(2, "개발", 10));
		System.out.println(con);
		
//		deptList.remove(new Department(2)); //equals오버라이딩 되어야 비교 가능함
//		prnList(deptList);
		
		Department upDept = new Department(2, "마케팅", 11);
		deptList.set(deptList.indexOf(upDept), upDept);
		prnList(deptList);
		
	}

	private static void prnList(ArrayList<Department> deptList) {
		for(Department d : deptList) {
			System.out.println(d);
		}
		System.out.println();
	}

	public static void extracted01() {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		System.out.println(arList);
		
		
		//추가
		arList.add(10); // auto_boxing
		arList.add(20);
		System.out.println(arList);
		System.out.println(arList.size()); //사이즈
		
		arList.add(1,40);
		System.out.println(arList);
		System.out.println(arList.size());
		
		System.out.println("40 indexOf  "+arList.indexOf(40));
		//삭제
		arList.remove(1);
		System.out.println(arList);
		System.out.println(arList.size());
		
		arList.add(50);
		arList.add(60);
		System.out.println(arList);
		
		arList.remove(new Integer(50));
		System.out.println(arList);
		
		//순회
		for(int a : arList) { // auto_unboxing
			System.out.println(a);
		}
		
		for(int i = 0 ; i< arList.size();i++) {
			System.out.println(arList.get(i));
		}
		//변경
		arList.set(1, 40);
		System.out.println(arList);
		
		//존제 여부 확인
		if(arList.contains(30)) {
			System.out.println("30있음");
		}else {
			System.out.println("30없음");
		}
		
		System.out.println(arList.contains(60));
		
		//정렬
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("aa");
		strList.add("cd");
		strList.add("be");
		
		System.out.println(strList);
		
		strList.sort(new Comparator<String>() { //String타입은 헤쉬코드로 정렬가능  a>>97 b>>98 c>>99
			@Override
			public int compare(String o1, String o2) {
				return o1.hashCode() - o2.hashCode(); // a-b >>97-98
			}
		});
		
		System.out.println(strList);
		
		
		
	}
}
