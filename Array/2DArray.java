import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		int firstarray[][] = {{8,9,10,11},{2,3,5,6,12}};
		System.out.println("this is the irst array");
		display(firstarray);
	}
	
	public static void display (int x[][]){
		for(int row=0; row<x.length;row++){
			for(int column=0; column<x[row].length; column++){
				
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}
