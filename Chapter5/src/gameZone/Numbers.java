package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int n = rand.nextInt(7) + 1;
		String pick;
		int real;
		
		pick = JOptionPane.showInputDialog(null, " please pick a number 1-7");
		real = Integer.parseInt(pick);
	if(n == 3)
	{
		if(real == 1) {
			JOptionPane.showMessageDialog(null, "You picked 1. Low");
		}
		if(real == 2) {
			JOptionPane.showMessageDialog(null, "You picked 2. Low");
		}
		if(real == 3) {
			JOptionPane.showMessageDialog(null, "You picked 3. You win");
		}
		if(real == 4) {
			JOptionPane.showMessageDialog(null, "You picked 4. High");
		}
		if(real == 5) {
			JOptionPane.showMessageDialog(null, "You picked 5. High");
		}
		if(real == 6) {
			JOptionPane.showMessageDialog(null, "You picked 6. High");
		}
		if(real == 7) {
			JOptionPane.showMessageDialog(null, "You picked 7. High");
		}
	
	if(n == 7)
	{
		if(real == 1) {
			JOptionPane.showMessageDialog(null, "You picked 1. Low");
		}
		if(real == 2) {
			JOptionPane.showMessageDialog(null, "You picked 2. Low");
		}
		if(real == 3) {
			JOptionPane.showMessageDialog(null, "You picked 3. Low");
		}
		if(real == 4) {
			JOptionPane.showMessageDialog(null, "You picked 4. Low");
		}
		if(real == 5) {
			JOptionPane.showMessageDialog(null, "You picked 5. Low");
		}
		if(real == 6) {
			JOptionPane.showMessageDialog(null, "You picked 6. Low");
		}
		if(real == 7) {
			JOptionPane.showMessageDialog(null, "You picked 7. You win");
		}
	if (n == 5)
	{	
	
		if(real == 1) {
			JOptionPane.showMessageDialog(null, "You picked 1. Low");
		}
		if(real == 2) {
			JOptionPane.showMessageDialog(null, "You picked 2. Low");
		}
		if(real == 3) {
			JOptionPane.showMessageDialog(null, "You picked 3. Low");
		}
		if(real == 4) {
			JOptionPane.showMessageDialog(null, "You picked 4. Low");
		}
		if(real == 5) {
			JOptionPane.showMessageDialog(null, "You picked 5. You win");
		}
		if(real == 6) {
			JOptionPane.showMessageDialog(null, "You picked 6. High");
		}
		if(real == 7) {
			JOptionPane.showMessageDialog(null, "You picked 7. High");
		}
		}
	}
	}
	}
}
