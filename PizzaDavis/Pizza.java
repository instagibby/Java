
public class Pizza {
	// Spencer Davis

	private String Topping;
	private String Size;
	private double Price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;

	public Pizza(String topping, String size, double price) {
		super();
		setTopping(topping);
		setSize(size);
		setPrice(price);

		nextOrderNumber++;
		orderNumber = nextOrderNumber;

		if (this.Size == null) {
			throw new IllegalArgumentException("Object was not created");
		}

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

		switch (sizeLower) {
		case "small":
		case "medium":
		case "large":
		case "extra large":
			this.Size = sizeLower;
			break;
		default:
			this.Size = null;
			break;
		}
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public String repeatOrder() {

		return "Order Number: " + orderNumber + ", Topping: " + getSize() + ", Size: " + getTopping() + ", Price: $" + getPrice() + ".";
	}

}
