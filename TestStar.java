public class TestStar
{
	public static void main(String[] args) 
	{
		int n = 0;
		int m = 3;
		int flag = 0;
		
		do
		{
			for(int i = 0; i<4+n; ++i)
			{
				if( n+i >= 3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

			if(flag == 0)
			{
				++n;
			}
			else
			{
				--n;
			}

			if(n == m)
			{
				flag = 1;
			}

			if(n < 0)
			{
				break;
			}
		}
		while (true);
	}
}
