import java.util.*; 

public class Main { 

    public static void main(String args[]) { 

    Scanner sc= new Scanner(System.in); 

    float sum=0; 

     System.out.println("Enter limit"); 

int l=sc.nextInt(); 

for(int i=1;i<=l;i++) 

{ 

  float f=1; 

    for(int j=1; j<=i; j++) 

    { 

            f=f*j; 

    } 

    sum=sum+(1/f); 

} 

        System.out.println("Factorial sum= "+sum); 

    }} 
