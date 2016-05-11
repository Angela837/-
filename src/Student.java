
public class Student implements Comparable<Student> {
	private int stuNo;
	private double score;

	public Student(int stuNo, double score) {
		super();
		this.stuNo = stuNo;
		this.score = score;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {

		int res = 0;
		if (this.stuNo > o.stuNo)
			res = 1;
		else if (this.stuNo < o.stuNo)
			res = -1;
		else
			res = 0;

		return res;
	}

}
