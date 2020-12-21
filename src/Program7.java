import java.util.HashSet;

public class Program7 {

	public static void main(String[] args) {
		// Write a program to convert HashSet to Array?
		
		
				 HashSet<String> ali = new HashSet<String>();
				 ali.add("India");
				 ali.add("Pakistan");
				 ali.add("London");
				 ali.add("Ameriaca");
			     System.out.println("HashSet contains: "+ ali);
			     String[] array = new String[ali.size()];
			     ali.toArray(array);
			     System.out.println("Array elements: ");
			     for(String x : array){
			        System.out.println(x);
			     }

	}

}
