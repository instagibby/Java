package Model;

public class Classroom {
	// Spencer Davis

	private String Building;
	private String RoomNumber;
	private String Campus;
	private String Type;
	private int Capacity;

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(String building, String roomNumber, String campus, String type, int capacity) {
		super();
		Building = building;
		RoomNumber = roomNumber;
		Campus = campus;
		Type = type;
		Capacity = capacity;
	}

	public String getBuilding() {
		return Building;
	}

	public void setBuilding(String building) {
		Building = building;
	}

	public String getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		RoomNumber = roomNumber;
	}

	public String getCampus() {
		return Campus;
	}

	public void setCampus(String campus) {
		Campus = campus;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	@Override
	public String toString() {
		return "Classroom [Building=" + Building + ", RoomNumber=" + RoomNumber + ", Campus=" + Campus + ", Type="
				+ Type + ", Capacity=" + Capacity + "]";
	}

}
