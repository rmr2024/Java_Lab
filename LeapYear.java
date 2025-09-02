package datatypedemo;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
		        System.out.println("The year " + year + " is leap year");
		    } 
		else {
		    	System.out.println("The year " + year + " is not leap year");		    }
		}

	}

}
