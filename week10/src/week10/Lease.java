package week10;

public class Lease {

	private String Name;
	private int AptNo;
	private double Rent;
	private int LeaseLength;
	
	
	public Lease() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Lease(String name, int aptNo, double rent, int leaseLength) {
		super();
		Name = name;
		AptNo = aptNo;
		Rent = rent;
		LeaseLength = leaseLength;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAptNo() {
		return AptNo;
	}
	public void setAptNo(int aptNo) {
		AptNo = aptNo;
	}
	public double getRent() {
		return Rent;
	}
	public void setRent(double rent) {
		Rent = rent;
	}
	public int getLeaseLength() {
		return LeaseLength;
	}
	public void setLeaseLength(int leaseLength) {
		LeaseLength = leaseLength;
	}


	@Override
	public String toString() {
		return "Rental [Name=" + Name + ", AptNo=" + AptNo + ", Rent=" + Rent + ", LeaseLength=" + LeaseLength + "]";
	}
	
	
	
	
}
