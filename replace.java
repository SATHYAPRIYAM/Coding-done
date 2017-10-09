import java.io.*;
import java.util.*;
class replace
{
public static void main(String s[])
{
String str = "";
Scanner in= new Scanner(System.in);
System.out.println("Please enter a String");
str=in.nextLine();
System.out.println("Please enter a Character");
String chr=in.next();
int charCount = str.length() - str.replaceAll(chr, "").length();
System.out.println("Number of occurances of given character:"+charCount);
}
}
