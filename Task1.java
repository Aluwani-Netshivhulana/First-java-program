import java.util.*;

public class Task1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your r value");
		
		int r= scanner.nextInt(); 
		double area=3.141592* Math.pow(r,2);
		
		System.out.println("Your area is "+ area );
	}
}