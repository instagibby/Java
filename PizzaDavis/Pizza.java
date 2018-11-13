
public class Pizza {
	// Spencer Davis
	
	private String Topping;
	private String Size;
	private double Price;
	
	
	
	
	public Pizza() {
		super();
		setTopping("cheese");
		setPrice(9.99);
	}
	
	
	public Pizza(String topping, String size, double price) {
		super();
		setTopping(topping);
		setSize(size);
		setPrice(price);
	}
	
	
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		this.Topping = topping;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		String sizeLower = size.toLowerCase();
		
		switch (sizeLower){
			case "small" :
			case "medium" :
			case "large" :
			case "extra large" :
				this.Size = sizeLower;
			default:
				break;
		}
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	
	
	public String repeatOrder() {
		
		return "You ordered a " + getSize() + " " + getTopping() + " pizza for $" + getPrice() + ".";
	}
	
	
}
