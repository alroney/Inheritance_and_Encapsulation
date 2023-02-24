package snackPack;

/**
 * 
 * @author Andrew
 * Date: 05/28/2022
 * Purpose: This project is demonstrating the usage of inheritance and encapsulation. I am using hierarchy with snack types.
 */


import java.util.Scanner;


public class OrderSystem {
	private static Scanner userInput = new Scanner(System.in);
	private static int selection;
	
	
	public static void main(String[] args) {
		
		/*MAIN MENU*/
			System.out.print("MENU");
				seperator();
			
			System.out.println("1: Order a Snack");
			System.out.println("2: Exit Program");
			System.out.print("Enter your selection: ");
				selection = selectionCorrection(); //Test input for validity and then pass valid response to selection for comparison.
		
		/*SNACK TYPE MENU*/
		if(selection == 1 ) { //Proceed with snack selection.
			String snackType;
			String id;
			char size;
			int snackChoice;
			
			snackChoice = snackChoice();
			size = sizeOption();//size
			
			/*SNACK OPTIONS MENU*/
				
			/*FRUIT SNACK*/
			if(snackChoice == 1) {//Fruit Snack options
				Boolean cf;//citrus fruit
				snackType = "Fruit Snack";
				id = "FS1";
				cf = citrusChoice();
				
				FruitSnack fruitsnack = new FruitSnack(id, size, cf);
				
				fruitsnack.sizePricing();
				fruitsnack.addonPricingAdditionCF();
				
				System.out.println("You have chosen snack type = "+ snackType +", "+ fruitsnack);
				exit();
			}
			
			
			/*SALTY SNACK*/
			else if(selection == 2) { //Salty Snack options
				Boolean ns;//nut snack
				snackType = "Salty Snack";
				id = "SS1";
				ns = nutSnackChoice();
				
				SaltySnack saltysnack = new SaltySnack(id, size, ns);
				
				saltysnack.sizePricing();
				saltysnack.addonPriceAdditionNS();
				
				System.out.println("You have chosen snack type = "+ snackType +", "+ saltysnack);
				exit();
			}
			
			else { //Stop user input privilege, then proceed with exit method.
				exit();
			}
		
			
		}
		
		/*EXIT*/
		else { //Stop user input privilege, then proceed with exit method.
			exit();
		}
		
	}
	
	
/*METHODS*/	
	
//Method: A simple spacer method for the text.
	private static void seperator() {
		int i;
		int j = 20;
		
		System.out.print("\n");
		
		for (i = 0; i < j; i++) {
			System.out.print("=");
		}
		
		System.out.print("\n");
	}
	
	
//Method: Select and return the snack choice.
	private static int snackChoice() {
		System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");
		selection = selectionCorrection();//Snack choice
		
		return selection;
	}
	
	
//Reset selection back to 0, then allow for input and check validity of such input.
	private static int selectionCorrection() {
		int selectionNum = 0;
		
		do { //Do the first selection until either 1 or 2 is inputed by the user.
			selectionNum = userInput.nextInt();
			
			if(!(selectionNum == 1 || selectionNum == 2)) {
				System.out.print("\nInvalid response! Please try again: ");
			}
			
		} while(!(selectionNum == 1 || selectionNum == 2)); 
		
		return selectionNum;
	}
	
	
//Method: Select and return the size.
	private static char sizeOption() {
		char size = 'A';
		
		System.out.print("What size do you want: S, M, or L: ");
			size = userInput.next().charAt(0);
		
		return size;
	}

	
//Method: Select and return the citrus addition condition
	private static boolean citrusChoice() {
		boolean c;
		System.out.print("Do you want citrus fruit included? (true/false): ");
			c = userInput.nextBoolean();
			
		return c;
	}
	
	
//Method: Select and return the nut snack addition condition
	private static boolean nutSnackChoice() {
		boolean n;
		System.out.print("Do you want nut snack included? (true/false): ");
			n = userInput.nextBoolean();
			
		return n;
	}
	
	
//Method: Exit program with a message.
	private static void exit() {
		userInput.close();
		System.out.print("\nThank you for using the program. Goodbye!");
		System.exit(1);
	}
}



