//RealChristmasTree class extends ChristmasTree 
//package csce247.assignments.decorator

public class RealChristmasTree extends ChristmasTree {
	
	//method returns Christmas Tree type
	public RealChristmasTree() {
		this.description = "Real Fir Christmas Tree";
	}

	//method returns Christmas Tree cost 
	public double getCost() {
		return 40.00;
	}
}