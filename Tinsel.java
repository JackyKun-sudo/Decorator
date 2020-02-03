//Tinsel class extends TreeDecorator 
//package csce247.assignments.decorator

public class Tinsel extends TreeDecorator {

	private ChristmasTree tree;

	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
	}

	//method returns tree type with added decoration
	public String toString() {
		return tree.toString() + " + tinsel all around";
	}

	//method returns extra decoration cost 
	public double getCost() {
		return tree.getCost() + 2.00;
	}
}