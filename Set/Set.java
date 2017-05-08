import java.util.*;

public class Set
{
 private int n;
 private boolean[] set;
 
 public Set3(int size) 
 { 
  n = size;
  set = new boolean[n];
  for(int i = 0; i < n; i++)
   set[i] = false;
 }
 
 public Set3(Set3 s)
 {
  n = s.n;
  set = new boolean[n];
  for(int i = 0; i < n; i++)
   set[i] = s.set[i];
 }
 
 public void insert(int x)
 {
  if(x > 0 && x <= n)
   set[x-1] = true;
 }

 public void delete(int x) 
 {
  if(x > 0 && x <= n)
   set[x-1] = false;
 }

 public boolean isMember(int x) 
 {
  if(x > 0 && x <= n)
   return set[x-1];
  else
   return false;
 }
 
 public boolean isEmpty() 
 {
  boolean empty = true;
  for(int i = 0; i < n; i++)
   empty = empty && !set[i];

  return empty;
 }
 
 public void union(Set3 s) {
  for(int i = 0; i < n; i++)
   set[i] = set[i] || s.set[i];

 }

 public void intersection(Set3 s) 
 {
  for(int i = 0; i < n; i++)
   set[i] = set[i] && s.set[i];
 }

 public int size() 
 {
  int size = 0;
  for(int i = 0; i < n; i++)
   if(set[i])
    size++;

  return size;
 } 

 public void print() 
 {
  System.out.print("{");
  for(int i = 0; i < n; i++)
   if(set[i])
    System.out.print((i+1)+", ");

  System.out.println("}");
 }
}
