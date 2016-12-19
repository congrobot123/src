public class TestFall 
{
	public static void main(String[] args) 
	{
		double[] f = new double[10];

		double sum = 0;

		for(int i=1; i<=10; ++i)
		{
			f[i-1] = fun(i);
			sum = sum + f[i-1];
		}

		System.out.println((1.0/2.0)*f[9]);
		System.out.println(sum);
	}

	public static double fun(int n)
	{
		if(n == 1)
		{
			return 100;
		}
		else if(n == 2)
		{
			return 100;
		}
		else
		{
			return (1.0/2.0)*fun(n - 1);
		}
	}
}
