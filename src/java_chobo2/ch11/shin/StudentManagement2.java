package java_chobo2.ch11.shin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class StudentManagement2 { //모범답안

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<Student>();
		initial(students);

		System.out.println("학생관리 프로그램");
		int choice;
		do {
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				prnInsert(students,sc);
				break;
			case 2:
				modifyStudent(students,sc);
				break;
			case 3:
				System.out.println("학생 삭제");
				deleteStudent(students,sc);
				break;
			case 4:
				System.out.println("학생 목록");
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();

	}

	private static void deleteStudent(ArrayList<Student> students, Scanner sc) {
		prnStudent(students);
		System.out.println("삭제 번호");
		int s = sc.nextInt();
		Student delStr = new Student(s);
		if(!students.contains(delStr)) {
			System.out.println("없다");
			return;
		}
		students.remove(delStr);
	}

	private static void modifyStudent(ArrayList<Student> students, Scanner sc) {
		//1. 학생번호 입력
		//2. 해당 위치에 입력받은 학생 정보를 변경	
		prnStudent(students);
		System.out.println("학생 번호 입력");
		Student upStr = new Student(sc.nextInt());
		int idx = students.indexOf(upStr);
		if(!students.contains(upStr)) {
			System.out.println("없다");
			return;
		}
		students.set(idx, createStydent(sc));
		
		
	}

	private static void prnInsert(ArrayList<Student> students,Scanner sc) {
		//1. 입력 /종룔
		//2. 위치
		//3. 입력
		Student newStr = createStydent(sc);
		if(students.contains(newStr)) {
			System.out.println("동일한 학생이 있습니다");
			return;
		}
		
		students.add(newStr);
	}

	private static Student createStydent(Scanner sc) {
		System.out.println("학생정보를 입력하시오.");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		return new Student(stdNo, name, kor, eng, math);
	}

	static void prnStudent(ArrayList<Student> students) {
		
		for (Student std : students) {
			System.out.println(std);
		}
		System.out.println();
	}

	private static void initial(ArrayList<Student> students) {
		students.add( new Student(1, "전수린", 90, 90, 90));
		students.add( new Student(2, "김상건", 91, 91, 91));
		students.add( new Student(3, "이태훈", 92, 92, 92));
	}

	private static void showMenu() {
		String[] m = new String[6];
		m[0] = "메뉴를 선택하새요.\n";
		m[1] = "1. 학생 추가\n";
		m[2] = "2. 학생 수정\n";
		m[3] = "3. 학생 삭제\n";
		m[4] = "4. 학생 목록\n";
		m[5] = "5. 종료\n";

		for (String str : m) {
			System.out.print(str);
		}
	}

	
}
