import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
	
		//<String> means array list of strings
	ArrayList<String> giantWords = new ArrayList<String>();
	giantWords.add("fee");
	giantWords.add("fie");
	giantWords.add("foe");
	System.out.println(giantWords); //toString
	System.out.println("my list has " + giantWords.size() + " elements");

	giantWords.add("fum");
	
	//another way to change up the order of fum and make it vertical
//	for (int i=0; i < giantWords.size(); i++) {
//		System.out.println(giantWords.get(i) + ", ");
//	}
	//same as enhanced for loop below
//	System.out.println(giantWords);
//	System.out.println("my list has " + giantWords.size() + " elements");
	
	//enhanced for loop (for each loop)
	for(String giantWord: giantWords) {
		System.out.println(giantWord + ", ");
	}
	ArrayList<Integer> answers = new ArrayList<Integer>();
	answers.add(1);
	System.out.println("\nAre you out of answers? " + answers.isEmpty());
	
	ArrayList<String> myTools = new ArrayList<String>();
	myTools.add("hammer");
	myTools.add("shovel");
	myTools.add("wrench");

	if(myTools.contains("hammer")) {
	  System.out.println("I have a hammer at " + myTools.indexOf("hammer"));
	}
	
	
	
	
	
	}
}
