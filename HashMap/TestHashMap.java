import java.util.HashMap;

public class TestHashMap
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new A(1), new B(2));
		map.put(new A(1), new B(3));
		map.put(new A(2), new B(2));
		map.put(new A(2), new B(3));
		map.put(new A(3), new B(3));

		//(key1=value1, key2=value2, key3=value3)
		System.out.println(map.toString());

		System.out.println(map.containsKey(new A(1)));
		System.out.println(map.containsValue(new B(3)));
	}
}

class A
{
	public int count;

	public int hashCode()
	{
		return count;
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
		{
			return true;
		}

		if(obj != null && obj.getClass() == A.class)
		{
			A a = (A)obj;
			return (this.count == a.count);
		}
		return false;
	}

	public String toString()
	{
		return ("A:" + count);
	}

	public A(int count)
	{
		this.count = count;
	}

}

class B
{
	public int count;
	public boolean equals(Object obj)
	{
		if(obj == this)
		{
			return true;
		}

		if(obj != null && obj.getClass() == B.class)
		{
			B b = (B)obj;
			return (this.count == b.count);
		}

		return false;
	}

	public String toString()
	{
		return ("B:" + count);
	}

	public B(int count)
	{
		this.count = count;
	}
}
