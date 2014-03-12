
public class GhName {

	
	private String girlName;
	private int Multi;
	private int number;
	
	public GhName(String name){
		girlName = name;
			}
	public GhName(int age){
		number = age * 2;
	}
	// insert the int value then multiply by 2
		/*
	public void setName(String name){
		girlName = name;
			}
	*/
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());
	}
	
	public int setNumber(){
		return number;
			}

	public void tellAge(){
		System.out.printf("Your age time 2 is %d\n", setNumber());
	}

}
