package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Product{
	int id;
	String name;
	double purchasedPrice;
	double salesPrice;
	String grade;
	Product(int id,String name,double pprice,double sprice,String grade){
		setId(id);
		setName(name);
		setPurchasedPrice(pprice);
		setSalesPrice(sprice);
		setGrade(grade);
		
	}
	//setting data
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPurchasedPrice(Double purchasedPrice) {
		this.purchasedPrice=purchasedPrice;
	}
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice=salesPrice;
	}
	public void setGrade(String grade) {
		   this.grade=grade;
	}
	// getting data
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Double getPurchasedPrice() {
		return this.purchasedPrice;
	}
	public Double getSalesPrice() {
		return this.salesPrice;
	}
	public String getGrade() {
		return this.grade;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null ||obj.getClass()!=this.getClass())
			return false;
		Product pro=(Product) obj;
		return Integer.compare(id,pro.id)==0;
	}
	
	public String toString() {
	    String s=String.format("%-5s %-20s %-10s %-10s %-5s",getId(),getName(),getPurchasedPrice(),getSalesPrice(),getGrade());
	    return s;
	}
	
}
// exception classes
class PriceException extends Exception{
	@Override
	public String toString() {
		return "Price exception: salesprice must be higher than purchased price: ";
	}
}
class EssentialCommodityException extends Exception{
	@Override
	public String toString() {
		return "EssentialCommodityException: E graded items sales price cannot be more than 25% of purchase price: ";
	}
}
class GradeMismatchException extends Exception{
	@Override
	public String toString() {
		return "GradeMismatchException: Grade value is either 'N' or 'E': ";
	}
}


public class Assignment7 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		HashSet<Product> products=new HashSet<Product>();
		List<String> list=new ArrayList<String>();
		System.out.println("Enter the number of items u want to add:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String str=sc.nextLine().toUpperCase();
			list.add(str);
		}
		for(String s:list) {
			String[] data=s.split(",");
			
			try {
				if((!data[4].equalsIgnoreCase("E")) && (!data[4].equalsIgnoreCase("N")))
			        throw new GradeMismatchException();
			    double pprice=Double.parseDouble(data[2]);
			    double sprice=Double.parseDouble(data[3]);
			    if(sprice<=pprice)
			    	throw new PriceException();
			    if(data[4].equalsIgnoreCase("E")) {
				    double diff=sprice-pprice;
				    diff=(diff/pprice)*100;
				    if(diff>25)
					   throw new EssentialCommodityException();
			    }
			    products.add(new Product(Integer.parseInt(data[0]),data[1],pprice,sprice,data[4]));
		   }
			
			catch(PriceException e) {
				System.out.println(e+"so product Id "+data[0]+" is rejected");
			}
			catch(EssentialCommodityException e) {
				System.out.println(e+"so product Id "+data[0]+" is rejected");
			}
			catch(GradeMismatchException e) {
				System.out.println(e+"so product Id "+data[0]+" is rejected");
			}
		}
		for(Product p:products) {
			System.out.println(p);
		}
	}
}
