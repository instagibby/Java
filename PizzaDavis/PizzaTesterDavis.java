
public class PizzaTesterDavis {

	

	public static void main(String[] args) {
		// Spencer Davis
		
		
		Pizza myPizza = new Pizza();
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		
		myPizza.setPrice(12.99);
		myPizza.setTopping("mushroom");
		
		
		
		System.out.println(myPizza.repeatOrder());
		System.out.println(yourPizza.repeatOrder());
		System.out.println(thirdPizza.repeatOrder());

	}
	
}
