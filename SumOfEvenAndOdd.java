package datatypedemo;
import java.util.Scanner;
public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int odd=0,even=0,a=0;
		System.out.println("Enter total number of terms: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter term "+i+" :");
			a=sc.nextInt();
			if(a%2==0) {
				even=even+a;
			}
			else
			{
				odd=odd+a;
			}
		}
		System.out.println("Sum of odd terms: "+odd);
		System.out.println("Sum of even terms: "+even);
	}

}
