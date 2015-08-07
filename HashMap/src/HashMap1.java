import java.util.HashMap;
import java.util.Scanner;


public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		Scanner scan = new Scanner(System.in);
		String ans = "y";
		String name = "";
		while(ans.equalsIgnoreCase("y"))
		{
		System.out.println("Enter a number(0-10): ");
		int num = scan.nextInt();
		if (num == 0)
			name = "zero";
		else if (num == 1)
			name = "one";
		else if (num == 2)
			name = "two";
		else if (num == 3)
			name = "three";
		else if (num == 4)
			name = "four";
		else if (num == 5)
			name = "five";
		else if (num == 6)
			name = "six";
		else if (num == 7)
			name = "seven";
		else if (num == 8)
			name = "eight";
		else if (num == 9)
			name = "nine";
		else
			name = "ten";
		System.out.println("You entered " +name + "\n");
		
		if (!myMap.containsKey(num))
		{
			System.out.println("Number not found, would you like to add? (y/n)");
			String resp = scan.next();
			if (resp.equalsIgnoreCase("y"))
				{
				myMap.put(num, name);
				}
		}
		
		System.out.println("Would you like to try again? (y/n) ");
		ans = scan.next();
		
		
		
	}
		
		System.out.println("Here is our entered values "+ myMap);
	}
}
