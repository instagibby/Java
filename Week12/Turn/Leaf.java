public class Leaf implements Turner{
	//Spencer Davis
	private String color;
	private String type;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String flip() {
		// TODO Auto-generated method stub
		return "Changing colors";
	}
	@Override
	public String turn() {
		// TODO Auto-generated method stub
		return "Changing colors";
	}
	@Override
	public String eat(String eater) {
		// TODO Auto-generated method stub
		return eater + " goes numnum";
	}
	@Override
	public String eat(String eater, String sound) {
		// TODO Auto-generated method stub
		return eater + " says " + sound;
	}
	
	
}
