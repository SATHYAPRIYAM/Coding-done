package first;

import java.util.Scanner;

public class Squ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0,n;
		while(number>0)
		{
		n=number%10;
		sum=(n*n)+sum;
		number=number/10;
		}
		System.out.println(sum);
		sc.close();

	}

}
