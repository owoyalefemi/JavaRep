import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
		potpie potObject = new potpie(4,5,6);
		tuna tunaObject = new tuna ("Greg", potObject);
		
		System.out.println(tunaObject);
	}
	
}