import java.util.*; 

public class reversed { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

    int sum=0, rem; 

     System.out.println("Enter Number"); 

int n=sc.nextInt(); 

while(n>0) 

{ 

rem=n%10; 

sum=(sum*10)+rem; 

n=n/10; 

} 

        System.out.println("Reversed Number= "+sum); 

    }} 
