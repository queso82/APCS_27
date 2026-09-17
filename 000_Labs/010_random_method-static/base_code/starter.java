/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x = (int)(Math.random()*9);
		int c = (int)(Math.random()*100+1);
		double o = (Math.random()*3.5+2.5);
		double p = (Math.random()*589+589);
		System.out.print(o);
		System.out.print(p);
		System.out.print("A number between 0 -9: "+x)
		System.out.print("A number between 1, -10: "+c)
		System.out.print("A number between 2.5 and 3.5: "+o)

	}
}
