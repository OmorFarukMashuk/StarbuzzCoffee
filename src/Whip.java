
//Decorator
public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		// TODO Auto-generated method stub

		return .10 + beverage.cost();
	}

}
