import java.util.*;

public class Task5
{
	public static void main(String[] args)
	{
		double initialAmount =10000;
		double initialInterest = 0.08;		
		int n=5;
		
		double simpleInterest = (initialAmount * initialInterest* n)/100;
		System.out.println("Your Simple Interest is "+ simpleInterest);
		
	}
}