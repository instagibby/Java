
public class ClassroomTesterDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Classroom CompSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 25);
		Classroom BioLab = new Classroom("3", "28a", "Ankeny", "Science Lab", 22);
		Classroom LitRoom = new Classroom("2", "12", "Urban", "Classroom", 18);
		
		
		System.out.println(CompSciLab.toString());
		System.out.println(BioLab.toString());
		System.out.println(LitRoom.toString());
	}

}
