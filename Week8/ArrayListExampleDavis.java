import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExampleDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       names.addAll(Arrays.asList("Andy", "Angela", "Dwight", "Erin", "Jim", "Michael", "Pam", "Toby"));
       System.out.println("Array list" + names);
       
       //names.get();
	}

}

