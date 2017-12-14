import java.util.Map;
import java.util.HashMap;


public class Resturant {

	public static void main(String[] args) {

		Map<String, Double> menuItems = new HashMap<String, Double>();

		menuItems.put("Spaghetti", 8.97);
		menuItems.put("Lasagna", 10.98);
		menuItems.put("Pizza", 15.50);
		menuItems.put("Caesar Salad", 7.00);
		menuItems.put("Kale Salad", 7.00);

		System.out.println(menuItems.get("Spaghetti"));
		// double spaghettiPrice = menuItems.get("Spaghetti"); same as above
		// System.out.println(spaghettiPrice);

		System.out.println("There are " + menuItems.size() + " items on the menu");

		menuItems.put("Bottle of Champagne", 200.00);
		System.out.println("The Bottle of Champagne is $" 
				+ menuItems.get("Bottle of Champagne"));

		menuItems.put("Bottle of Vintage Wine", 175.00);
		System.out.println("The Bottle of Vintage Vine is $" 
		+ menuItems.get("Bottle of Vintage Wine"));
		
		if (menuItems.containsKey("Bottle of Champagne")) {
			System.out.println("Yes, we have a Bottle of Champagne!");
		} else {
			System.out.println("Do the Dew");
		}
		if (menuItems.containsValue(13.50)) {
			System.out.println("Yes, we do have a wine for $13.50.");
		} else {
			System.out.println("Sorry, we don't.");
		}

		menuItems.remove("Kale Salad");
			System.out.println("Menu contains fungus salad: " + menuItems.containsKey("Kale Salad"));

		menuItems.clear();
		if (menuItems.isEmpty()) {
			System.out.println("Menu is clear: ");
			}

		
	}
}
