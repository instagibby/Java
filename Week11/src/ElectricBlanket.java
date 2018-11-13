
public class ElectricBlanket extends Blanket {
	private int heatSettingsNo;
	private boolean shutOff;
	private String withOrWithout = "without";
	

	public ElectricBlanket() {
		super();
		this.heatSettingsNo = 1;
		this.shutOff = false;
	}
	
	

	public ElectricBlanket(String color, String size, String material, int heatSettingsNo, boolean shutOff) {
		super(color, size, material);
		setHeatSettingsNo(heatSettingsNo);
		setShutOff(shutOff);
	}

	public int getHeatSettingsNo() {
		return heatSettingsNo;
	}

	public void setHeatSettingsNo(int heatSettingsNo) {
		if ((heatSettingsNo > 5) || (heatSettingsNo < 1)) {
			this.heatSettingsNo = 1;
		} else {
			this.heatSettingsNo = heatSettingsNo;
		}
	}

	public boolean isShutOff() { 
		return shutOff;
	}

	public void setShutOff(boolean shutOff) {
		if (shutOff) {
			this.price += 5.75;
			withOrWithout = "with";
		}
		this.shutOff = shutOff;
	}
	public String featureReport() {
		return color + " " + size + " blanket made from " + material + ", total price: " 
				+ df.format(this.price) + " including "+heatSettingsNo +" settings " + withOrWithout + " auto shut off.";
	}

}
