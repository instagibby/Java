
public class PizzaTesterDavis {

	

	public static void main(String[] args) {
		// Spencer Davis
		
		
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		//Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);

		
		
		
		System.out.println(myPizza.repeatOrder());
		System.out.println(yourPizza.repeatOrder());
		//System.out.println(thirdPizza.repeatOrder());

	}
	
}
