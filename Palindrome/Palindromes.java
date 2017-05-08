import java.util.*;
import java.util.LinkedList;
public class Palindromes
{
   public static void main (String[] args) 
   {
      String s = "racecar";
      System.out.println("Racecar is a palindrome.");
      System.out.println(isPal(s));
   }
   
    public static boolean isPal(String str)
    {
      SimpleQueue aQueue = new SimpleQueue();
      Stack<Object> aStack = new Stack<Object>();
      int length = str.length();
      for (int i = 1; i < length; i++)
      {
        aQueue.enqueue(str.charAt(i));
        aStack.push(str.charAt(i));
      }
      boolean charactersareequal = true;
      while (aQueue.isEmpty() == false && charactersareequal == true)
      {
        Object queueFront = aQueue.dequeue();
        Object stackTop = aStack.pop();
        if (queueFront != stackTop)
        {
          charactersareequal = false;
        }
      }
      return charactersareequal;
    }      
}