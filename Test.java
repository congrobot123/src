public class Test
{
	public int a;	//实例变量
	public static int b; //类变量

	//实例变量	
	public void fun1()
	{
		System.out.println(this.a);
	}

	public static void fun2()
	{
		System.out.println(Test.b);
	}

	public Test(int a)
	{
		this.a = a;
	}

	public static void main(String[] args) 
	{
		/*
		Test test = new Test(1);
		test = new Test(2);
		test.fun1();

		test = new Test(2);
		test.fun1();
		*/

		int a = 160;
		byte b = (byte)a;
		System.out.println(b);
	}
}