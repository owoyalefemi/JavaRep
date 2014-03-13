
public enum tuna {
bucky("nice","22"),
kelsey("cutie","10"),
julia("bigmistake","12"),
nicole("italian","13"),
candy("diferent","14"),
erin("I wish","16");

private final String desc;
private final String year;

tuna(String description, String birthday){
	desc = description;
	year = birthday;
	
	}
public String getDesc(){
	return desc;
}
public String getYear(){
	return year;
}
	
}
