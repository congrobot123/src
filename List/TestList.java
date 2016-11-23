import java.util.List;
import java.util.ArrayList;

public class TestList
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add("前端");
		list.add("javaweb");
		list.add("android");
		System.out.println(list);

		list.add(1, "小聪科技");
		System.out.println(list);

		for(int i=0; i<list.size(); ++i)
		{
			System.out.println(list.get(i));
		}

		list.set(1, "小聪教育");
		System.out.println(list);

		list.remove(1);
		System.out.println(list);
		list.remove("前端");
		System.out.println(list);

		list.add(0, "前端");
		list.add(1, "小聪科技");
		list.sort( (o1,o2)-> ((String)o1).length() - ((String)o2).length() );
		System.out.println(list);

		list.replaceAll( (t) -> ((String)t).length() );
		System.out.println(list);
	}
}
