import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Program1 {

	public static void main(String[] args) {
		//Write a program to iterate the HashMap ?
		HashMap<Integer, String>ali = new HashMap<Integer,String>();
		ali.put(1, "Imtiaz");
		ali.put(2,"Dar");
		ali.put(3, "Hamza");
		ali.put(4, "USA");
		Set x = ali.entrySet();
		Iterator it = x.iterator();
		while(it.hasNext()) {
	       Map.Entry mentry = (Map.Entry)it.next();
	       System.out.println(" ");
	       System.out.println("value is: "+ mentry.getValue() + " Key is: " + mentry.getKey());
		}
	}

}
