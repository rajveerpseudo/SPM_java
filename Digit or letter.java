import java.util.*; 

public class dig { 

    public static void main(String args[]) { 

      Scanner sc=new Scanner(System.in); 

      System.out.println("Enter a character"); 

      char ch=sc.next().charAt(0); 

      int bb=(Character.isDigit(ch)) ? 1:2; 

      if(bb==1) 

      { 

          System.out.println("Digit"); 

      } 

      else 

      { 

          System.out.println("Letter"); 

      } 

    }} 
