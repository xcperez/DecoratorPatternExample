
public class Main {
	
	public static void main(String[]args){
		
		Beverage bev1 = new Espresso();
		bev1 = new Mocha(bev1);
		bev1 = new Mocha(bev1);
		bev1 = new WhippedCream(bev1);
		
		System.out.println(bev1.getDescription() + ", " + bev1.cost());
		
		Beverage bev2 = new HouseBlend();
		bev2 = new WhippedCream(bev2);
		
		System.out.println(bev2.getDescription() + ", " + bev2.cost());
		
	}

}
