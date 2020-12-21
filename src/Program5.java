import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		// Write a program to remove element from specified index of ArrayList?
		ArrayList<String> ali=new ArrayList<String>(); 
		ali.add("Data"); 
		ali.add("Hamza");  
		ali.add("Ali");  
		ali.add("Ashraf");
		System.out.println(ali);
		ali.remove(2);
		System.out.println("Remove indax 2" + ali);

	}

}
