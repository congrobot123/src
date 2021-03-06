import java.util.Map;
import java.util.HashMap;

public class TestMap
{
	public static void main(String[] args) 
	{
		Map map = new HashMap();
		map.put("语文", 80);
		map.put("英语", 90);
		map.put("数学", 80);

		System.out.println(map);

		System.out.println(map.get("英语"));
		System.out.println(map.containsKey("英语"));
		System.out.println(map.containsValue(80));
		
		System.out.println("先取KeySet集合，再去对应的value");
		for(Object key : map.keySet())
		{
			System.out.println(key + " -> " + map.get(key));
		}

		System.out.println("先取EntrySet集合，再去对应的key和value");
		for(Object obj : map.entrySet())
		{
			Map.Entry entry = (Map.Entry)obj;
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		/*
		for(Object obj : map.entrySet())
		{
			Map.Entry entry = (Map.Entry)obj;
			entry.setValue(90);
		}
		System.out.println(map);
		*/

		System.out.println("forEach遍历所有集合");
		map.forEach( (t, u) -> System.out.println(t + " -> " + u) );

		map.replace("语文", 90);
		map.replace("化学", 100);
		System.out.println(map);
	}
}
