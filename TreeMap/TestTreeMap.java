import java.util.TreeMap;

public class TestTreeMap
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		map.put(new K(5), new V(1));
		map.put(new K(3), new V(3));
		map.put(new K(1), new V(2));
		map.put(new K(3), new V(2));

		System.out.println(map);
	}
}

class K implements Comparable
{
	public int count;
	
	public int compareTo(Object obj)
	{
		K k = (K)obj;
		return count > k.count ? 1 :
			count < k.count ? -1 : 0;
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
		{
			return true;
		}

		if(obj != null && obj.getClass() == K.class)
		{
			K k = (K)obj;
			return (this.count == k.count);
		}

		return false;
	}

	public String toString()
	{
		return ("K:" + count);
	}

	public K(int count)
	{
		this.count = count;
	}
}

class V
{
	public int count;

	public boolean equals(Object obj)
	{
		if(obj == this)
		{
			return true;
		}

		if(obj != null && obj.getClass() == V.class)
		{
			V v = (V)obj;
			return (this.count == v.count);
		}

		return false;
	}

	public String toString()
	{
		return ("V:" + count);
	}

	public V(int count)
	{
		this.count = count;
	}
}

