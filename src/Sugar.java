
//Decorator
public class Sugar extends CondimentDecorator{
	Beverage beverage;
	public Sugar(Beverage beverage) {
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		// TODO Auto-generated method stub

		return .05 + beverage.cost();
	}

}
