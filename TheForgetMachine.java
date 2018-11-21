import java.util.Scanner;
public class TheForgetMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a word!");
		String word = keyboard.next();
		System.out.println("Give me a second word!");
		String sword = keyboard.next();
		System.out.println("Great, now your favorite number?");
		int number_1 = keyboard.nextInt();
		System.out.println("And your second-favorite number ..");
		int number_2 = keyboard.nextInt();

		System.out.println("Whew! Wasn't that fun");
	}
}
