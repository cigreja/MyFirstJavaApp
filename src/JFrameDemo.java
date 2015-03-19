/**
 * Assignment a1 
 * First Java Application
 * Author:  Carlos Igreja
 * Due date: 3/15/2015
 * 
 * Description: I found my first this application. It must have been one of 
 *              my first Java Classes. It was a console applicaiton so I made
 *              it a gui to display on crossplatform.
 */



import java.awt.*;
import javax.swing.*;

public class JFrameDemo extends JFrame {

	public JFrameDemo() {
		super("MyFirstJavaApp");
		setSize(375,200);
		setVisible(true);
                setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 375, 200);
		g.setColor(Color.GREEN);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		//g.drawString("Do you drink Java?", 60, 200);
                
                // Print a blank line
                //System.out.println();

                // Your first name
                //System.out.println("Carlos");
                g.drawString("Carlos Igreja", 20, 75);

                // The name of the operating system you are using
                //System.out.println("Microsoft Windows 7 Home Premium");
                g.drawString("Microsoft Windows 7 Home Premium", 20, 100);

                // The name of your project (or simply the folder name if not using the IDE)
                //System.out.println("HW1");     
                g.drawString("HW1", 20, 125);

                // The name of the class that contains the main() method in your source file.
                //System.out.println("MyFirstJavaApp"); 
                g.drawString("MyFirstJavaApp", 20, 150);
		
	}
	
	public static void main(String[] args){
		new JFrameDemo();
	}
	
}
