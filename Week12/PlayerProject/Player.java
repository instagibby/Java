
public class Player {
	protected int id;
	protected String name;
	protected String position;
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	
	
}
