import java.util.Scanner;
import java.util.EnumSet;
import java.util.Random;

public class CompoundInt {

public static void main(String[] args){
	
	tuna member1 = new tuna("Megan", "Fox");
	tuna member2 = new tuna("Natalie", "Portman");
	tuna member3 = new tuna("Taylor", "Swift");
	
	System.out.println(member1.getFirst());
	System.out.println(member1.getLast());
	System.out.println(member1.getMembers());
}
}
