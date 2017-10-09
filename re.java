import java.io.*;
import java.util.*;
class re
{
public static void main(String s[])
{
String k=new String(s[0]);
String rev=new StringBuffer(k).reverse().toString();
String news=new String();
news=rev.replaceAll("[aeiouAEIOU]", "");
System.out.println(news);
}
}
