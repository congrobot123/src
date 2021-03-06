import java.util.HashSet;

public class TestSet
{
	public static void main(String[] args) 
	{
		HashSet book = new HashSet();

		/*
		System.out.println(book.add("hello"));//true
		System.out.println(book.add("hello"));//false
		*/

		/*
		book.add(new A());
		book.add(new B());
		book.add(new C());
		*/
		/*
		Object ObjA = new A();
		Object ObjB = new B();
		System.out.println(ObjA.equals(ObjB));

		book.add(ObjA);
		book.add(ObjB);
		*/

		/*
		//Object类equals方法本质就是==
		B b1 = new B();
		B b2 = b1;
		System.out.println(b1.equals(b2));	//true
		System.out.println(b1 == b2);		//true
		*/

		/*
		book.add(new A());
		book.add(new A());
		book.add(new B());
		book.add(new B());
		book.add(new C());
		book.add(new C());
		*/

		R r1 = new R(1, 3);
		R r2 = new R(1, 3);
		R r3 = new R(2, 2);
		book.add(r1);
		book.add(r2);
		book.add(r3);

		System.out.println(book);
	}
}

class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}

class B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public boolean equals(Object obj)
	{
		return true;
	}

	public int hashCode()
	{
		return 2;
	}
}

class R
{
	private int count1;
	private int count2;

	public int GetCount1()
	{
		return count1;
	}

	public int GetCount2()
	{
		return count2;
	}
	
	public String toString()
	{
		return "count1 = " + count1 + " count2 = " + count2;
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			if(count1 == r.GetCount1() && count2 == r.GetCount2())
			{
				return true;
			}
		}

		return false;
	}

	public int hashCode()
	{
		return count1*5 + count2*7;
	}

	public R(int count1, int count2)
	{
		this.count1 = count1;
		this.count2 = count2;
	}
}
