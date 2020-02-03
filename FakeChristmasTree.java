//FakeChristmasTree class extends ChristmasTree 
//package csce247.assignments.decorator

public class FakeChristmasTree extends ChristmasTree {
	
	//method returns Christmas Tree type
	public FakeChristmasTree() {
		this.description = "Artificial Christmas Tree";
	}

	//method returns Christmas Tree cost 
	public double getCost() {
		return 50.00;
	}
}