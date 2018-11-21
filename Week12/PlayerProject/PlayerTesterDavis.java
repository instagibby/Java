
public class PlayerTesterDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		BaseballPlayer basebp1 = new BaseballPlayer();
		BaseballPlayer basebp2 = new BaseballPlayer();
		BasketballPlayer baskbp1 = new BasketballPlayer();
		BasketballPlayer baskbp2 = new BasketballPlayer();
		
		basebp1.name = "john";
		basebp1.id = 1;
		basebp1.position = "pitcher";
		basebp1.battingAvg = 12.14;
		
		basebp2.name = "jimmy";
		basebp2.id = 2;
		basebp2.position = "catcher";
		basebp2.battingAvg = 22.42;
		
		baskbp1.name = "john";
		baskbp1.id = 1;
		baskbp1.position = "pitcher";
		baskbp1.freeThrowPercent = 0.75f;
		
		baskbp2.name = "jimmy";
		baskbp2.id = 2;
		baskbp2.position = "catcher";
		baskbp2.freeThrowPercent = 0.53f;
		
		
		System.out.println(basebp1.toString());
		System.out.println(basebp2.toString());
		System.out.println(baskbp1.toString());
		System.out.println(baskbp2.toString());
		
		Roster rost1 = new Roster("Sad Boiz Baseball");
		Roster rost2 = new Roster("Sad Boiz Basketball");
	
		rost1.addToTeam(basebp1);
		rost1.addToTeam(basebp2);
		rost2.addToTeam(baskbp1);
		rost2.addToTeam(baskbp2);
		System.out.println(rost1.displayRoster());
		System.out.println(rost2.displayRoster());
		
	}

}
