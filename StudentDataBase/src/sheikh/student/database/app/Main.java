package sheikh.student.database.app;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student [numOfStudents];
		
		
		for (int n = 0; n < numOfStudents; n++) {
		students[n] = new Student();
		students[n].enroll();
		students[n].payTuition();
		
		}
		for (int n = 0; n < numOfStudents; n++) {
		System.out.println(students[n].toString());

	}

}
	}
