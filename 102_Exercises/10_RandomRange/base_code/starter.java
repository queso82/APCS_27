/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number"); 
		Scanner bru = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int y = bru.nextInt();
		Scanner bar = new Scanner(System.in);
		
		System.out.print("Please enter another integer (bigger than the first): ");
		int z = bar.nextInt();
		System.out.print("Your range is ");
		System.out.print(y);
		System.out.print(" to ");
		System.out.println(z);
        System.out.println("Here are 5 numbers generated in that range.");
		int qq = (int)(Math.random() * (z-y)+y);

		System.out.print(qq);
		System.out.print(", ");
		int we = (int)(Math.random() * (z-y)+y);
		int sq = (int)(Math.random() * (z-y)+y);
		int eq = (int)(Math.random() * (z-y)+y);
		int tq = (int)(Math.random() * (z-y)+y);
		System.out.print(we);
		System.out.print(", ");
		System.out.print(sq);
		System.out.print(", ");
		System.out.print(eq);
		System.out.print(", ");
		System.out.println(tq);
	}   
}
