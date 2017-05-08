/* Brandon Richardson
 * CSCI 4100 A
 * Lab Assignment 4
*/
public class Time
{
  private int hours;
  private int minutes;
  private int seconds;
  
  public Time()
  {
    hours = 0;
    minutes = 0;
    seconds = 0;
  }
  
  public Time(int h, int m, int s)
  {
    hours = h;
    minutes = m;
    seconds = s;
  }
  
  public void SetTime(int h, int m, int s)
  {
    hours = h;
    minutes = m;
    seconds = s;
  }
  
  public void IncreaseTimeBySecond()
  {
    seconds+=1;
  }
  
  public int difference(int h, int m, int s)
  {
  int diff_hours = (hours - h)*3600;
  int diff_minutes = (minutes - m)*60;
  int diff_seconds = seconds - s;
  
  return diff_hours + diff_minutes + diff_seconds;
  }
  
  public void IncreaseTimeByMinutes(int m)
  {
    minutes += m;
  }
  
  public void DisplayTimeBy24Hours()
  {
    if (hours < 10)
      System.out.printf("0");
    System.out.printf(hours + ":");
    if (minutes < 10)
      System.out.printf("0");
    System.out.printf(minutes + ":");
    if (seconds < 10)
      System.out.printf("0");
    System.out.printf(seconds + "");
  }
  
  public void DisplayTimeBy12Hours()
  {
    if (hours > 12)
      hours -= 12;
    if (hours < 10)
      System.out.printf("0");
    System.out.printf(hours + ":");
    if (minutes < 10)
      System.out.printf("0");
    System.out.printf(minutes + ":");
    if (seconds < 10)
      System.out.printf("0");
    System.out.printf(seconds + "");
  }
}