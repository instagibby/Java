
public class Team {
	// Spencer Davis
	
	private String teamName;
	private int teamId;
	private int numberOfPlayers;
	private String captain;
	private static int nextTeamId = 1000;
	
	public Team() {
		super();
		
		nextTeamId++;
		teamId = nextTeamId;
	}
	
	
	public Team(String teamName, int numberOfPlayers, String captain) {
		super();
		this.teamName = teamName;
		this.numberOfPlayers = numberOfPlayers;
		this.captain = captain;
		
		nextTeamId++;
		teamId = nextTeamId;
		
		if (teamName == null || numberOfPlayers == 0) {
			throw new IllegalArgumentException("Object Not Created");
		}
	}



	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		if (teamName == "") {
			this.teamName = null;
		} else {
			this.teamName = teamName;
		}
		
	}

	public int getTeamId() {
		return teamId;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		
		if (numberOfPlayers >= 7 || numberOfPlayers <= 13) {
			this.numberOfPlayers = numberOfPlayers;
		} else {
			this.numberOfPlayers = 0;
		}
		
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", numberOfPlayers=" + numberOfPlayers
				+ ", captain=" + captain + "]";
	}


	public String teamReport() {
		return "Team ID: " + teamId + ", Team Name: " + teamName + ", # of Team Members: " + numberOfPlayers + ", Captain " + captain;
	}
	
	
}
