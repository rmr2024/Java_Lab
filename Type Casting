package datatypedemo;
import java.lang.*;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcc = new Scanner(System.in);
		System.out.println("Order Item Name:");
		String itemName = tcc.nextLine();
		System.out.println("Enter Quantity:");
		int qty = tcc.nextInt();
		System.out.println("Enter Price:");
		double price = tcc.nextDouble();
		
		double totalAmount= price * qty;//implicit type conversion
		
		System.out.println("-----------------------");
		System.out.println("     Order Report      ");
		System.out.println("-----------------------");
		System.out.println("Item Name: "+itemName);
		System.out.println("Quantity: "+qty);
		System.out.println("Total Amount of items: "+totalAmount);
		int finalAmount=(int)totalAmount;
		System.out.println("Total Amount of items: "+finalAmount);
	}

}
