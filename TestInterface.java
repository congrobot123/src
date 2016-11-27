public class TestInterface 
{
	public static void main(String[] args) 
	{
		E e = new E();
		e.fun1();
	}
}

interface A
{
	public void fun2();
}

interface B extends A
{
	public void fun1();
}

class C
{
	public C()
	{
	
	}
}

abstract class D extends C implements A
{
	public void fun1()
	{
		System.out.println("fun1()");
	}

	public void fun2()
	{
		System.out.println("fun2()");
	}

	public abstract void fun3();
}

class E extends D
{
	public void fun3()
	{
		System.out.println("fun3()");
	}
}