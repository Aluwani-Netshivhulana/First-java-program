import java.util.*;

public class Task6
{
	public static void main(String[] args)
	{
		double caffeinCoke = 34;
		double caffeinPepsi = 37.5;
		double caffeinCoffee = 475;
		double lethalDose = 10000;
		
		Scanner scanner = new Scanner(System.in);
		boolean ans=true;
		do{
		System.out.println("Please enter the number of your drink  ");
		System.out.println("1. Coke");
		System.out.println("2. Pepsi");
		System.out.println("3. Coffee");
		int drinkType = scanner.nextInt();
		
	/*	if(drinkType>3 || drinkType <=0){
			System.out.println(" Number entered is invalid");
			return;
		}
		if(drinkType == 1){
			double numberOfCans =lethalDose/caffeinCoke;
			System.out.println(" The number of cans that can kill you is " + numberOfCans);
			return;
		}
		if(drinkType == 2){
			double numberOfCans =lethalDose/caffeinPepsi;
			System.out.println(" The number of cans that can kill you is " + numberOfCans);
			return;
		}
		if(drinkType == 3){
			double numberOfCans =lethalDose/caffeinCoffee;
			System.out.println(" The number of cans that can kill you is " + numberOfCans);
		}
		*/
		double numberOfCans=0;
		switch(drinkType){
		case 1:
			numberOfCans =lethalDose/caffeinCoke;
			System.out.println(" The number of Coke cans that can kill you is " + (int)numberOfCans);
			break;
			
		case 2:
		    numberOfCans =lethalDose/caffeinPepsi;
			System.out.println(" The number of Pepsie cans that can kill you is " + numberOfCans);
			break;
		
		case 3:
			numberOfCans =lethalDose/caffeinCoffee;
			System.out.println(" The number of cans of coffee that can kill you is " + numberOfCans);
		    break;
		default:
			System.out.println(" Number entered is invalid");
		}
		System.out.print("Do you want to try again? ('Y' to continue or any other key to exit) ");
		scanner.nextLine();
		String value=scanner.nextLine();
		if(!value.equalsIgnoreCase("y")){
			ans=false;
		}
		}while(ans==true);
	}
}
		
		
		