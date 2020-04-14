package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"You are a hero in a magical world.\r\n"+
											"There is a evil lord threatening the safety of the entire world.\r\n");
		String question = JOptionPane.showInputDialog("Will you stop him and save the world?");
			if (question.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "You decide to try and save the world.\r\n"+
													"And Since you are a hero, you need a sword worthy of one");
				JOptionPane.showMessageDialog(null, "As you are thinking about how to stop the evil lord,\r\n"+
													"you stumble on a rock");
				JOptionPane.showMessageDialog(null, "You get up, a bit agitated, and realize that a sword was lodged into the rock you tripped over");
				String excalibur = JOptionPane.showInputDialog("Do you pick it up?");
					if (excalibur.equals("Yes")) {
						JOptionPane.showMessageDialog(null,"Congradulations, you just got the legendary sword, Excalibur!");
						JOptionPane.showMessageDialog(null, "The evil lord tries to attack, \r\n"+
															"However, you with your holy sword, annihilate the evil lord and his minions.");
						JOptionPane.showMessageDialog(null, "Congradulations, you saved the universe.");
					}
					else if (excalibur.equals("No")) {
						JOptionPane.showMessageDialog(null,"You decide not to retrieve the sword");
						JOptionPane.showMessageDialog(null,"The evil lord decide to attack. \r\n"+
															"You, unprepared get overtaken by the evil lord.");
						JOptionPane.showMessageDialog(null, "The evil lord takes over the world");
					
					}
			}
			else if (question.equals("No")) {
				JOptionPane.showMessageDialog(null, "Your world got taken over by the evil lord.\r\n"+
													"Oh Well");
			}
		
		
	}
}
