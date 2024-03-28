import java.io.*;
import java.util.*;
class Biggest
{
      public static void main(String args[])
      {
	Scanner in=new Scanner(System.in);
	int a,b,large;
	System.out.println("Enter the first value:");
	a=in.nextInt();
	System.out.println("Enter the second value:");
	b=in.nextInt();
	large=(a>b)?a:b;
	System.out.println("The Biggest Number is"+large);
      }
}