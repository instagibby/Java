
public class Pancake implements Turner{

	@Override
	public String flip() {
		// TODO Auto-generated method stub
		return "Siiiizzzlllleee";
	}

	@Override
	public String turn() {
		// TODO Auto-generated method stub
		return "Flipping";
	}

	@Override
	public String eat(String eater) {
		// TODO Auto-generated method stub
		return eater + " says yum";
	}

	@Override
	public String eat(String eater, String sound) {
		// TODO Auto-generated method stub
		return eater + " says " + sound;
	}
	
}
