import java.util.*; 

public class Tribonacci  

 { 

 public static void main(String args[]) { 

  Scanner sc=new Scanner(System.in); 

  System.out.println("Enter Limit"); 

  int n=sc.nextInt(); 

  int a = 0, b = 1, c = 2, d = 0; 

  System.out.print(a + " , " + b + " , " + c); 

  for (int i = 4; i <= n; i++) { 

   d = a + b + c; 

   System.out.print(", " + d); 

   a = b; 

   b = c; 

   c = d; 

  } 

} 

} 
