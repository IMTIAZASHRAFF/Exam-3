import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program2 {

	public static void main(String[] args) {
		//Write a program to sort HashMap by keys ? (5)
		HashMap<Integer, String>ali = new HashMap<Integer,String>();
		ali.put(1, "Imtiaz");
		ali.put(2,"Dar");
		ali.put(4, "Hamza");
		ali.put(3, "USA");
		TreeMap<Integer, String> sorted = new TreeMap<>(ali);
		for (Map.Entry<Integer, String> entry : sorted.entrySet())
            System.out.println("Value is: " + entry.getValue() + " & Key is: " + entry.getKey());
		
		}
	


	}


