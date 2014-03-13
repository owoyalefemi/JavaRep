import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		System.out.println("Index \t Value");
		
		int array[] = {3,4,5,6,7};
		int total = 0;
		
		
		for(int x:array){
		total+=x;	
		}
		
		System.out.println(total);
		
		change(array);
		for (int y:array)
			System.out.println(y);
		}
	
	
	public static void change(int x[]){
		for (int counter =0; counter < x.length; counter++)
			x[counter]+=5;
		
	}
	
}
