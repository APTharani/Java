import java.io.*;
import java.util.*;
class Add
{
      public static void main(String args[])
      {
	Scanner in=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the first value:");
	a=in.nextInt();
	System.out.println("Enter the second value:");
	b=in.nextInt();
	c=a+b;
	System.out.println("Add two number is"+c);
      }
}