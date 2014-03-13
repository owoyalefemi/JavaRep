import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		System.out.println("Index \t Value");
		
		Random rand = new Random();
		int array[] = {1,2,5,6,7};
		int dice[] = new int[7];
		
		int sum=0;
		
		//System.out.println("the number is" + array[2]);
		for(int counter=0; counter<array.length; counter++){
			
			System.out.println(counter + "\t" + array[counter]);
		}
		
		for(int solo=0; solo<array.length; solo++){
			sum+=array[solo];
					}
		
		System.out.println("The total sum of all values is"+" "+sum);
		
		for(int roll=1; roll<100; roll++){
			++dice[1+rand.nextInt(6)];
			
		}
		System.out.println("Face \t Frequency");
		for(int face=1; face<dice.length; face++){
			System.out.println(face + "\t" + dice[face]);
			
		}
		
	}
}
