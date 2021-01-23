
//Decorator
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		// TODO Auto-generated method stub

		return .20 + beverage.cost();
	}

}
