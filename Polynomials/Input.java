import java.util.*;
public class Input
{ 
     
      System.out.println("What degree polynomial would you like?");
      Scanner p = new Scanner(System.in);
      while(!p.hasNextInt())
      {
        p.next();
        System.out.println("Please enter an integer: ");
      }
      degree = p.nextInt();
      for(int i = degree; i>0; i--)
      {
        System.out.println("Enter the coefficient of the term x^ + i");
        coefficients = p.nextInt();
        polynomial.polynomial(coefficients, degree);
        System.out.println("You entered: " + polynomial); 
      }
      
      
      System.out.println("What wouldyou like to do with this polynomial?");
      System.out.println("1) Evaluate it for a particular value of x");
      System.out.println("2) Get the derivative of the polynomial");
      Scanner c = new Scanner(System.in);
      int choice = c.nextInt();
      switch(choice)
      {
        case 1:
          int x;
          //Polynomial a = new Polynomial(coefficients, degree);
          polynomial.evaluate(x);
          question();
          break;
          
        case 2:
          polynomial.differentiate();
          question();
          break;
          
        default:
          System.err.println ( "Unrecognized option" );
          break;
    }
     }
    public void exit()
    {
      System.out.println("Goodbye");
    }
    
    public void question()
    {
 System.out.println("Would you like to proceed or quit?");
 System.out.println("To proceed enter 9.");
 System.out.println("If you wish to quit enter 0.");
 Scanner q = new Scanner(System.in);
       
 switch (q.nextInt()) 
 {
     case 0:
     System.out.println ("Goodbye.");
     break;
  
     case 9:
     System.out.println ("Please proceed.");
     new Input();
     break;
     default:
     System.err.println ( "Unrecognized option" );
     break;
 }
    }
 
    public static void main (String[]args)
    {
      int degree;
      int coeffiecients;
      Polynomial polynomial = new Polynomial();
       System.out.println("What degree polynomial would you like?");
      Scanner p = new Scanner(System.in);
      while(!p.hasNextInt())
      {
        p.next();
        System.out.println("Please enter an integer: ");
      }
      degree = p.nextInt();
      for(int i = degree; i>0; i--)
      {
        System.out.println("Enter the coefficient of the term x^ + i");
        coefficients = p.nextInt();
        polynomial.polynomial(coefficients, degree);
        System.out.println("You entered: " + polynomial); 
      }
      new Input();
    }
}