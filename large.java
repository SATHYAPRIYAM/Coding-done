import java.util.*;
public class odd
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int p=s.nextInt();
int q=s.nextInt();
if((r>p)&&(r>q))
{
System.out.println("The largest number is"+r);
}
else if((p>r)&&(p>q))
{
System.out.println("The largest number is"+p);
}
else
{
System.out.println("The largest number is"+q);
}
}
}
