package week10;

public class Address {
	// Spencer Davis
	
	
	private String HouseNo;
	private String StreetName;
	private String AptNo;
	private String City;
	private String State;
	private String Zip;
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
		setAptNo(" ");
	}


	// Includes AptNo
	public Address(String houseNo, String streetName, String aptNo, String city, String state, String zip) {
		super();
		HouseNo = houseNo;
		StreetName = streetName;
		AptNo = aptNo;
		City = city;
		State = state;
		Zip = zip;
	}
	
	
	// NO AptNo
	public Address(String houseNo, String streetName, String city, String state, String zip) {
		super();
		HouseNo = houseNo;
		StreetName = streetName;
		City = city;
		State = state;
		Zip = zip;
		
		setAptNo("");
		
	}
	
	
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getAptNo() {
		return AptNo;
	}
	public void setAptNo(String aptNo) {
		AptNo = aptNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	
	
	public void print() {
		
		System.out.println(getHouseNo() + " " + getStreetName() + " " + getAptNo());
		System.out.println(getCity() + " " + getState() + " " + getZip());
	}
	
	
}

