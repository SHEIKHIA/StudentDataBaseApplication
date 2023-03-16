package sheikh.student.database.app;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance;
	private static  int costOfCourse = 1100;
	private static int id = 00000000;
	
	
	//constructor
	
		public Student () {
			
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter student first name: ");
			this.firstName = in.nextLine();
			
			System.out.print("Enter student last name:");
			this.lastName = in.nextLine();
			
			System.out.print("1 - FresMen\n2 - Sophomore\n3 - Jusnior\4 - Enter student classt level: ");
			this.gradeYear = in.nextInt();
			
			//System.out.println(firstName + " "+ lastName + " "+gradeYear + "studentID");
			
			setStudentID();

	}
		
		// generate id;
		
		private void setStudentID() {
			id++;
			this.studentID = gradeYear +"" +id;
		}
		
		//Enroll in courses
		
		public void enroll() {
			
			do {
				System.out.print("Enter course to enroll (Q TO Quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q")) {
					courses = courses + "\n" + course;
					tutionBalance = tutionBalance + costOfCourse;
				}
				else {
					System.out.println("BREAK");
					break;
				}
			}
			while(1 !=0);
			
			//System.out.println("Enrolled in: "+ courses);
			//System.out.println("Tution Balance: "+ tutionBalance);
		}
		
		//view balance;
		
		public void viewBalance() {
			
			System.out.println("Your balance is: $" + tutionBalance);
		}
		
		
		//pay tuition;
		public void payTuition() {
			viewBalance();
			System.out.print("Enter your payment: $");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tutionBalance = tutionBalance - payment;
			System.out.println("Thank you for your payment of $: "+payment);
			viewBalance();

		}
		
		
		//show status;
		
		public String showInfo() {
			
			return "Name: " + firstName +" "+lastName +"\nStudent ID: "+studentID+ "\nGrade level: "+gradeYear +"\nCourse Enrolled: "+courses +"\nBalance: $"+tutionBalance;
			
		}
	

}
