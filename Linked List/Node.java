class Node
{
  Object item;
  Node next;
  Node (Object newItem)
  {
    item = newItem;
    next = null;
  }
  
  Node(Object newItem, Node nextNode)
  {
    item = newItem;
    next = nextNode;
  }
  
  public static String display(Node nextNode)
  {
    return nextNode.item.toString();
  }
  
}
    