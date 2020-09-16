import java.util.*; 

public class circle { 

    public static void main(String args[]) { 

      Scanner sc=new Scanner(System.in); 

      double a,p; 

      System.out.println("Enter Radius of circle"); 

      double r=sc.nextDouble(); 

      a=3.14*Math.pow(r,2); 

      p=2*3.14*r; 

      System.out.println("Radius="+r+", Area="+a+", Perimeter="+p); 

} 

    } 
