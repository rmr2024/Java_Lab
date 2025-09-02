package datatypedemo;
import java.lang.*;
import java.util.Scanner;
public class BestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of your best friend:");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Describe your best friend in one line:");
		String bestLine = sc.nextLine();
		System.out.println("Enter the age of your best friend:");
		int age = sc.nextInt();
		System.out.println("Enter the weight of your best friend:");
		double weight = sc.nextDouble();
		System.out.println("Enter the height of your best friend:");
		float height = sc.nextFloat();
		System.out.println("Is your best friend taller than you?");
		boolean isTall = sc.nextBoolean();
		System.out.println("---------------------------------------");
		System.out.println("         About My Best Friend          ");
		System.out.println("---------------------------------------");
		System.out.println("My Best Friend is: "+name);
		System.out.println("My Best Friend's age is: "+age);
		System.out.println("My Best Friend's weight is: "+weight);
		System.out.println("My Best Friend's height is: "+height);
		System.out.println("Is My Best Friend taller?: "+isTall);
		System.out.println("About My Best Friend: "+bestLine);
		
	}

}
