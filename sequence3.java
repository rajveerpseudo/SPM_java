import java.util.*; 

public class sort { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

    double sum=1; 

    System.out.println("Enter the value of x"); 

    int x=sc.nextInt(); 

    System.out.println("Enter the Limit"); 

    int l=sc.nextInt(); 

    for (int i=1;i<=l-1;i++) 

    { 

        sum=sum+(Math.pow(x,i)); 

    } 

    System.out.println("Sum= "+sum); 

    } 

} 
