package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceString;
		int doorChoice;
		int response = 1;
		while(response == 1) {
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, 3.",
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win Nothing!! HAHAHAHAHAHA");
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win less than Nothing! HAHAHAHA");
		}
		if(doorChoice ==3)
		{
			JOptionPane.showMessageDialog(null,"You win a brand new Huffy Bike! HAHAHAHAHA");
		}
		if(doorChoice == 999)
		{	
			JOptionPane.showMessageDialog(null, "You win the state of Iowa, the whole state.");
		}
		else
			JOptionPane.showMessageDialog(null, "tHAT NUMBER WAS NOT AN OPTION, i SAID 1-3. ");
		}		
	}
}
