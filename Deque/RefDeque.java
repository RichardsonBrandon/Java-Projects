//Part A
public class RefDeque implements Deque<E>
{
  private Node head;
  private int numItems;
  
  public RefDeque()
  {
     head = new Node(null);
     numItems = 0;
  }
  
  boolean isEmpty();
  {
    if (head == null)
      return true;
    else 
      return false;
  }
  
  boolean addFirst(E item)
  {
    Node<E> prevHead = head;
    Node<E> newHead = new Node<E>(item);
    if (prevHead != null) 
    {
      newHead.connectRight(prevHead);
    } 
    else 
    {
      tail = newHead;
    }
    head = newHead;
    size++;
  }
  
  boolean addLast(E item)
  {
    Node<E> newTail = new Node<E>(item);
    Node<E> prevTail = tail;
    if (prevTail != null) 
    {
      prevTail.connectRight(newTail);
    } 
    else 
    {
      head = newTail;
    }
    tail = newTail;
    size++;
  }
  
  boolean contains(Object o)
  {
    if (isEmpty()) 
    {
      throw new java.util.NoSuchElementException();
    }
    if (head.item == o)
      return true;
    else if (tail.item == o)
      return true;
    else if (head.right.item == o)
      return true;
    else if (tail.left.item == o)
      return true;
    else
      return false;
  }
  
  E removeFirst()
  {
    if (isEmpty()) 
    {
      throw new java.util.NoSuchElementException();
    }
    size--;
    Node<E> prevHead = head;
    head = prevHead.right;
    prevHead.right = null;
    if (head != null) 
    {
      head.left = null;
    }
    return prevHead.item;
  }
  
  E removeLast()
  {
    if (isEmpty()) 
    {
      throw new java.util.NoSuchElementException();
    }
    size--;
    Node<E> prevTail = tail;
    tail = prevTail.left;
    prevTail.left = null;
    if (tail != null) 
      tail.right = null;
    return prevTail.item;
  }
  
  E peekFirst()
  {
    if (isEmpty()) 
    {
      throw new java.util.NoSuchElementException();
    }
    
    return head.item;
  }
  
  E peekLast()
  {
    if (isEmpty()) 
    {
      throw new java.util.NoSuchElementException();
    }
    
    return tail.item;
  }
}