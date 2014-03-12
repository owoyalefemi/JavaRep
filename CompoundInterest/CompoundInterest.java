import java.util.Scanner;
public class CompoundInt {

	
	public static void main (String args[]){
		double amount;
		double principal = 1000;
		double rate = 0.01;
		
		for(int year=1; year<=20; year++){
			amount=principal*Math.pow(1+rate,year);
		System.out.println("The total compound interest is" + year + "  " + amount);
		}
		
	}
}
