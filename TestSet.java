import java.util.HashSet;
import java.util.Scanner;

public class TestSet
{
	public static void main(String[] args) 
	{
		HashSet hashset = new HashSet();

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<20; ++i)
		{
			hashset.add(sc.nextLine());
		}

		System.out.println(hashset);
	}
}
