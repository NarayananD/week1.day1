package week1.day1;

public class Student {
	String Name = "Narayanan Swamy";
	int Rollno = 123456;

	public void college() {
		String Collegename = "Madras university";
		System.out.println(Collegename);
	}

	public void collegecode() {
		int collegecode = 987654;
		System.out.println(collegecode);
	}

	public void collegedetails() {
		String Name = "Narayanan Swamy";
		System.out.println(Name);
		int Rollno = 123456;
		System.out.println(Rollno);
	}

	public static void main(String[] args) {
		Student details = new Student();
		details.college();
		details.collegecode();
		details.collegedetails();
		// System.out.println(details);
	}
}
