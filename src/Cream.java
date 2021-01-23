
//Decorator
public class Cream extends CondimentDecorator{
	Beverage beverage;
	public Cream(Beverage beverage) {
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Cream";
	}

	public double cost() {
		// TODO Auto-generated method stub

		return .15 + beverage.cost();
	}

}
