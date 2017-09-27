package tutorials;

import javax.swing.JOptionPane;

public class EvenOdd 
{
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int one;
		String str;
		
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		one = Integer.parseInt(str);
		
		if ( one % 2 == 0 )
			System.out.println("You entered an even number");
		else
			System.out.println("You entered an odd number");
				
	
	}

}
