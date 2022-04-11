import java.util.*;

public class Task2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Mark");
		
		int mark = scanner.nextInt(); 
		if(mark>100 || mark <0){
			System.out.println("Mark entered is invalid");
			return;
		}
		if (mark>= 90 ){
			System.out.println("Congrats your final grade is A");
		    return;
		 }
		if (mark>= 80) {
		
			System.out.println("Congrats your final grade is B");
			return;
		}
		if (mark>= 60){
			System.out.println("Congrats your final grade is C");
			return;
		}
		if (mark>= 50){
			System.out.println("Congrats your final grade is D");
			return;
		}
	    System.out.println("Unfortunalely you didn't make it");
	}
}
	
		