
public class WhippedCream extends CondimentDecorator{
	
	Beverage beverage;
	
	public WhippedCream(Beverage beverage){
		
		this.beverage = beverage;
		
	}
	public String getDescription(){
		
		return beverage.getDescription() + ", Whipped Cream";
		
	}

	
	public double cost() {
		
		return 1.39 + beverage.cost();
		
	}

}
