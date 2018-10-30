import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExampleDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       // Part A)
       names.addAll(Arrays.asList("Andy", "Angela", "Dwight", "Erin", "Jim", "Michael", "Pam", "Toby"));
       System.out.println("Array list" + names);
       
       // Part B)
       System.out.println("Names: ");
       for (int i = 0; i < names.size(); i++) {
    	   System.out.println(names.get(i));
       }
       
       // Part C)
       System.out.println("Names size is: " + names.size());
       
       // Part D)
       System.out.println("Last name in names: " + names.get(names.size() - 1));
       
       // Part E)
       names.set(0, "Andy Bernard");
       
       // Part F)
       names.add(5, "Kelly");
       System.out.println("Names again: ");
       for (int i = 0; i < names.size(); i++) {
    	   System.out.println(names.get(i));
       }
       
       // Part G)
       System.out.println("Enchanced for names: ");
       for (String name : names)
       {
          System.out.println(name);
       }
       
       // Part H)
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println("Names 2: " + names2);
       
       // Part I)
       names.remove(0);
       System.out.println("Names: ");
       for (String name : names)
       {
          System.out.println(name);
       }
       System.out.println("Names2: ");
       for (String name : names)
       {
          System.out.println(name);
       }
       
	}

}

