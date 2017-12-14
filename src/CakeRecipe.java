import java.util.ArrayList;

public class CakeRecipe {

	public static void main(String[] args) {

		ArrayList<String> ingredients = new ArrayList<String>();

		ingredients.add("flour");
		ingredients.add("sugar");
		ingredients.add("cocoa");
		ingredients.add("oil");
		ingredients.add("eggs");
		ingredients.add("baking soda");
		ingredients.add(1, "milk");
		ingredients.remove(0);
		ingredients.set(3, "olive oil");
		
		for (int i = 0;  i < ingredients.size(); i++){
            ingredients.get(i);
		}
		for(String ingredient: ingredients){
            System.out.println(ingredient);
		}
		System.out.println("There are " + ingredients.size() + " ingredients." + "\nBake a cake with these ingredients. ");

		
	}

}
