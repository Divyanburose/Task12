package remainingQuestions;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//To create an array list of strings
	ArrayList<String> arraylist = new ArrayList<> ();
	//Adding element to the array list
	arraylist.add("Anbu");
	arraylist.add("Divya");
	arraylist.add("Roshan");
	arraylist.add("Adhivk");
	
	//Print array list before removing
	System.out.println("ArrayList before removing the element:"+arraylist);
	
	//remove all the elements from arraylist
	arraylist.clear();
	
	//Print array list after removing
	System.out.println("ArrayList after removing the elements:"+arraylist);
	
	
	}

}
