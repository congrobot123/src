import java.util.List;
import java.util.ArrayList;

public class TestList
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("ǰ��");
		list.add("javaweb");
		list.add("android");
		System.out.println(list);

		list.add(1, "С�ϿƼ�");
		System.out.println(list);

		for(int i=0; i<list.size(); ++i)
		{
			System.out.println(list.get(i));
		}

		list.set(1, "С�Ͻ���");
		System.out.println(list);

		list.remove(1);
		System.out.println(list);
		list.remove("ǰ��");
		System.out.println(list);

		list.add(0, "ǰ��");
		list.add(1, "С�ϿƼ�");
		list.sort( (o1,o2)-> ((String)o1).length() - ((String)o2).length() );
		System.out.println(list);

		list.replaceAll( (t) -> ((String)t).length() );
		System.out.println(list);
	}
}
