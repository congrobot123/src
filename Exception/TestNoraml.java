public class  TestNoraml
{
	public static void main(String[] args) 
	{
		if(args.length == 2)
		{
			if(isNum(args[0]) == false)
			{
				System.out.println("enter wrong!");
				return;
			}
			int a = Integer.parseInt(args[0]);

			if(isNum(args[1]) == false)
			{
				System.out.println("enter wrong!");
				return;
			}
			int b = Integer.parseInt(args[1]);

			if(b == 0)
			{
				System.out.println("enter wrong!");
				return;
			}

			int temp = a / b;
			System.out.println(temp);
		}
		else
		{
			System.out.println("enter wrong!");
		}
	}

	public static boolean isNum(String str)
	{
		if(str == null)
		{
			return false;
		}

		char[] array = str.toCharArray();
		if( array[0] < '1' || array[0]  > '9' )
		{
			return false;
		}

		for(int i=1; i<array.length; ++i)
		{
			if(array[i] < '0' || array[i] > '9')
			{
				return false;
			}
		}

		return true;
	}
}
