import java.util.ArrayList;

public class TestList
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();

		for(int i=0; i<10; ++i)
		{
			list.add(i,i);
		}

		System.out.println(list.get(5));

		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(4));
		
		list.remove(3);
		System.out.println(list);
	}
}
