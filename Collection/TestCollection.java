import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection
{
	public static void main(String[] args) 
	{
		//�����龲̬��ʼ��
		String[] array1 = new String[]{"hello", "world"};
		String[] array2 = {"hello", "world"};

		//�����ݶ�̬��ʼ��
		String[] array3 = new String[2];
		
		Collection c1 = new ArrayList();
		c1.add("hello");
		c1.add("world");

		System.out.println(c1);

		c1.remove("world");
		System.out.println(c1);

		System.out.println(c1.contains("hello"));
		
		System.out.println(c1.size());

		c1.add("ǰ��");
		c1.add("javaweb");
		c1.add("android");

		Collection c2 = new ArrayList();
		
		c2.add("hello");
		c2.add("world");

		c1.retainAll(c2);
		System.out.println(c1);

		c1.add("ǰ��");
		c1.add("javaweb");
		c1.add("android");

		System.out.println("\nʹ��Lambda����ʽ����������");
		c1.forEach(obj->System.out.println("��������Ԫ��: " + obj));

		System.out.println("\nIterator��������Ԫ��");
		Iterator it1 = c1.iterator();

		while(it1.hasNext())
		{
			String temp = (String)it1.next();
			System.out.println(temp);
		}

	}
}