import java.util.Map;
import java.util.HashMap;

public class TestMap
{
	public static void main(String[] args) 
	{
		Map map = new HashMap();
		map.put("����", 80);
		map.put("Ӣ��", 90);
		map.put("��ѧ", 80);

		System.out.println(map);

		System.out.println(map.get("Ӣ��"));
		System.out.println(map.containsKey("Ӣ��"));
		System.out.println(map.containsValue(80));
		
		System.out.println("��ȡKeySet���ϣ���ȥ��Ӧ��value");
		for(Object key : map.keySet())
		{
			System.out.println(key + " -> " + map.get(key));
		}

		System.out.println("��ȡEntrySet���ϣ���ȥ��Ӧ��key��value");
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

		System.out.println("forEach�������м���");
		map.forEach( (t, u) -> System.out.println(t + " -> " + u) );

		map.replace("����", 90);
		map.replace("��ѧ", 100);
		System.out.println(map);
	}
}