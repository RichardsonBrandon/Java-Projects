public class UseTime
{
  public static void main(String args[])
  {
    Time h = new Time();
    
    h.DisplayTimeBy24Hours();
    h.SetTime(16, 25, 50);
    System.out.println("");
    h.DisplayTimeBy24Hours();
    System.out.println("");
    h.DisplayTimeBy12Hours();
    System.out.println("");
    h.IncreaseTimeByMinutes(5);
    h.DisplayTimeBy12Hours();
    System.out.println("");
    System.out.println(h.difference(3, 10, 30) + " seconds");
  }
}