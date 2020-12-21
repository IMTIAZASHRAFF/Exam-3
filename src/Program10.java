
public class Program10 {
//	Write a program using StringBuilder/StringBuffer?
	
	public static void ali1(StringBuilder s1) 
    { 
        s1.append("London"); 
    } 
    public static void ali2(StringBuffer s2) 
    { 
        s2.append("London"); 
    } 
  
    public static void main(String[] args) 
    { 
        
  
        StringBuilder s1 = new StringBuilder("Beautiful country is "); 
        ali1(s1); 
        System.out.println("StringBuilder: " + s1); 
  
        StringBuffer s2 = new StringBuffer("Beautiful country is "); 
        ali2(s2); 
        System.out.println("StringBuffer: " + s2); 
    } 

}
