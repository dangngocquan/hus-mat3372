package midterm.y2022.solution.exe04.decorator;

public class Olives extends ToppingDecorator {
	public Olives(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Olives";
	}
 
	public double cost() {
		return bread.cost() + 2.0;
	}
}
