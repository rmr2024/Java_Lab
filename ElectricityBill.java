package datatypedemo;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		int bill=0;
		System.out.println("Enter old reading: ");
		int old_units=sc.nextInt();
		
		System.out.println("Enter current reading: ");
		int new_units=sc.nextInt();
		
		int units=new_units=old_units;
		System.out.println("Used units are: ");
		System.out.println(units);
		
		if(units<=50) {
			bill=(units*1);
			
		}
		else if(units<=100 && units>50){
           bill=(units-50)*2+50;
	    }
		else if(units<=200 && units>100)  
        {                                 
            bill=(units-100)*3+50*1+50*2;         
        }
        else if(units<=400 && units>200)  
        {                                                                   
            bill=(units-200)*4+50*1+50*2+50*3;                                           
        }
        else if(units>400)
        {                                 
          bill=(units)*5+50*4+50*3+50*2+50*1; 
        }
        System.out.println("Total bill: "+bill);
		

	}

}
