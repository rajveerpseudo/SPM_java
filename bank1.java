import java.util.*; 

public class sort { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

    System.out.println("Enter the Amount Deposited"); 

    int amt=sc.nextInt(); 

    System.out.println("Enter the number of years"); 

    int n=sc.nextInt(); 

    double i; 

    if (n>=5) 

   { 

       i=(0.1*amt)*n; 

   } 

   else if (amt<2000 & n>=2) 

   { 

       i=(0.05*amt)*n; 

   } 

   else if (amt>=2000 & n>=2) 

   { 

       i=(0.07*amt)*n; 

   } 

   else 

   { 

       i=(0.03*amt)*n; 

   } 

   System.out.println("Money in account = INR "+(amt+i)); 

    } 

} 
