package tutorials;

import javax.swing.JOptionPane;

public class EvenOdd2  
{
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int one;
		String str;
		int response;
		while(response == 1 )
		{
		str = JOptionPane.showInputDialog(null, "Enter an integer");
		one = Integer.parseInt(str);
		
		if ( one % 2 == 0 )
			System.out.println("You entered an even number");
		else
			System.out.println("You entered an odd number");
				
System.out.println("would youl like to enter another number? 1 for Yes 2 for No >>>");
response = input.nextInt();

	}

}
}