import java.util.*; 

public class lcmgcd { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

     int lcm=1, gcd=1; 

     System.out.println("Enter First Number"); 

int a=sc.nextInt(); 

   System.out.println("Enter Second Number"); 

int b=sc.nextInt(); 

for (int i=1;i<10;i++) 

{ 

lcm=(a*b)/2; 

if (i==2||i==3||i==5||i==7) 

{ 

if (a%i==0&b%i==0) 

{ 

gcd=i; 

}} 

} 

System.out.println("LCM= "+lcm); 

System.out.println("GCD= "+gcd); 

}} 
