public class UseStudent
{
  public static void main(String args[])
  {
    Student first = new Student (new String("David"), new Integer(15));
    System.out.println(first.getName());
    System.out.println(first.getAge());
    StudentLinkedList a = new StudentLinkedList();
    a.add(0,17);
    a.add(1,10);
    a.add(2,15);
    System.out.println(a.get(2));
    a.find(2);
    
  }
}