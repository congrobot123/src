import java.util.Scanner;

public class TestNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("");

		int[] a = new int[10];

		for(int i=0; i<a.length; ++i)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int j=1; j<a.length; ++j)
		{
			int temp1 = a[j];
			if(temp1 > max)
			{
				max = temp1;
			}
		}
		System.out.print("���ֵ��" + max + " ");

		int min = a[0];
		for(int j=1; j<a.length; ++j)
		{
			int temp1 = a[j];
			if(temp1 < min)
			{
				min = temp1;
			}
		}
		System.out.print("��Сֵ��" + min + " ");

		int sum = 0;
		for(int temp : a)
		{
			sum = sum + temp;
		}
		System.out.print("ƽ��ֵ��" + (double)(sum/10));
	}
}
