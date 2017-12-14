import java.util.HashMap;
import java.util.Map;

public class Resturant2 {

	public static void main(String[] args) {
		
		Map<String, Double> menuItems = new HashMap<String, Double>();
		
		menuItems.put("Spaghetti",8.97);
		menuItems.put("Lasagna", 10.98);
		menuItems.put("Pizza", 15.50);
		menuItems.put("Caeser Salad", 7.00);
		menuItems.put("Kale Salad", 7.00);
		
		System.out.println(menuItems.get("Spaghetti"));
		
		System.out.println("There are " + menuItems.size() + " items on the menu.");
		
		menuItems.put("Bottle of Champagne", 200.00);
		System.out.println("The Bottle of Champagne cost $" +
				menuItems.get("Bottle of Champagne"));
		
		menuItems.put("Bottle of Vintage Wine", 175.00);
		System.out.println("The Bottle of Vintage Wine cost $"
				+ menuItems.get("Bottle of Vintage Wine"));
		
		if (menuItems.containsKey("Bottle of Champagne")) {
			System.out.println("Yes, we have bottles of Champagne available!");
		} else {
			System.out.println("Sorry we don't");
		}
		if (menuItems.containsValue(13.50)) {
			System.out.println("15.50 is a price on the menu!");
		} else {
			System.out.println("You can't get out of this one!");
		}
		
		menuItems.remove("Kale Salad");
		System.out.println("The fungus has been removed from the Kale salad: " 
				+ menuItems.containsKey("Kale Salad"));
		
		menuItems.clear();
		if (menuItems.isEmpty()) {
			System.out.println("All items have been removed from the menu!");
		} else {
			System.out.println("Oops, I missed something!");
		}
		
		
		

	}

}
