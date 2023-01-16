package assignment;
import java.util.*;
public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		int count=0;
		char c=' ';
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i))
				count++;
		}
		System.out.println(" : "+count);
		
		c='a';
		while(c<'z') {
			count=0;
			for(int i=0;i<str.length();i++) {
				if(c==Character.toLowerCase(str.charAt(i)))
					count++;
			}
			if(count>0)
			  System.out.println(c+": "+count);
			c++;
		}
	}
}
