import java.util.LinkedHashSet;

public class TestLinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet books = new LinkedHashSet();

		books.add("Ç°¶Ë");
		books.add("javaweb");
		books.add("android");
		System.out.println(books);

		books.remove("javaweb");

		System.out.println(books);
	}
}
