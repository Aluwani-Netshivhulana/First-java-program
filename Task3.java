import java.util.*;

public class Task3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Weight in Kg");
		
		double weight = scanner.nextDouble();
		
		Scanner alu = new Scanner(System.in);
		System.out.println("Please enter your heigtht in meters");
		
		double height = alu.nextDouble();
		
		double bmi= weight /Math.pow(height,2);
		
		System.out.println("Your BMI is "+ bmi);
	}
}