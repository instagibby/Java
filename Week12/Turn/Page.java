
public class Page implements Turner{

	@Override
	public String flip() {
		// TODO Auto-generated method stub
		return "Book is now upside down";
	}

	@Override
	public String turn() {
		// TODO Auto-generated method stub
		return "Next page is currentPage++";
	}

	@Override
	public String eat(String eater) {
		// TODO Auto-generated method stub
		return eater + "says it tastes gross.";
	}

	@Override
	public String eat(String eater, String sound) {
		// TODO Auto-generated method stub
		return eater + " says " + sound;
	}

	
	
}
