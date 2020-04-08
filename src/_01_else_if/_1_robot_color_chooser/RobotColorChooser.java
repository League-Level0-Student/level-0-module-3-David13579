
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)

		//3. Set the pen width to 10
		rob.setPenWidth(10);
		rob.hide();
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.contentEquals("Red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.contentEquals("Orange")) {
			rob.setPenColor(255, 186, 10);
		}
		else if(color.contentEquals("Yellow")) {
			rob.setPenColor(254, 255, 0);
		}
		else if(color.contentEquals("Green")) {
			rob.setPenColor(0,255,18);
		}
		else if(color.contentEquals("Blue")) {
			rob.setPenColor(0, 70, 255);
		}
		else if(color.contentEquals("Purple")) {
			rob.setPenColor(178, 0, 255);
		}
		else if(color.contentEquals("Black")) {
			rob.setPenColor(0,0,0);
		}
		else {
			rob.setRandomPenColor();
		}
		rob.setSpeed(10);
		rob.penDown();
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		}
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
