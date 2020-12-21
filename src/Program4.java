import java.util.ArrayList;

public class Program4 {

	public static void main(String[] args) {
		// Write a program to add element at particular index of ArrayList?
		ArrayList<String> ali=new ArrayList<String>(); 
		ali.add("Data"); 
		ali.add("Hamza");  
		ali.add("Ali");  
		ali.add("Ashraf");
		System.out.println(ali);
		ali.add(2, "ADIL");
		System.out.println(ali);
	}

}
