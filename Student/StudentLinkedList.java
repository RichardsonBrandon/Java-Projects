public class StudentLinkedList
{
  private Student head;
  private int numItems;
  
  StudentLinkedList()
  {
    head = null;
    numItems = 0;
  }
  
  public boolean isEmpty()
  {
    return (numItems == 0);
  }
  
  public int size()
  {
    return numItems;
  }
  
  /*private*/public Student find(int index)
  {
    Student curr = head;
    for(int skip = 0; skip < index; skip++)
      curr = curr.next;
    return curr;
  }
  
  public Object get(int index)
  {
    if (index>=0 && index < numItems)
    {
      Student curr = find(index);
      Object dataItem = (Object)curr.item;
      return dataItem;
    }
    else
    {
      System.out.println("Could not find object");
      Object dataItem = null;
        return dataItem;
    }
  }
  
  public void add(int index, Object item) //throws ListIndexOutOfBoundsException
  {
    if (index >= 0 && index < numItems+1)
    {
      if (index == 0)
      {
        Student newNode = new Student(item, head);
        head = newNode;
      }
      else 
      {
        Student prev = find(index-1);
        Student newNode = new Student(item, prev.next);
        prev.next = newNode;
      }
      numItems++;
    }
    /*else
    {
      throw new ListIndexOutOfBoundsException("List index out of bounds on add");
    }*/
  }
  
  public void remove(int index) //throws ListIndexOutOfBoundsException
  {
    if (index >= 0 && index < numItems)
    {
      if (index == 0)
        head = head.next;
      else 
      {
        Student prev = find(index-1);
        Student curr = prev.next;
        prev.next = curr.next;
      }
      numItems--;
    }
    /*else 
      throw new ListIndexOutOfBoundsException("List index out of bounds on remove");*/
  }
  
  public void removeall()
  {
    head = null;
    numItems = 0;
  }
}