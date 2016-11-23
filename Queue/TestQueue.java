import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TestQueue
{
	public static void main(String[] args) 
	{
		Queue q = new PriorityQueue();
		q.add("ǰ��");
		q.add("javaweb");
		q.add("android");
		System.out.println(q.toString());

		int size = q.size();
		for(int i=0; i<size; ++i)
		{
			System.out.println((String)(q.poll()));
		}

		/*
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.println((String)it.next());
		}
		*/
	}
}
