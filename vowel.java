import java.util.*;
public class vowel
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);

int r=s.next().charAt(0);

if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u')
{
System.out.print("Vowel");
}
else
{
System.out.print("Consonant");
}
}
}
