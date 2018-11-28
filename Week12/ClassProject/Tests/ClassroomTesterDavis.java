package Tests;

import java.time.LocalTime;

import ClassProject.Model.Classroom;
import Model.Course;
import Model.Instructor;

public class ClassroomTesterDavis {

	public static void main(String[] args) {
		// Spencer Davis

		Classroom CompSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 25);
		Classroom BioLab = new Classroom("3", "28a", "Ankeny", "Science Lab", 22);
		Classroom LitRoom = new Classroom("2", "12", "Urban", "Classroom", 18);
		Instructor wsmith = new Instructor("Wanda", "Smith");
		Instructor wfitz = new Instructor("Wilma", "Fitz");
		Instructor etheo = new Instructor("Emily", "Theo");
		Course bio101 = new Course("24680", "BIO101", LocalTime.of(11, 15), LocalTime.of(12, 15), wsmith, BioLab);
		Course cis171 = new Course("23456", "CIS171", LocalTime.of(10, 10), LocalTime.of(12, 20), wfitz, CompSciLab);
		Course lit105 = new Course("29876", "LIT105", LocalTime.of(15, 15), LocalTime.of(16, 30), etheo, LitRoom);
	

		System.out.println(CompSciLab.toString());
		System.out.println(BioLab.toString());
		System.out.println(LitRoom.toString());
		
		
		System.out.println("\n"+ "*************" + "\n");
		System.out.println(bio101.toString());
		System.out.println(cis171.toString());
		System.out.println(lit105.toString());
		
		
	}

}