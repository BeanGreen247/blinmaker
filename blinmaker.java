import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
	  
	//this app was inspired by Life of Boris and his blinmaker
	//link to his video https://www.youtube.com/watch?v=FMIZEfjYmtM
	//blin recipe video https://www.youtube.com/watch?v=5UOowIxfX88
	
	int eggsAmount;
	int eggsMin = 1; //egg
	int milkAmount;
	int milkMin = 200; //ml
	int flourAmount;
	int flourMin = 100; //grams
	
	Scanner userInput;
	
	System.out.println("Blinmaker starting up...");
	System.out.println("How many eggs do you have?");
	userInput = new Scanner(System.in);
	eggsAmount = userInput.nextInt();
	
	System.out.println("How much milk do you have?");
	userInput = new Scanner(System.in);
	milkAmount = userInput.nextInt();
	
	System.out.println("How much flour do you have?");
	userInput = new Scanner(System.in);
	flourAmount = userInput.nextInt();
	
	if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
		System.out.println("no blin today :(");
	}
	else {
		flourAmount = flourAmount / flourMin;
		System.out.println("you have " + flourAmount + " portions of flour (1 portion is 100g)");
		milkAmount = milkAmount / milkMin;
		System.out.println("you have " + milkAmount + " portions of milk (1 portion is 200ml)");
		
		int smallest;
		if	(eggsAmount <= milkAmount && eggsAmount <= flourAmount) {
			smallest = eggsAmount;
		}
		else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
			smallest = milkAmount;
		}
		else {
			smallest = flourAmount;
		}
		
		int totalBlin = smallest*4;
		int totalEggs = smallest*eggsMin;
		int totalMilk = smallest*milkMin;
		int totalFlour = smallest*flourMin;
		int totalTablespoonOfSugar = smallest*2;
		int totalTeaspoonOfSalt = smallest;
		
		
		System.out.println("\nYou can make " + totalBlin + " of blins.");
		System.out.println("\nYou will need " + totalEggs + " eggs.");
		System.out.println("You will need " + totalFlour + " grams of flour.");
		System.out.println("You will need " + totalMilk + "ml of milk.");
		System.out.println("You will need " + totalTablespoonOfSugar+ " tablespoons of sugar.");
		System.out.println("You will need " + totalTeaspoonOfSalt + " teaspoons of salt.");
		System.out.println("You will need some cooking oil.");
		
		System.out.println("\nSteps for making a blin.");
		System.out.println("The 'blin sauce' part" +
						   "\nStep 1 : " + "\nTake a bowl and add 100 grams of flour." + 
						   "\nStep 2 : " + "\nAdd 200 ml of milk." +
						   "\nStep 3 : " + "\nAdd 1 egg." +
						   "\nStep 4 : " + "\nAdd 2 tablespoons of sugar." +
						   "\nStep 5 : " + "\nAdd 1 teaspoon of salt." +
						   "\nStep 6 : " + "\nAdd some cooking oil." +
						   "\nStep 7 : " + "\nMix it up (if too thick add a bit of milk)" +
						   "\n\nThe cooking part" +
						   "\nStep 8 : " + "\nTake a pan, put on high heat and put some oil on top and wait for it to get hot.  " +
						   "\nStep 9 : " + "\nPour the 'blin sauce' from the bowl into the pan and wait until you see bubbles.  " +
						   "\nStep 10 : " + "\nFlip the blin and wait again. " +
						   "\nStep 11 : " + "\nTake out of pan and enjoy! ;) ");
		
		System.out.println("\nBlinmaker shutting down...");
	}
}
}