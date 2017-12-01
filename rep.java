import java.util.HashMap;
import java.util.Scanner;
public class rep {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	for(int i=0;i<n;i++)
	{
		if(map.containsKey(a[i]))
		{
			System.out.println(a[i]);
			break;
		}
		else
		{
			map.put(a[i], 1);
		}}}}
