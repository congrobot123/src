public class TestAbstract
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

interface Test
{
	int MAXSIZE = 100;

	public void fun1();

	public default void fun2()
	{
		System.out.println("fun2()");
	}
	
	static void fun3()
	{
		System.out.println("fun3()");
	}
}
