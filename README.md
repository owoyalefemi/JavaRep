JavaRep
=======
Here is the very first Readme for my Java Repo
My Java Repo
//
//"this" : what it means: Use this value right here!
// Consider having such class as this:- 
public class tuna{
private int hour = 1;
private int minute = 2;
private int second = 3;
//then, have a method as this
public void setTime(int hour, int minute, int second){
hour = 4;
minute = 5;
second = 6;

}
// After running the program, wherever the variables hour, minute and second were used, they will refer to the initial declaration i.e 1,2,3
But in order to clarify that we are actually referring to the values and variables in the method "setTime" then we force it this way:

public void setTime(int hour, int minute, int second){
this.hour = 4;
this.minute = 5;
this.second = 6;

}

}
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