package datatypedemo;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println("Choose operator:\n"
				+ "1.Addition\n"
				+ "2.Substraction\n"
				+ "3.Multiplication\n"
				+ "4.Division");
		var op=sc.nextLine();
		switch (sc.nextLine()) {
	    case "1":
	        System.out.println("Addition = "+ (a+b));
	        break; 
	    case "2":
	    	System.out.println("Substraction = "+ (a-b));
	        break;
	    case "3":
	    	System.out.println("Multiplication = "+ (a*b));
	        break;
	    case "4":
	    	if(b==0) {
	    		System.out.println("Division by zero not possible");
	    		break;
	    	}
	    	else{
	    		System.out.println("Division = "+ (a/b));
		        break;
	    	}
	    default:
	        System.out.println("Invalid option");
	}
	}

}
