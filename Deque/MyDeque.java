import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;

public interface Deque<E> extends Queue
{
  boolean isEmpty();
  boolean addFirst(E item);
  boolean addLast(E item);
  boolean contains(Object o);
  E removeFirst();
  E removeLast();
  E peekFirst();
  E peekLast();
}

public class ImpDeque implements Deque<E>
{
  boolean isEmpty();
  {
    if (E.isEmpty())
      return true;
  }
  
  boolean addFirst(E item)
  {
    if(E.addFirst(item))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  boolean addLast(E item)
  {
    if(E.addLast(item))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  boolean contains(Object o)
  {
    if (E.contains(o))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  E removeFirst()
  {
    E.removeFirst();
  }
  
  E removeFirst()
  {
    E.removeLast();
  }
  
  E peekFirst()
  {
    return E.peekFirst();
  }
  
  E peekLast()
  {
    return E.peekLast();
  }
      
  public static void main(String[] args)
  {
   /*Part A*/ Deque<Integer> d = new LinkedList<Integer>(10);
   /*Part B*/
    
    boolean value = d.isEmpty();
    if (value == true) 
    {
       System.out.println("deque is empty");
    }
    else 
    {
       System.out.println("deque is not empty");
    }
    
    d.addFirst(5);
    d.addLast(7);
    d.contains(5);
    d.peekFirst();
    d.peekLast();
    d.removeFirst();
    d.removeLast();
    d.isEmpty();
  }
}