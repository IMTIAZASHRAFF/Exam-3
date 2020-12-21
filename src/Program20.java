import java.util.HashMap;
import java.util.Map.Entry;

public class Program20 {

	public static void main(String[] args) {
		/* Convert Roman number into Integer
* I             1
V             5
X             10
L             50
C             100
D             500
		 */
		
		HashMap<String, Integer> ali = new HashMap <String, Integer>();
		ali.put("I",1 );
		ali.put("X", 5);
		ali.put("V", 10);
		ali.put("L", 50);
		ali.put("C", 100);
		ali.put("D", 500);
		for(int x=0;x<ali.size();x++) {
			System.out.println(ali.get(x));
			
		}

	}

}