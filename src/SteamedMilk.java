
//Decorator
public class SteamedMilk extends CondimentDecorator{
	Beverage beverage;
	public SteamedMilk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Steamed Milk";
	}

	public double cost() {
		// TODO Auto-generated method stub

		return .10 + beverage.cost();
	}

}
