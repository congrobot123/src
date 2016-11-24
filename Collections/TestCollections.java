import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TestCollections
{
	public static void main(String[] args) 
	{
		//Collections对集合元素进行排序、查询和修改等操作
		ArrayList list1 = new ArrayList();
		list1.add(2);
		list1.add(-5);
		list1.add(1);

		System.out.println(list1);
		
		Collections.sort(list1);

		System.out.println(list1);

		//Collections对集合对象实现同步控制
		List list2 = Collections.synchronizedList(new ArrayList());

		//Collections将集合对象设置为不可变
		Map map = new HashMap();
		map.put("语文", 80);
		map.put("Java", 82);
		Map unmodMap = Collections.unmodifiableMap(map);
		System.out.println(unmodMap);
		//unmodMap.put("英语", 90);

	}
}
