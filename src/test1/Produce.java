package test1;

public abstract class Produce {
	String description = "unknown";
	public abstract int cost();
	public String getDescription(){
		return description;
	}
}
