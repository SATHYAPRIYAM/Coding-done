import java.io.*;
import java.util.*;
class iso
{
    static int size = 256;
     
    static boolean areIsomorphic(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();
         
        if(m != n)
            return false;
             
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
         
        int[] map = new int[size];
        Arrays.fill(map, -1);
         
        for (int i = 0; i < n; i++)
        {
            if (map[str1.charAt(i)] == -1)
            {
                if (marked[str2.charAt(i)] == true)
                    return false;
 
                marked[str2.charAt(i)] = true;
 
                map[str1.charAt(i)] = str2.charAt(i);
            }
 
            else if (map[str1.charAt(i)] != str2.charAt(i))
            return false;
        }
 
        return true;
    }
    public static void main (String[] args) 
    {
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();

Scanner so=new Scanner(System.in);
String b=so.nextLine();
        boolean res = areIsomorphic(a,b);
        System.out.println(res);
    }
}
