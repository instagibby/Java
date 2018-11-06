
public class Pizza {
	// Spencer Davis
	
	private String Topping;
	private String Size;
	private double Price;
	
	
	
	
	public Pizza() {
		super();
		
		setTopping("cheese");
		setSize("large");
		setPrice(9.99);
	}
	
	
	public Pizza(String topping, String size, double price) {
		super();
		Topping = topping;
		Size = size;
		Price = price;
	}
	
	
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	
	public String repeatOrder() {
		
		return "You ordered a " + getSize() + " " + getTopping() + " pizza for $" + getPrice() + ".";
	}
	
	
}
