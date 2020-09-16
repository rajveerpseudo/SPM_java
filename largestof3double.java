import java.util.*; 

public class MyClass { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

     System.out.println("Enter First Double Values"); 

     double d1= sc.nextDouble(); 

     System.out.println("Enter Second Double Values"); 

     double d2= sc.nextDouble(); 

     System.out.println("Enter Third Double Values"); 

     double d3= sc.nextDouble(); 

     double max=0; 

     while (max>=0) 

     { 

         if (max>=d1 & max>=d2 & max>=d3) 

         { 

            System.out.println("Biggest number= " + max); 

            break; 

         } 

         else if (max<d1) 

         { 

             max=d1; 

         } 

         else if (max<d2) 

         { 

             max=d2;   

         } 

         else if (max<d3) 

         { 

             max=d3;   

         } 

     } 

    } 

} 
