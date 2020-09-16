import java.util.*; 

public class discount { 

    public static void main(String args[]) { 

        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter amount of Purchase"); 

        int amt=sc.nextInt(); 

        System.out.println("Price (no discount)= " + amt); 

        if (amt>1000) 

        { 

         double d= amt/10; 

        System.out.println("Dicount="+ d);    

        double famt=amt-d; 

        System.out.println("Price after Dicount="+ famt); 

        } 

    } 

} 
