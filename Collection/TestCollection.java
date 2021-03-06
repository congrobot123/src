import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection
{
	public static void main(String[] args) 
	{
		//对数组静态初始化
		String[] array1 = new String[]{"hello", "world"};
		String[] array2 = {"hello", "world"};

		//对数据动态初始化
		String[] array3 = new String[2];
		
		Collection c1 = new ArrayList();
		c1.add("hello");
		c1.add("world");

		System.out.println(c1);

		c1.remove("world");
		System.out.println(c1);

		System.out.println(c1.contains("hello"));
		
		System.out.println(c1.size());

		c1.add("前端");
		c1.add("javaweb");
		c1.add("android");

		Collection c2 = new ArrayList();
		
		c2.add("hello");
		c2.add("world");

		c1.retainAll(c2);
		System.out.println(c1);

		c1.add("前端");
		c1.add("javaweb");
		c1.add("android");

		System.out.println("\n使用Lambda表达式来遍历集合");
		c1.forEach(obj->System.out.println("迭代集合元素: " + obj));

		System.out.println("\nIterator遍历集合元素");
		Iterator it1 = c1.iterator();

		while(it1.hasNext())
		{
			String temp = (String)it1.next();
			System.out.println(temp);
		}

		System.out.println("\nLambda表达式遍历Iterator");
		Iterator it2 = c1.iterator();
		it2.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
		
		System.out.println("\n使用foreach循环遍历集合元素");
		for(Object obj : c1)
		{
			System.out.println((String)obj);
			//c1.remove(obj);
		}
	
	}
}
