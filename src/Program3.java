import java.util.ArrayList;
import java.util.Collections;

public class Program3 {

	public static void main(String[] args) {
		// Write a program to sort ArrayList in descending order
		ArrayList<String> ali=new ArrayList<String>(); 
		ali.add("Dat"); 
		ali.add("Hamza");  
		ali.add("Ali");  
		ali.add("Ashraf");
		Collections.reverse(ali);
		System.out.println("Sorted in Descending order: " + ali);

	}

}
