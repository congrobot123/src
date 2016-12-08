import java.util.Scanner;

public class TestReverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[10];

		for(int i = 0; i<10; ++i)
		{
			array1[i] = sc.nextInt();
		}

		System.out.println("调换顺序之前");
		for(int temp : array1)
		{
			System.out.print(temp + " ");
		}
		System.out.println();

		int len = array1.length;
		for(int i = 0; i< len/2; ++i)
		{
			int temp = array1[i];
			array1[i] = array1[len -i -1];
			array1[len -i -1] = temp;
		}

		System.out.println("调换顺序之后");
		for(int temp : array1)
		{
			System.out.print(temp + " ");
		}
	}
}