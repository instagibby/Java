package week10;

public class LeaseTesterDavis {

	public static void main(String[] args) {
		
		Lease kelli = new Lease();
		kelli.setName("Kelli");
		kelli.setAptNo(007);
		kelli.setRent(1234);
		kelli.setLeaseLength(26);
		
		Lease spencer = new Lease("Spencer", 4, 1059, 12);
		
	
		System.out.println(kelli);
		System.out.println(spencer);
		
	}
	
}
