import java.util.Scanner;

public class MyName {
	
 public void NameSolved(){
	  System.out.println("What I do is telling your Name");
	  
	  }
 
 public void AgeSolved(){
	 Scanner agein = new Scanner(System.in);
	 int t, v, sum;
	 t = 0; v = 0; sum = 0;
	 
	 System.out.println("The AgeSolved Class has been called");
	 System.out.println("What I do is to calculate yours and mum's age");
	 System.out.println("What is your age?");
	 t = agein.nextInt();
	 
	 System.out.println("What is your mum's age?");
	 v = agein.nextInt();
	 
	 sum = t + v;
	 System.out.println("Total sum of your ages =");
	 System.out.println(sum);
	 
 }
 
 public void TellName(String name) {
	 System.out.println("I love you " + name);
	 
 }
}
