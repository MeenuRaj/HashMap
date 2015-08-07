import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


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

		
		//System.out.println((System.getProperty("user.dir") + File.separatorChar +"Number2Name.txt"));
		String filename = (System.getProperty("user.dir") + File.separatorChar +"Number2Name.txt");
		PrintWriter writer = null;
		try
		{
			writer = new PrintWriter(new File(filename));
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		for(Integer key : myMap.keySet())
		{
			writer.println(key + "\t" +myMap.get(key));
		}
		writer.close();
		BufferedReader reader = null;
		try{
		System.out.println("read from a file");
		reader = new BufferedReader(new FileReader(filename));
		String line = reader.readLine();
		while(line != null)
		{
			String[] key_value_pair = line.split("\t");
			System.out.println(key_value_pair[0] + " " +key_value_pair[1]);
			line = reader.readLine();
		}
		reader.close();
	}catch(IOException e)
		{
		System.out.println("File does not exist");
		}finally{
			
		}
	
		
		
	}

	}


