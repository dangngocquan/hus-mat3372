package midterm.y2022.solution.exe04.decorator;

public class Cheese extends ToppingDecorator {
	public Cheese(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Cheese";
	}
 
	public double cost() {
		return bread.cost() + 1.0;
	}
}
