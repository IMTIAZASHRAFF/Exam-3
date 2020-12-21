import java.util.Scanner;

public class Project19 {

	public static void main(String[] args) {
		// Format the input by using Scanner 
		 Scanner ali=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=ali.next();
             int x=ali.nextInt();
             System.out.printf("%-15s%03d%n",s1,x);
         }
         System.out.println("================================");

	}

}
