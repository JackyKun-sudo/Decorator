//ChristmasTree abstract class 
//package csce247.assignments.decorator

public abstract class ChristmasTree {

	protected String description;

	//toString method returns description of Christmas Tree 
	public String toString() {
		return description;
	}

	//getCost method gets cost of Christmas Tree 
	public abstract double getCost();
}