public class TestMonkey
{
	public static void main(String[] args) 
	{
		int flag = 0;
		for(int i=6; i<10000; ++i)
		{
			int sum = i;
			for(int j=0; j<5; ++j)
			{
				if(sum %5 != 1)
				{
					flag = 1;
					break;
				}
				else
				{
					sum = sum - 1;
					sum = sum*4/5;
				}
			}
			if(flag == 1)
			{
				flag = 0;
				continue;
			}

			if(sum >= 4)
			{
				System.out.println("桃子最少个数为：" + i);
				break;
			}
		}
	}
}
