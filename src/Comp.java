import java.util.Comparator;

public class Comp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Student so1 = (Student) o1;
		Student so2 = (Student) o2;
		int res = so1.getScore() > so2.getScore() ? 1 : (so1.getScore() == so2.getScore() ? 0 : -1);

		return res;

	}

}
