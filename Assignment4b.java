package assignment;
import java.util.*;

class Clock{
	Scanner sc=new Scanner(System.in);
	int hh,mm,ss;
	
	Clock(){
		System.out.println("Enter the hours:");
		hh=sc.nextInt();
		System.out.println("Enter the minutes:");
		mm=sc.nextInt();
		System.out.println("Enter the seconds:");
		ss=sc.nextInt();
	}
	boolean validityoftime(){
		if((hh>=0 && hh<24) &&(mm>=0 && mm<=60) && (ss>=0 && ss<=60)) {
			System.out.println("The entered time is valid");
			return true;
		}
		else {
			System.out.println("The entered time is invalid");
			return false;
		}
			
	}
	void covert() {
		if(validityoftime()==true) {
			if(hh>0 && hh<12)
				System.out.println("Time is "+hh+":"+mm+":"+ss+" Am");
			else if(hh>12 && hh<24)
				System.out.println("Time is "+(hh-12)+":"+mm+":"+ss+" Pm");
			else if(hh==12)
				System.out.println("Time is "+hh+":"+mm+":"+ss+" Pm");
			else if(hh==0)
				System.out.println("Time is "+(hh+12)+":"+mm+":"+ss+" Am");
		}
		else {
			System.out.println("The time is invalid ,cannot be converted");
		}
		
	}
}
public class Assignment4b {

	public static void main(String[] args) {
		Clock clk=new Clock();
		clk.covert();

	}

}
