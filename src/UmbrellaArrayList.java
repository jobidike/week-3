import java.util.ArrayList;

public class UmbrellaArrayList {  //slides from week 3 monday october 9, second bullet point

	public static void main(String[] args) {
		
		ArrayList<Boolean> conditions = new ArrayList<Boolean>();
		
		conditions.add(true);
		conditions.add(false);
		conditions.add(false);
		conditions.add(true);
		conditions.add(false);
		
		for(Boolean condition: conditions) {
			if(condition) {
				System.out.println("Better bring an umbrella");
			}else {
				System.out.println("No rain today, enjoy the sun!");
			}
		}

	}

}
