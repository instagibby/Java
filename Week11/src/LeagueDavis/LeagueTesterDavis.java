
public class LeagueTesterDavis {
	// Spencer Davis
	
	
	public static void main(String[] args) {

		Team teamGryffindor  = new Team("Gryffindor ", 13, "Minerva McGonagall");
		Team teamSlytherin = new Team("Slytherin", 12, "Horace Slughorn");
		Team teamHufflepuff = new Team("Hufflepuff", 8, "Pomona Sprout");
		Team teamRavenclaw = new Team("Ravenclaw", 9, "Filius Flitwick");
		Team teamGibby = new Team("Gibby", 6, "Spencer");
		
		Team teamGibby2 = teamGibby.createSameTeamForNextSession();
		Team teamGibby3 = teamGibby.createSameTeamForNextSession();
		Team teamGibby4 = teamGibby.createSameTeamForNextSession();
		
		System.out.println(teamGryffindor.teamReport());
		System.out.println(teamSlytherin.teamReport());
		System.out.println(teamHufflepuff.teamReport());
		System.out.println(teamRavenclaw.teamReport());
		System.out.println(teamGibby.teamReport());
		System.out.println(teamGibby2.teamReport());
		System.out.println(teamGibby3.teamReport());
		System.out.println(teamGibby4.teamReport());
		
	}
}

