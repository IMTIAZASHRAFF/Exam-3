
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		// Write a program to convert LinkedList to ArrayList?
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Dar");
	    linkedlist.add("Baber");
	    linkedlist.add("Ali");
	    linkedlist.add("Rohan");
	    linkedlist.add("nani");

	    List<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.println(str);
	    }
	 }

	}


