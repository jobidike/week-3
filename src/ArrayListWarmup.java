import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWarmup {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		String name = "";
		
		while (!name.equals("q")) {
			System.out.println("Please enter a name to add to the list:  ");
			name = input.nextLine();
			if (!name.equals("q")) {
				addNameToList(names, name);
			}
		}
		
		printNamesToConsole(names);
	}
	
	public static void addNameToList(ArrayList<String> nameList, String inputName) {
		nameList.add(inputName);
	}
	
	public static void printNamesToConsole(ArrayList<String> namesToPrint) {
		System.out.println("Names in the list:  ");
		for (String name : namesToPrint) {
			System.out.println(name);
		}
	}

}
