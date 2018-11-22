import java.util.Scanner;

public class MoreUserInputofData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the following information so I can sell it for a profit!");

		System.out.print("First name: ");

		String fname = keyboard.next();

		System.out.print("Last name: ");
		
		String lname = keyboard.next();

		System.out.print("Grade (9-12): ");

		int grade = keyboard.nextInt();

		System.out.print("Student ID: ");

		int id = keyboard.nextInt();

		System.out.print("Login: ");

		String login = keyboard.next();

		System.out.print("GPA (0.0-4.0): ");

		double gpa = keyboard.nextDouble();

		System.out.println("Your Information: ");

		System.out.println("	Login: " + login);
		System.out.println("	ID: " + id);
		System.out.println("	Name: " + fname+ "," + lname);
		System.out.println("	GPA: " + gpa);
		System.out.println("	Grade: " + grade);
	}
}

