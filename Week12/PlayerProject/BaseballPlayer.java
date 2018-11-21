
public class BaseballPlayer extends Player {
	double battingAvg;

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	@Override
	public String toString() {
		return  "Name: "+ this.name + ", id:" + this.id + ", position: " + this.position + " battingAvg: " + battingAvg;
	}
	
	
}
