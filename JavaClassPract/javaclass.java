import java.util.Scanner;

public class JavaNew {
	
public static void main (String args[]){
	
	tuna tunaObject = new tuna();
	MyName studentName = new MyName();
	gName girlName = new gName();
	
	
	tunaObject.simpleMesage();
	studentName.NameSolved();
	studentName.AgeSolved();
	
	Scanner kola = new Scanner(System.in);
	Scanner toli = new Scanner(System.in);
	Scanner gfn = new Scanner(System.in);
	
	System.out.println("do it");
	
	int x, y, sum, counter;
	x = 0; y = 0; sum = 0; counter = 0;
	
	
	System.out.println("please, enter your x");
		x = kola.nextInt();
	System.out.println("please, enter your x");
		y = kola.nextInt();
		sum = x +y;
	System.out.println(sum);
	++sum;
	System.out.println(sum);
	
	if (sum == 9){
		System.out.println("Yes equals 9");
	}
		else {
			System.out.println("No, not equal 9");
		}
		
	switch (sum){
	
	case 9: System.out.println("No, not equal 9"); break;
	case 8: System.out.println("Femi"); break;
	case 7: System.out.println("Tola");
	default: System.out.println("I am blind o");
	}
	
	
	/*while (counter < 5){
		System.out.println(counter);
		counter++;
	}
	*/
	 System.out.println("Please, enter your name");
	 String name = toli.nextLine();
	 studentName.TellName(name);
	 
	 System.out.println("What is the name of your first gf?");
	 String oldbabe = gfn.nextLine();
	 girlName.setName(oldbabe);
	 girlName.saying();
}
	
}
