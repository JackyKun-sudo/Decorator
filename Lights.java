//Lights class extends TreeDecorator 
//package csce247.assignments.decorator

public class Lights extends TreeDecorator {

	private ChristmasTree tree;

	public Lights(ChristmasTree tree) {
		this.tree = tree;
	}

	//method returns tree type with added decoration
	public String toString() {
		return tree.toString() + " + strings of lights";
	}

	//method returns extra decoration cost 
	public double getCost() {
		return tree.getCost() + 2.00;
	}
}