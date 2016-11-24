import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TestCollections
{
	public static void main(String[] args) 
	{
		//Collections�Լ���Ԫ�ؽ������򡢲�ѯ���޸ĵȲ���
		ArrayList list1 = new ArrayList();
		list1.add(2);
		list1.add(-5);
		list1.add(1);

		System.out.println(list1);
		
		Collections.sort(list1);

		System.out.println(list1);

		//Collections�Լ��϶���ʵ��ͬ������
		List list2 = Collections.synchronizedList(new ArrayList());

		//Collections�����϶�������Ϊ���ɱ�
		Map map = new HashMap();
		map.put("����", 80);
		map.put("Java", 82);
		Map unmodMap = Collections.unmodifiableMap(map);
		System.out.println(unmodMap);
		//unmodMap.put("Ӣ��", 90);

	}
}
