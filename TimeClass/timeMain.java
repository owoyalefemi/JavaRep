import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
	timeClass timeTest = new timeClass();
	System.out.println(timeTest.toMilitary());
	timeTest.setTime(13, 70,6);
	System.out.println(timeTest.toMilitary());
	System.out.println(timeTest.toString());
	}
	
}
