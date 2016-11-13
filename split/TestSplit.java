public class TestSplit
{
	public static void main(String[] args) 
	{
		String str = "A1B2C3D4E5F6G7H8";
		
		char[] array = str.toCharArray();
		int[] a = new int[array.length/2];
		String[] b = new String[array.length/2];

		for(int i=0; i<array.length; ++i)
		{
			if(i%2 == 0)
			{
				b[i/2] = array[i] + "";
			}
			else
			{
				a[i/2] = array[i] - '0';
			}
		}

		for(int temp1 : a)
		{
			System.out.print(temp1 + " ");
		}
		System.out.println();
		
		for(String temp2 : b)
		{
			System.out.print(temp2 + " ");
		}
		System.out.println();
	}
}
