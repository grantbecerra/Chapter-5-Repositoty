package exercises;

import java.util.Scanner;

public class SwitchStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int user;

Scanner input = new Scanner(System.in);

System.out.print("Please enter your student number >>>");
user = input.nextInt();

switch(user)
{
case 311508:
	System.out.println("Hello Keegan");
	break;
case 132043:
	System.out.println("Hello Alyssa");
	break;
case 201524:
	System.out.println("Hello Dylan");
	break;
case 131512:
	System.out.println("Hello Austin");
	break;
case 179978:
	System.out.println("Hello Braden");
	break;
case 138455:
	System.out.println("Hello Chance");
	break;
case 3138455:
	System.out.println("Hello Aaron");
	break;
case 317737:
	System.out.println("Hello Steven");
	
}
	}
}
