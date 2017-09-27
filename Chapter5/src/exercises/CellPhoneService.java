package exercises;

import javax.swing.JOptionPane;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData;
		String strMessage;
		String strMinutes;
		int text;
		int minutes;
		double data;
		strData = JOptionPane.showInputDialog(null, "How much data do you need in megabytes?", "Data", JOptionPane.INFORMATION_MESSAGE);
		strMinutes = JOptionPane.showInputDialog(null, "How many minutes do you need?" ,"Minutes", JOptionPane.INFORMATION_MESSAGE);
		strMessage = JOptionPane.showInputDialog(null, "How many texts do you need?","Texts", JOptionPane.INFORMATION_MESSAGE);

		text = Integer.parseInt(strMessage);
		minutes = Integer.parseInt(strMinutes);
		data = Double.parseDouble(strData);
		
		if (minutes <= 500 && text == 0 && data == 0)
		{
			System.out.println("You need Plan A $49 a month");
		}
		if (minutes <= 500 && text >= 1000 && data == 0)
		{
			System.out.println("You need Plan B $55 a month");
		}
		if (minutes >= 500 && text <= 100 && data == 0)
		{
			System.out.println("You need Plan C $61 a month");
		}
		if (minutes >= 500 && text >= 100 && data == 0)
		{
			System.out.println("You need Plan D $70 a month");
		}
		if (minutes >= 500 && text >= 100 && data <= 2000)
		{
			System.out.println("You need Plan E $79 a month");
		}
		if (minutes >= 500 && text >= 100 && data >= 2000)
		{
			System.out.println("You need Plan F $87 a month");
		}
	}
}
