JavaRep
=======
Here is the very first Readme for my Java Repo
My Java Repo
//

1- Classes are blueprints of an object which has its own unique behaviour and components. e.g Bicycle; car; etc

2- Instance is a certain component of an oject which is only accessible to that object.
public class gName {
	
	private String girlName;  /////this is the instance
	
	public void setName(String name){
		girlName = name;
		
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());
	}

}

3- A constructor is like an initialization of an object in a class. It must be called exactly the same name as the class name.

public class GhName {

	private String girlName;
	
	public GhName(String name){                 //this is the constructor 
		girlName = name;
		
	}
	
	public void setName(String name){
		girlName = name;
		
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());
	}


}

So, in the main page, I have: GhName girlName = new GhName("Kelly");