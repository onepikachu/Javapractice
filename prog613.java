import javax.swing.*;
import java.awt.*;

public class prog613
{
	public static void main( String[] args)
	{
		Frame613 f = new Frame613();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

class Frame613 extends JFrame
{
	public Frame613()
	{
		setTitle("613 rocks!");
		setSize(300,200);
		setLocation(100,200);

		Pane1613 panel = new Pane1613();
		Container cp = getContentPane();
		cp.add(panel);
	}
}

class Pane1613 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hi", 75,100);
	}
}
