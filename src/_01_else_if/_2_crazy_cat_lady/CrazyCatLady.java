
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("How many Cats do you have?");
		// 2. Convert their answer into an int
		int number = Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (number >= 3) {
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady.");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		else if (number<3 && number >0) {
			playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		else {
			playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
		}
		
		
		
		
		
	}

	public static void playVideo(String videoID) {
		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't work on
		// some Linux implementations
        try{
		if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg-open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
		} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
		}	
            } catch (Exception e) {
				e.printStackTrace();
			}
	}
}

