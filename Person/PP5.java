import java.util*;

public interface PP5<T>
{
  public void add(int index, T item);
  public void delete(int index);
  public T find(int index); 
  public void change(int index, T item);
  public void quit();
}