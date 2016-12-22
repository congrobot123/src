import java.nio.CharBuffer;

public class TestBuffer
{
	public static void main(String[] args) 
	{
		CharBuffer buf = CharBuffer.allocate(8);
		System.out.println("test1");
		System.out.println("capacity: " + buf.capacity());
		System.out.println("limit: " + buf.limit());
		System.out.println("position: " + buf.position());

		buf.put('a');
		buf.put('b');
		buf.put('c');
		buf.put('e');
		buf.put(0, 'd');

		System.out.println("test2");
		System.out.println("position: " + buf.position());

		buf.flip();
		System.out.println("test3");
		System.out.println("limit: " + buf.limit());
		System.out.println("position: " + buf.position());

		System.out.println(buf.get());
		System.out.println(buf.get(2));
		System.out.println("test4");
		System.out.println("position: " + buf.position());

		buf.clear();

		System.out.println("test5");
		System.out.println("limit: " + buf.limit());
		System.out.println("position: " + buf.position());

		System.out.println(buf.get(3));
		System.out.println("test6");
		System.out.println("position: " + buf.position());
	}
}
