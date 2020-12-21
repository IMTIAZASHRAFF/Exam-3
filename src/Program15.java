import java.util.Deque;
import java.util.LinkedList;

public class Program15 {

	public static void main(String[] args) {
		// Write a program to add the element and remove the element on both the side?

		Deque<String> deque = new LinkedList<String>();  
    deque.add("Element 1 (Tail)"); 
    deque.addFirst("Element 2 (Head)");  
    deque.add("Element 4 (Head)"); 
    deque.add("Element 5 (Tail)"); 
    deque.add("Element 6 (Head)"); 
    deque.addLast("Element 3 (Tail)");
    System.out.println(deque + "\n"); 
    deque.removeFirst(); 
    deque.removeLast(); 
    System.out.println("Deque after removing " + "first and last: "+ deque); 
	}

}
