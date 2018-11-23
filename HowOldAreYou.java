import java.util.*;
public class HowOldAreYou
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
		String name = keyboard.next();
		System.out.print("Ok, " + name + ", how old are you? ");
		int age = keyboard.nextInt();
		String message = new String();
		if (age < 16 & age >= 0) message = "You can't drive";
		else if (age >= 16 & age <= 17) message = "You can drive but not vote";
		else if (age >= 18 & age <= 24) message = "You can vote but not rent a car";
		else if (age >= 25) message = "You can do pretty much anything";
		else System.out.print("Input error");
		System.out.println( message + ", " + name + ".");
	}
}
