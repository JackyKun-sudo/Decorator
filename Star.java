//Star class extends TreeDecorator 
//package csce247.assignments.decorator

public class Star extends TreeDecorator {

	private ChristmasTree tree;

	public Star(ChristmasTree tree) {
		this.tree = tree;
	}

	//method returns tree type with added decoration 
	public String toString() {
		return tree.toString() + " + a star on top";
	}

	//method adds extra decoration cost 
	public double getCost() {
		return tree.getCost() + 6.00;
	}
}