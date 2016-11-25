public class TestInterface
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		test.fun1();
		test.fun2();
	}
}

interface A
{
	public abstract void fun1();
}

interface B
{
	public abstract void fun2();
}

class Test implements A,B
{
	public void fun1()
	{
		System.out.println("void fun1()");
	}

	public void fun2()
	{
		System.out.println("void fun2()");
	}
}

