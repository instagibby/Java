package src;
import java.text.DecimalFormat;

public class Blanket {
	// Linda Wang
	// Don Erikson
	// Spencer Davis

	public String size;
	public String color;
	public String material;
	public double price = 25;
	public DecimalFormat df = new DecimalFormat("$0.00");

	public Blanket() {
		super();
		this.size = "twin";
		this.color = "blue";
		this.material = "wool";
	}

	public Blanket(String color, String size, String material) {
		super();
		setSize(size);
		setColor(color);
		setMaterial(material);

	}

	public String getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}
	
	public void setSize(String size) {
		size = size.toLowerCase();
		if (size.equals("queen")){
			price += 25;
		} else if (size.equals("king")) {
			price += 40;
		} else if (size.equals("twin")) {

		} else {
			throw new IllegalStateException("Invalid size");
		}
		this.size = size;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		material = material.toLowerCase();
		if (material.equals("wool")) {
			price += 20;
		} else if (material.equals("chenille")) {
			price += 30;
		} else if (material.equals("cashmere")) {
			price += 45;
		}

		this.material = material;
	}


	public String featureReport() {
		return color + " " + size + " blanket made from " + material + ", total price: " + df.format(this.price);
	}

}
