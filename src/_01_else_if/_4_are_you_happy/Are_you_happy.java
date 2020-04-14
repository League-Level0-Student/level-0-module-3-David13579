package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.contentEquals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep whatever you are doing");
		}
		else if(answer.equals("No")) {
			String happy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (happy.equals("Yes")) {
				JOptionPane.showMessageDialog(null,"Change something");
			}
			else if (happy.equals("No")) {
				JOptionPane.showMessageDialog(null,"Keep whatever you are doing");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Please type Yes or No");
		}
		
		
		
	}
}
