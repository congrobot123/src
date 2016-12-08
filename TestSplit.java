import java.util.Arrays;

public class TestSplit
{
	public static void main(String[] args) 
	{
		String str = "c,d,a,b,e";
		
		char[] array1 = str.toCharArray();

		char[] array2 = new char[array1.length];

		int i=0;
		int j=0;
		for(; i<array1.length; ++i)
		{
			if(array1[i] != ',')
			{
				array2[j] = array1[i];
				++j;
			}
		}

		char[] array3 = Arrays.copyOf(array2, j);

		for(char ch : array3)
		{
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
