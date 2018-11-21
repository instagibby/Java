import java.util.ArrayList;

public class Roster {

	public String teamName;
	ArrayList<Player> teamList = new ArrayList<Player>();

	public Roster() {
		super();

	}

	public Roster(String teamName) {
		super();
		this.teamName = teamName;

	}

	public void addToTeam(Player p) {

		teamList.add(p);
	}

	public String displayRoster() {

		return teamName + ": " + teamList.toString();
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}	

}
