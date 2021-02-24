package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentManagement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Student> students = new HashMap<Integer, Student>();

		initial(students);

		System.out.println("학생관리 프로그램");
		int choice;
		do {
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addStudent(students, sc);
				break;
			case 2:
				modifyStudent(students, sc);
				break;
			case 3:
				deleteStudent(students, sc);
				break;
			case 4:
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();

	}

	private static void deleteStudent(HashMap<Integer, Student> students, Scanner sc) {
		prnStudent(students);
		System.out.print("삭제하고자하는 학생번호 입력 > ");
		int delStdNo = sc.nextInt();

		Student delStd = new Student(delStdNo);
		
		if (!students.containsValue(delStd)) {
			System.out.println("해당 하는 학생이 존재하지 않음");
		}

		students.remove(delStd.getStdNo());

	}

	private static void modifyStudent(HashMap<Integer, Student> students, Scanner sc) {
		// 1. 학생번호 입력
		// 2. 해당 위치에 입력받은 학생정보를 변경
		prnStudent(students);
		System.out.print("수정하고자하는 학생번호 입력 > ");
		Student a = new Student(sc.nextInt());

		if (!students.containsValue(a)) {
			System.out.println("해당 하는 학생이 존재하지 않음");
			return;
		}
		Student newStd = createStudent(sc);
		students.remove(a.getStdNo());
		students.put(newStd.getStdNo(), newStd);
				
			
		
	}

	private static void addStudent(HashMap<Integer, Student> students, Scanner sc) {
		// 1. 저장된 학생수 입력 or 종료
		// 2. 추가할 위치를 검색
		// 3. 추가할 학생정보를 입력
		Student newStd = createStudent(sc);

		students.put(newStd.getStdNo(), newStd);
	}

	private static Student createStudent(Scanner sc) {
		System.out.println("학생 정보를 입력하세요. ex) 번호 성명 국어 영어 수학 ");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		return new Student(stdNo, name, kor, eng, math);
	}

	private static void prnStudent(HashMap<Integer, Student> students) {
		Iterator<Entry<Integer, Student>> i = students.entrySet().iterator();
		for (; i.hasNext();) {
			System.out.println(i.next());
		}
		System.out.println();
	}

	private static void initial(HashMap<Integer, Student> students) {
		students.put(1, new Student(1, "전수린", 90, 90, 90));
		students.put(2, new Student(2, "김상건", 91, 91, 91));
		students.put(3, new Student(3, "이태훈", 92, 92, 92));
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
