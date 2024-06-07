package Passgen;
import java.util.*;

class generatePass // Class to create generatePass object
{
	int length;
	
	// Initializer
	generatePass(generatePass ob)
	{
		length = ob.length;
	}
	
	// Constructor
	generatePass(int l)
	{
		length = l;
	}
	
	// Computes and returns sb (password)
	String finalPass(int s) 
	{ 
		StringBuilder sb = new StringBuilder(s);
		Random rnd = new Random(); // Random instance
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789"; // Characters allowed in final password
		
		for (int i = 0; i < s; i++) // For loop that runs as long as it's less then the length of the password
		{
			sb.append(alphabet.charAt(rnd.nextInt(alphabet.length()))); // Selects random value from alphabet string
		}
		
		return sb.toString(); // Converts the StringBuilder to a String, then returns the value to main()
	}
};

public class Passgen // Main Class
{	
    public static void main(String[] args)
    {
    	int lengthPass = 0;
        int n = 0;
        generatePass p1 = new generatePass(lengthPass);
        Scanner scan1 = new Scanner(System.in);
        boolean exit = false;

		System.out.println("------------------------------------------------------"); // Menu system
        System.out.println("-    Password Generator    |   By: Logan Velier      -" );
        System.out.println("------------------------------------------------------");
        System.out.println("");
        System.out.println("[1] Edit Length of Password");
        System.out.println("[2] Generate Final Password");
        System.out.println("[3] Exit");
        System.out.println("");
        System.out.print("Pick an option: ");
        n = scan1.nextInt();
        
	    switch(n)
	    {
	    case 1:
	    	System.out.print("Length of password: ");
	    	lengthPass = scan1.nextInt(); // Scans for user input 
	    	
	    	main(args);
	    case 2:
	    	
	    	System.out.print(p1.finalPass(lengthPass)); // Passes length of password to the finalPass Object
	    	break;
	    	
	    case 3:
	    	exit = true;
	    	break;
	    }

        scan1.close();
    }
}
