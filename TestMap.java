import java.util.HashMap;

public class TestMap
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		
		String[] array = {"a", "b", "a", "b", "c", "a", "b", "c", "b"};

		String key = null;
		int count = 0;

		for(int i=0; i<array.length; ++i)
		{
			key = array[i];
			if(map.containsKey(key))
			{
				count = (int)map.get(key);
				count++;
				map.put(key, count);
			}
			else
			{
				map.put(key, 1);
			}
		}

		for(Object temp : map.keySet())
		{
			System.out.println((String)temp + "-->" + map.get(temp));
		}
	}
}
