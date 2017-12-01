import java.util.HashMap;
import java.util.Scanner;


public class uniq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				int v=map.get(a[i]);
				map.put(a[i], v+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(map.get(a[i])==1)
			{
				System.out.println(a[i]);
			}
			
		}
		sc.close();
	}

}
