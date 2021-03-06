import java.util.TreeSet;

public class TestTreeSet
{
	public static void main(String[] args) 
	{
		/*
		TreeSet books = new TreeSet(
										(o1, o2) ->
										{
											R r1 = (R)o1;
											R r2 = (R)o2;
											return r1.GetCount() > r2.GetCount() ? 1 : 
												r1.GetCount() < r2.GetCount() ? -1 : 0;
										}
									);
		*/

		/*
		books.add(5);
		books.add(2);
		books.add(10);
		books.add(-9);
		
		System.out.println(books);
		System.out.println();
		*/

		/*
		System.out.println(books.first());	//-9
		System.out.println(books.last());	//10
		System.out.println(books.lower(2));	//-9
		System.out.println(books.higher(2));	//5
		System.out.println(books.subSet(2, 10));//2,5
		System.out.println(books.headSet(5));//-9,2
		System.out.println(books.tailSet(5));//5,10
		*/

		/*
		books.add(5);
		books.add("5");
		*/
		
		/*
		books.add(new R(5));
		books.add(new R(-3));
		books.add(new R(9));
		books.add(new R(-2));
		*/

		TreeSet books = new TreeSet(
						(o1, o2) ->
						{
							String str1 = (String)o1;
							String str2 = (String)o2;
							return str1.charAt(0) > str2.charAt(0) ? 1 :
								str1.charAt(0) < str2.charAt(0) ? -1 : 0;
						}
		);

		//books.add("ǰ��");
		books.add("android");
		books.add("javaweb");
		books.add("hello world");

		System.out.println(books);
	}
}

class R implements Comparable
{
	private int count;

	public int GetCount()
	{
		return count;
	}

	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? -1 : 
			count < r.count ? 1 : 0;
	}

	public String toString()
	{
		return "count1 = " + count;
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			if(count == r.GetCount())
			{
				return true;
			}
		}

		return false;
	}

	public R(int count)
	{
		this.count = count;
	}
}
