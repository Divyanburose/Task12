package remainingQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create list of strings
	List<String> stringList = new ArrayList<>();
stringList.add("Ramesh");
stringList.add("Suresh");
stringList.add("Rajesh");
stringList.add("Magesh");

//convert list to array
String[] stringArray = new String [stringList.size()];
stringArray = stringList.toArray(stringArray);

// Print the elements of the Array
System.out.println("Elements of the Array:");
for (String element : stringArray) {
    System.out.println(element);
}
}
	}

