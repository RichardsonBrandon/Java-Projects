//import java.io.*;
import java.util.Scanner;
public class complex
{
   int r,i;
   complex()
   {
   r =0;
   i=0;
}
void sum(complex c,complex d)
{
complex a=new complex();
a.r=c.r+d.r;
a.i=c.i+d.i;
     System.out.println("The sum is "+a.r+"+"+a.i+"i");
  }
  
void sub(complex c,complex d)
  {
    complex a=new complex();
    a.r=c.r-d.r;
    a.i=c.i-d.i;
    System.out.println("The difference is "+a.r+"+"+a.i+"i");
  }
void product(complex c,complex d)
{
complex a=new complex();
a.r=c.r*d.r;
a.i=c.i*d.i;
     System.out.println("The product is "+a.r+"+"+a.i+"i");
  }
void quotient(complex c,complex d)
{
complex a=new complex();
a.r=c.r/d.r;
a.i=c.i/d.i;
     System.out.println("The quotient is "+a.r+"+"+a.i+"i");
 }
void read()
  {
 Scanner dog=new Scanner(System.in);//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("\nEnter the real part");
   r=dog.nextInt();//Integer.parseInt(br.readLine());
   Scanner cat=new Scanner(System.in);
  System.out.println("\nEnter the imaginary part");
    i=cat.nextInt();//Integer.parseInt(br.readLine());
  System.out.println("\nYou have entered : "+r+"+"+i+"i");
  }
}
  
