import java.util.ArrayList;

public class NumberExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(23);
		numbers.add(9);
		numbers.add(77);
		numbers.add(922);
		numbers.add(6);
		numbers.add(32);
		numbers.add(63);
		numbers.add(14);
		numbers.add(5);
		isOnList(numbers);
		System.out.println("\nNow doing some removals");
		numbers.remove(new Integer(23)); // or numbers.remove(numbers.indexOf(23));
		numbers.remove(new Integer(922));
		numbers.remove(new Integer(32));
		numbers.remove(new Integer(6));
		isOnList(numbers);

		// 2 other ways to remove:    numbers.remove(numbers.remove(23));
				//numbers.remove((Integer) 23); 
	}

	public static void isOnList(ArrayList<Integer> numbers) {
		if (numbers.contains(23)) {
			System.out.println("23 does exist");
		} else {
			System.out.println("23 does not exist");
		}

		if (numbers.contains(77)) {
			System.out.println("77 does exist");
		} else {
			System.out.println("77 does not exist");
		}

		if (numbers.contains(15)) {
			System.out.println("15 does exist");
		} else {
			System.out.println("15 does not exist");
		}
	   
		

	}

}
