import java.util.Scanner;
public class aLittleQuize
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Are you ready for a quize? ");
		String tans = new String("N");
		String ans = keyboard.next();
		if (ans.equals(tans))
		{
			System.out.println("Ok, here it comes!");

			System.out.println("Q)1 What is the capital of Alaska?");
			System.out.println("		1) Melbourne");
			System.out.println("		2) Anchorage");
			System.out.println("		3) Juneau");
			int choice = keyboard.nextInt();
			int count = 0;

			if (choice == 3)
			{
				System.out.println("That's right!");
				count +=1;
			}
			else
			{
				System.out.println("Wrong answer.");
			}

			System.out.println("Q)2 Can you store value 'cat' in a variable type of int?");
			System.out.println("		1) yes");
			System.out.println("		2) no");

			choice = keyboard.nextInt();
			if (choice == 2)
			{
				System.out.println("Good choice");
				count += 1;
			}
			else
			{
				System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
			}
			System.out.println("Overall, you got " + count + " out of 2 correct.");
		}
	}
}
