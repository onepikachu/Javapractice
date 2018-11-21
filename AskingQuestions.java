import java.util.Scanner;

public class AskingQuestions
{
	public static void main(String[] args)
	{
		Scanner Keybord = new Scanner(System.in);

		int age;
		String height;
		double weight;

		System.out.print("How old are you? ");
		age = Keybord.nextInt();

		System.out.print("How tall are you? ");
		height = Keybord.next();

		System.out.print("How much do you weight? ");
		weight = Keybord.nextDouble();

		System.out.println("So you are " + age + " old, " + height + " tall and " + weight + " heavy.");
	}
}


