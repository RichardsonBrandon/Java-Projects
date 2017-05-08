

public interface Deque<E>
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
      
  public static void main(String[] args)
  {
    Deque<Integer> d = new LinkedList<Integer>(10);
    
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