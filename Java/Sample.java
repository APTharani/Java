import java.io.*;
import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
	//1)Length():
	String s1="Tharani";
	System.out.println("The string Length is:"  +s1.length());
	
	//2)charAt():
	String s2="Tharani";
	System.out.println("The Character is:"  +s2.charAt(3));

	//3)concat():
	String s3="Jothi";
	String s4="Tharani";
	System.out.println("The string concat is:"  +s3.concat(s4));

	//4)equals():
	String s5="Jothi";
	String s6="Tharani";
	String s7="Tharani";
	System.out.println("The string equals is:"  +s5.equals(s6));
	System.out.println("The string equals is:"  +s6.equals(s7));
	
	//5)equalsIgnoreCase():
	String s8="Jothi";
	String s9="Tharani";
	String s10="THARANI";
	System.out.println("The equalsignorecase is:"  +s8.equalsIgnoreCase(s9));
	System.out.println("The equalsignorecase is:"  +s9.equalsIgnoreCase(s10));

	//6)Uppercase():
	String str="tharani";
	System.out.println("The String upperCase  is:"  +str.toUpperCase());
	
	//7)Lowercase():
	String str1="JOTHI THARANI";
	System.out.println("The String lowerCase  is:"  +str1.toLowerCase());
	
	//8)trim():
	String str2="                 Computer Engineering           ";
	System.out.println(str2);
	System.out.println("The trim string is:" +str2.trim());
  
	//9)startsWith():
	String str3="Welcome!";
	System.out.println("The String start with is:" +str3.startsWith("A"));
	System.out.println("The String start with is:" +str3.startsWith("Wel"));

	//10)endsWith():
	String str4="Hello World";
	System.out.println("The String ends with is:" +str4.endsWith("rld"));
	System.out.println("The String ends with is:" +str4.endsWith("Hel"));	
    }	
}
