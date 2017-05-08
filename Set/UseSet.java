public class UseSet
{
  public static void main(String args[])
  {
    Set3 a = new Set3(10);
    Set3 b = new Set3(10);
    
    a.insert(1);
    a.insert(2);
    a.insert(3);
    a.insert(4);
    a.insert(5);
    System.out.println(a.isMember(5));
    a.delete(5);
    System.out.println(a.isMember(5));
    System.out.println(a.isEmpty());
    b.insert(6);
    b.insert(7);
    b.insert(8);
    b.insert(9);
    b.insert(2);
    b.union(a);
    b.print();
    b.intersection(a);
    b.print();
    System.out.println(b.size());
    
  }
}