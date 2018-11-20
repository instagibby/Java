
public class TurnerTester {

	public static void main(String[] args) {
		// Spencer Davis
		
		Leaf oak = new Leaf();
		Page comic = new Page();
		Pankcake flapJack = new Pankcake();
		
		
		System.out.println(oak.turn());
		System.out.println(comic.turn());
		System.out.println(flapJack.turn());
		
		System.out.println(oak.flip());
		System.out.println(comic.flip());
		System.out.println(flapJack.flip());
		
		System.out.println(oak.eat("catepillar", "nam nam nam"));
		System.out.println(comic.eat("Paper Shredder", "vrrrmmmnnmmm"));
		System.out.println(flapJack.eat("Kelli","Yuck"));
		
		
	}

}
