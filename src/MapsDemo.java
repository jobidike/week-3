
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		
		//first parameterized key, second parameterized value
		Map<String, String> students = new HashMap<String, String>();
		
		students.put("23A52", "Harvey Dent");
		students.put("68Z29", "Jessica Jones");
		students.put("57W85", "J Jonah Jameson");
		
		System.out.println("The students are " + students);
		
		String studentName = students.get("23A52");
		System.out.println("Found the student!");
		System.out.println("The student's name name is " + studentName);
		
		Set<String> studentIds = students.keySet();
		System.out.println("The student IDs are " + studentIds);
		
		Collection<String> studentNames = students.values();  //house in maintenance class for map
		System.out.println("The student names are " + studentNames);
		
		System.out.println("\nLoop #1");//Loop 1 returns all the keys, use keys to get value in map
		for(String id: students.keySet()) {
			  System.out.println("This student's name is " + students.get(id));
			}
		System.out.println("\nLoop #2");//Loop 2 if you don't need to print the key we don't need to 
		for(Entry<String, String> entry: students.entrySet()) {
			  System.out.println("The student's id is " + entry.getKey());
			  System.out.println("The student's name is " + entry.getValue());
			}
	}

}
