import java.util.*; 

public class palindrome 

{ 

    public static void main(String[] args) 

    { 

        Scanner sc=new Scanner(System.in); 

        int rem, fin=0; 

        System.out.println("Enter a Number"); 

        int n=sc.nextInt(); 

        int nn=n; 

        while(n>0) 

        { 

            rem=n%10; 

            fin=fin*10+rem; 

            n=n/10; 

        } 

     if(nn==fin) 

     { 

          System.out.println("Palindrome"); 

     } 

     else 

     { 

       System.out.println("NO"); 

     } 

}} 
