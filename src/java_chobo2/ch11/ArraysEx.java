package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class ArraysEx {

	public static void main(String[] args) {
//		arrayToString();
//		arrayDeepToString();
//		arrayToEquals();
//		arrayToFill();
//		arrayToList();
//		ArrayToBinarySearchSort();

		Student[] strArr = { new Student(1,"이종윤",90,90,90), 
							 new Student(5,"김길현",80,79,68), 
							 new Student(3,"박유진",78,91,55), 
							 new Student(4,"김인환",99,60,40) };
		
		
		//기본은 학번순으로 정렬
		Arrays.sort(strArr);
		prnStudent(strArr);
		
		//국어점수 순으로 정렬
		Comparator<Student> comp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getKor() - o2.getKor();
			}
		};
		
		Arrays.sort(strArr, comp);
		prnStudent(strArr);
		
		
		//수학점수 별 정렬 역순
		Comparator<Student> revComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getMath() - o1.getMath();
			}
		};

		Arrays.sort(strArr, revComp);
		prnStudent(strArr);

	}

	private static void prnStudent(Student[] strArr) {
		System.out.println("정렬");
		for(Student s : strArr) {
			System.out.println(s);
		}
		System.out.println();
		
	}

	public static void ArrayToBinarySearchSort() {
		// 이분검색 (정렬 후 가능)
		int[] arr = { 10, 9, 5, 6, 7, 8, 1 };
		System.out.println(Arrays.binarySearch(arr, 9));

		long start = System.nanoTime();// 처리시간 반환
		System.out.println("start");
		Arrays.sort(arr);
		Arrays.parallelSort(arr); // 더빠른 처리속도
		long end = System.nanoTime() - start; // 처리시간 반환
		System.out.println("end :" + end);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 9));// 정렬후 가능
	}

	public static void arrayToList() {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4 };
		List<Integer> arList = Arrays.asList(intArr);

		for (int a : arList)
			System.out.println(a);

		arList.set(1, 6);
		System.out.println(arList);
		arList.add(10);
		System.out.println(arList);// 배열을가지고 만들엇기 때문에 추가는 못함

		ArrayList<Integer> al = new ArrayList<Integer>(arList); // ArrayList로 변경후 가능
		al.add(10);
		System.out.println(al);

	}

	public static void arrayToFill() {
		// 배열복사
		int[] intArr1 = { 1, 2, 3, 4, 5, 6 };
		int[] copyArr = Arrays.copyOf(intArr1, intArr1.length);
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.equals(intArr1, copyArr));

		// 길이까지 복사
		int[] capyArr = Arrays.copyOf(intArr1, 3);
		System.out.println(Arrays.toString(capyArr));

		// 값 체우기
		int[] newArr = new int[10];
		Arrays.fill(newArr, 10);
		System.out.println(Arrays.toString(newArr));

		// 함수로 체우기
		Arrays.setAll(newArr, (i) -> (int) (Math.random() * 100) + 1);
		System.out.println(Arrays.toString(newArr));

		Arrays.setAll(newArr, new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {
				return (int) (Math.random() * 1000) + 1;
			}
		});
		System.out.println(Arrays.toString(newArr));
	}

	public static void arrayToEquals() {
		// 배열 비교
		int[] intArr1 = { 1, 2, 3 };
		int[] intArr2 = { 1, 2, 4 };
		System.out.println(Arrays.equals(intArr1, intArr2));

		int[][] intTwoDimen1 = { { 1, 2 }, { 3, 4 } };
		int[][] intTwoDimen2 = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepEquals(intTwoDimen1, intTwoDimen2));
	}

	public static void arrayDeepToString() {
		// 이차원 배열 출력
		int[][] twoArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(twoArr));
		System.out.println(Arrays.deepToString(twoArr));
	}

	public static void arrayToString() {
		ArrayList<String> arList = new ArrayList<String>();

		arList.add("abc");
		arList.add("def");
		arList.add("ghi");

		// 바로출력
		System.out.println(arList); // toSting 내장

		// List -> array
		// 배열로 변경 , 오브잭트로 받기
		Object[] objArr = arList.toArray();
		String str = Arrays.toString(objArr);
		System.out.println(str);

		// 배열로 변경 , 생성해서 받기
		String[] strArr = new String[arList.size()];
		arList.toArray(strArr);
		System.out.println(Arrays.toString(strArr));

	}

}
