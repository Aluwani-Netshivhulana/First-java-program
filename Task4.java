import java.util.*;

public class Task4
{
	public static void main(String[] args)
	{
		
		double DietDrinks;
		double SweetenerMouse;
		double WeightMouse;
		double SweetenerDieter;
		double WeightDieter;
		double DIET_SWEETENER = 0.001;

		System.out.println("This program calculates how many cans of Sweetener it will take to kill you");
		System.out.println("Each can contains 0.001 (0.1%) of artificial sweetener");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of Artificial sweeterner cans needed to kill a mouse");
		
		SweetenerMouse = scanner.nextDouble();
		
		Scanner alu = new Scanner(System.in);
		System.out.println("Enter the weight of the mouse in kg:");
		
		WeightMouse = alu.nextDouble();
		
		Scanner thikhe = new Scanner(System.in);
		System.out.println("Enter the weight of the dieter in kg at which dieting activity will be stopped:");
		
		WeightDieter = thikhe.nextDouble();
		
		SweetenerDieter = (SweetenerMouse/WeightMouse) * WeightDieter;
		DietDrinks = (SweetenerDieter/DIET_SWEETENER);
		
		
		System.out.println("The amount of Diet Sweetener Can's that would kill the dieter is: " + DietDrinks);
		System.out.println("The amount of Cans the dietercan safely drink is anything less than "+DietDrinks);
	}
}