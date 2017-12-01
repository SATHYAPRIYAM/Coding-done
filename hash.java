import java.util.HashSet;
public class hash {

	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int arr2[]={1,4,3,5,6,2};
		int count=0;
		HashSet<Integer> map=new HashSet<Integer>();
		for(int i=0;i<arr2.length;i++)
		{
			map.add(arr2[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(map.contains(arr1[i]))
			{
				count=count+1;
			}
			else
			{
				System.out.print("No Subset");
			}
		}
		if(count==arr1.length)
		{
			System.out.print("Subset");
		}
	}

}
