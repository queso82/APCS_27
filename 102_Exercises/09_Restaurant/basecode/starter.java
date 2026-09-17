/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner abc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("WELCOME RESTAURANT OWNER!");
        System.out.println("=================================================");
		System.out.println("What's the name of your restaurant?");
		String pickles = abc.nextLine();
		String lucy=(pickles);
        
		Scanner dbc = new Scanner(System.in);
		System.out.println("What's your name?");
		String chicken = dbc.nextLine();
		String oml = (chicken);
		System.out.print("Great to see you,");
		System.out.println(chicken);
		System.out.print("! Let's set up a menu for ");
		System.out.print(chicken);
		System.out.println("!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println("--- Item #1 ---");
		System.out.println("Item name: ");
		Scanner lbd = new Scanner(System.in);
		String cheese= lbd.nextLine();
		String lalida = (cheese);
		System.out.print("Price of ");
		System.out.print(cheese);
		System.out.print("($):");
		Scanner bdc = new Scanner(System.in);
		double pizza = bdc.nextDouble();
		double chico = pizza;
        System.out.print("How many ");
		System.out.print(cheese);
		Scanner box = new Scanner(System.in);
		System.out.println("s would you like?");
        int queso = box.nextInt();
		int lox = queso;
		System.out.print("Added ");
		System.out.print(queso);
		System.out.print("x ");
		System.out.print(cheese);
		double oohlala = (queso);
		double wowiezowie = (pizza);
		System.out.print(" to your order! ($");
		System.out.print(oohlala*wowiezowie);
		System.out.println(")");
		Scanner lit = new Scanner(System.in);
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
        String fries = lit.nextLine();
		String lott = (fries);
		System.out.println(fries);
        System.out.print("Price of ");
		System.out.print(fries);
		Scanner hog = new Scanner(System.in);
		System.out.print("($): ");
        double pasta = hog.nextDouble();
		double spaghetti = pasta;
		System.out.print("How many ");
		System.out.print(fries);
		Scanner twd = new Scanner(System.in);
		System.out.println("s would you like?");
		int plato = twd.nextInt();
		int yay = (plato);
		System.out.print("Added ");
		System.out.print(plato);
		System.out.print("x ");
		System.out.print(fries);
		double crow = (pasta);
		int blurp = (plato);
		System.out.print("s to your order! ($");
		System.out.print(pasta*plato);
		System.out.println(")");

		System.out.println("--- Item #3 ---");
		Scanner leg = new Scanner(System.in);
		System.out.print("Item name: ");
        String saucey = leg.nextLine();
		System.out.println(saucey);
		String woah = (saucey);
		System.out.print("Price of ");
		System.out.print(saucey);
		Scanner pog = new Scanner(System.in);
		System.out.print(" ($): ");
		double bingo = pog.nextDouble();
		double uhhh = (bingo);
		System.out.println(bingo);
		System.out.print("How many ");
		System.out.print(saucey);
		Scanner toy = new Scanner(System.in);
		System.out.print("s would you like? ");
		int plaster = toy.nextInt();
		int guaw = (plaster);
        System.out.print("Added ");
		System.out.print(plaster);
		System.out.print("x ");
		System.out.print(saucey);
		double gow = (bingo);
		int chow = (plaster);
		System.out.print(" to your order! ($");
		System.out.print(bingo*plaster);
		System.out.println(")");

		Scanner mkj = new Scanner(System.in);
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		int kong = mkj.nextInt();
		int lols = (kong);
		System.out.println(lols);
		System.out.println("=================================================");
		System.out.println("hi - Menu For Today");
        System.out.println("=================================================");
		System.out.print("Owner: ");
		System.out.println(oml);
		System.out.println("-------------------------------------------------");
		System.out.println("Item                Qty     Price");
		System.out.println("-------------------------------------------------");
		System.out.print(lalida);
		System.out.print(                    lox);
		System.out.println(     chico);
		System.out.print(lott                    );
		System.out.print(yay     );
		System.out.println(spaghetti);
		System.out.print(woah                    );
		System.out.print(guaw     );
		System.out.println(uhhh);
		System.out.println("-------------------------------------------------");
		System.out.print("Subtotal:                  ");
		System.out.println(chico+spaghetti+uhhh);
		System.out.print("Tax: (");
		double pops = (0.0975);
		System.out.print(pops);
		System.out.print("%):");
		System.out.println(pops*(chico+spaghetti+uhhh));
		System.out.print("Tip Amount:                ");
		double checkers= (lols);
		System.out.println(checkers);
		System.out.println("=================================================");
	    System.out.print("Total:                    $");
		System.out.println((chico+spaghetti+uhhh)+(pops*(chico+spaghetti+uhhh))+(checkers));
		System.out.println("=================================================");
		System.out.print("Thanks for eating at ");
		System.out.print(lucy);
		System.out.println("!");
		System.out.print("Come back again soon -- we'll always have a byte for you!");








	

	}
}
