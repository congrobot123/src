public class TestNine
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=9; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
				String str = j + "x" + i + " = " + (i*j);
				System.out.print(str);
				if(str.length() == 7)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
