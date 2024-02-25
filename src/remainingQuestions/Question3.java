package remainingQuestions;

import java.lang.reflect.Array;
import java.util.TreeMap;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create tree map o employee ids and names
	TreeMap<Integer, String> employeeMap = new TreeMap<>();
	
	//Add ids and names to tree
	employeeMap.put(101, "Diya");
	employeeMap.put(102, "Megha");
	employeeMap.put(104, "Saha");
	employeeMap.put(103, "Roshan");
	System.out.println(employeeMap);
	//print employee name in alphabetical order
	System.out.println("Employee names in alphabetical order:");
	for (String name: employeeMap.values()) {
		System.out.println(name);
	}
	
		
	}

}
