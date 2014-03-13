import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		System.out.println(average(43,45,56,76,21,2));
		
	}
	public static int average(int...numbers){//because we do not know how many numbers we might put in the array
		int total=0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
	
}
