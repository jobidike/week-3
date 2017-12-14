import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> largeAnimals =new ArrayList<String>();
		
		largeAnimals.add("Zebra");
		largeAnimals.add("Giraffe");
		largeAnimals.add("Ape");
		largeAnimals.add("bear");
		largeAnimals.add("Lion");
		System.out.println(largeAnimals);
		
		//enhanced for loop to make it print out vertically
		for (String largeAnimal: largeAnimals) {
			System.out.println(largeAnimal);
		}
	}
	
	

}
