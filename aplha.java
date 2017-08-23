import java.util.*;
public class aplha
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int r=s.next().charAt(0);
if((r>='a'&&r<='z')||(r>='A'&&r<='Z'))
{
System.out.print("Alphabet");
}
else
{
System.out.print("Not a alphabet");
}
}
}
