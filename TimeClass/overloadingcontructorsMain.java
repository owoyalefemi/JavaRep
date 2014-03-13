import java.util.Scanner;
import java.util.Random;

public class CompoundInt {

	
	public static void main (String args[]){
	timeClass timeTest = new timeClass();
	timeClass timeTest1 = new timeClass(5);
	timeClass timeTest2 = new timeClass(5,13);
	timeClass timeTest3 = new timeClass(5,13,43);
	
	/*System.out.println(timeTest.toMilitary());
	timeTest.setTime(13, 70,6);
	System.out.println(timeTest.toMilitary());
	System.out.println(timeTest.toString());*/
	System.out.printf("%s\n",timeTest.toMilitary());
	System.out.printf("%s\n",timeTest1.toMilitary());
	System.out.printf("%s\n",timeTest2.toMilitary());
	System.out.printf("%s\n",timeTest3.toMilitary());
	
	}
	
}
