import javax.swing.*;

public class UsingSwingForInput
{
	public static void main( String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		System.out.printf("Hello, %s.", name);
		System.out.printf("Next year you will be %d.", (age + 1));
		System.exit(0);
	}
}
