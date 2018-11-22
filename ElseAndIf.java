import java.util.Scanner;

public class ElseAndIf
{
	public static int gcd(int p, int q)
	{
		if (q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input an integer: ");
		int p = keyboard.nextInt();
		System.out.print("Please enter another integer: ");
		int q = keyboard.nextInt();
		int c = gcd(p,q);
		System.out.println("The great common divisor of " + p + " and " + q + " is " + c + ".");
	}
}
