import java.util.Scanner;

public class TestMain {

	public static void main (String args[]){
		
		//GhName girlName = new GhName("Kelly");
		GhName girlfriend = new GhName("Nicole");
		GhName certain = new GhName(6);
		Scanner gfn = new Scanner(System.in);
		
		/* System.out.println("What is the name of your first gf?");
		 String oldbabe = gfn.nextLine();
		 girlName.setName(oldbabe); */
		// girlName.saying();
		 girlfriend.saying();
		 certain.tellAge();
	}
}
