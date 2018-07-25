package first;

import java.util.Arrays;
import java.util.Scanner;

public class Charac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int n=str1.length();
		int n2=str2.length();
		char temparr[]=str1.toCharArray();
		char temarr[]=str2.toCharArray();
		Arrays.sort(temparr);
		Arrays.sort(temarr);‪
		str1=new String(temparr);
		str2=new String(temarr);
		//System.out.println(str1+" "+str2);
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				count =count+1;
			}
		}
		if(count==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		sc.close();
}

}
