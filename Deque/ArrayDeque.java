//Part B 
public class ArrayDeque implements Deque<E>
  {
    private int[] anArray;
    int numItems;
    
    public ArrayDeque()
    {
      anArray = new int[10];
      numItems = 10;
    }
    
    boolean isEmpty()
    {
      if (numItems == 0)
        return true;
      else
        return false;
    }
    
    boolean addFirst(E item)
    {
      anArray[0] = anArray[1];
      anArray[0] = item;
      numItems++;
    }
    
    boolean addLast(E item)
    {
      anArray[numItems] = anArray[numItems-1];
      anArray[numItems] = anArray[item];
      numItems++;
    }
    
    boolean contains(Object o)
    {
      for (int i=0;i<=numItems;i++)
        if (anArray[i] == o)
           return true;
      else
        return false;
    }
    
    E removeFirst()
    {
      for (int i=0;i<numItems;i++)
        anArray[i+1]=anArray[i];
      numItems--;
    }
    
    E removeLast()
    {
      for (int i=numItems;i<0;i--)
        anArray[numItems-1]=anArray[i];
      numItems--;
    }
    
    E peekFirst()
    {
      return anArray[0];
    }
    
    E peekLast()
    {
      return anArray[numItems];
    }
 }
        
        
        
        