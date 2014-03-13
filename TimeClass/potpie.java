
public class potpie {
	private int month;
	private int day;
	private int year;

	public potpie(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);//this :says anytime I need a string representation for your object, I will replace it by an available signaling method
	}
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
