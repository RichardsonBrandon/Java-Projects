import java.util.*;
public class InputMenu 
{
    public static void display_menu() 
    {
 System.out.println("Complex Number Calculator");     
 System.out.println("1) Addition \n2) Subtraction \n3) Product \n4) Division \n5) Exit");
 System.out.print("Selection: ");
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
     new InputMenu();
     break;
     default:
     System.err.println ( "Unrecognized option" );
     break;
 }
    }
 
   public InputMenu() 
    {
 Scanner in = new Scanner(System.in);
        display_menu();
  
 switch (in.nextInt()) 
 {
     case 1:
     System.out.println ( "You picked Addition" );
     complex c=new complex();
     complex d=new complex();
     System.out.println("First number");
     c.read();
     System.out.println("\nSecond number");
     d.read();
     d.sum(c,d);
     question();
     break;
  
     case 2:
     System.out.println ( "You picked Subtraction" );
     complex a=new complex();
     complex b=new complex();
     System.out.println("First number");
     a.read();
     System.out.println("\nSecond number");
     b.read();
     b.sub(a,b);
     question();
     break;
  
     case 3:
     System.out.println ( "You picked Multiplication" );
     complex e=new complex();
     complex f=new complex();
     System.out.println("First number");
     e.read();
     System.out.println("\nSecond number");
     f.read();
     f.product(e,f);
     question();
     break;
     
     case 4:
     System.out.println ("You picked Division" );
     complex g=new complex();
     complex h=new complex();
     System.out.println("First number");
     g.read();
     System.out.println("\nSecond number");
     h.read();
     h.quotient(g,h);
     question();
     break;
     
     case 5:
     exit();
     break;
     
     default:
     System.err.println ( "Unrecognized option" );
     break;
 }
    }
 
    public static void main (String[]args)
    {
      new InputMenu();
    }
}