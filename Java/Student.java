import java.io.*;
import java.util.*;
class Student
{
      public static void main(String args[])
      {
	Scanner in=new Scanner(System.in);
	int id;
	String name,address,mobilenumber;
	byte age;
	double salary;
    	char c;
	
	System.out.println("Enter the Id:");
	id=in.nextInt();
	System.out.println("The RollNumber is:"+id);

	System.out.println("Enter the Name:");
	name=in.next();
	System.out.println("My name is:"+name);

	System.out.println("Enter the Age:");
	age=in.nextByte();
	System.out.println("My age is:"+age);

	System.out.println("Enter the MobileNumber:");
	mobilenumber=in.next();
	System.out.println("The MobileNumber is:"+mobilenumber);
	
	System.out.println("Enter the Address:");
	address=in.nextLine();
	System.out.println("The Address is:"+address);

	System.out.println("Enter the Salary:");
	salary=in.nextDouble();
	System.out.println("My Salary is:"+salary);

	System.out.println("Enter the character:");
	char=next.charAt(6
);
	System.out.println("My Salary is:"+salary);
            
}
}