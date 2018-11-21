
public class BasketballPlayer extends Player {
	float freeThrowPercent;

	public float getFreeThrowPercent() {
		return freeThrowPercent;
	}

	public void setFreeThrowPercent(float freeThrowPercent) {
		this.freeThrowPercent = freeThrowPercent;
	}

	
	@Override
	public String toString() {
		return "Name: "+ this.name + ", id:" + this.id + ", position: " + this.position + " freeThrowPercent: " + freeThrowPercent;
	}
	
	
	
}
