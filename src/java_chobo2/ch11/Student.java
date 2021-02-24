package java_chobo2.ch11;

public class Student implements Comparable<Student>{
	private int stdNo; // 학번
	private String name; // 성명
	private int kor;
	private int eng;
	private int math;

	public Student() {
	}

	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	public Student(int stdNo, String name) {
		this.stdNo = stdNo;
		this.name = name;
	}

	public Student(int stdNo, String name, int kor, int eng, int math) {
		this.stdNo = stdNo;
		this.name = name;
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public double avg() {
		return total() / 3D;
	}

	@Override
	public String toString() {
		return String.format("%3d %5s %3d %3d %3d %3d %.1f", stdNo, name, kor, eng, math, total(), avg());
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdNo;
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
		Student other = (Student) obj;
		if (stdNo != other.stdNo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return this.stdNo - o.stdNo;
	}

}
