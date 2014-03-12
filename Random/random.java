import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		Random dice = new Random();
		int number;
		
		for(int counter=0; counter <= 9; counter++){
			number = 1+dice.nextInt(6);
			System.out.println(counter + " " + number);
			
			
		}
	}
}
