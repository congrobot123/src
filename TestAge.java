public class TestAge
{
	public static void main(String[] args) 
	{
		int age = person(8);
		System.out.println(age);
	}

	public static int person(int num)
	{
		if(num == 1)
		{
			return 10;
		}
		else
		{
			return person(num -1) + 2;
		}
	}
}
