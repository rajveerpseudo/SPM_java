import java.util.*; 

public class sort { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

    double f=1, sum=0; 

    System.out.println("Enter the value of x"); 

    int x=sc.nextInt(); 

    for (int i=1;i<7;i++) 

    { 

    for (int j=1;j<i;j++) 

    { 

        f=f*j; 

    } 

    if (i%2==0) 

    { 

        sum=sum-(Math.pow(x,i)/f); 

    } 

    else 

    { 

        sum=sum+(Math.pow(x,i)/f); 

    } 

    } 

    System.out.println("Sum= "+sum); 

    } 

} 
