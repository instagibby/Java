package src;
class BlanketTest {

	public static void main (String[]args) {
		
		Blanket myBlanket = new Blanket("gold", "king", "cashmere");
		ElectricBlanket electricBlanket = new ElectricBlanket("red", "king", "cashmere", 5, true);
		ElectricBlanket electricBlanket2 = new ElectricBlanket("multi-colored", "queen", "cotton", 1, false);
		Blanket myBlanket2 = new Blanket("black", "twin", "wool");
		
		
		System.out.println(myBlanket.featureReport());
		System.out.println(electricBlanket.featureReport());
		System.out.println(myBlanket2.featureReport());
		System.out.println(electricBlanket2.featureReport());
	
	}
}

