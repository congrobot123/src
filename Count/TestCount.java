import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestCount
{
	public static void main(String[] args)
		throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("def.txt"));
		//sc.useDelimiter(" ");

		int flag = 0;
		int temp1 = 0; 
		int temp2 = 0;
		while(sc.hasNext())
		{
			temp1 = sc.nextInt();

			if(flag == 0)
			{
				System.out.print(temp1 + " + ");
				temp2 = temp1;
				flag = 1;
			}
			else
			{
				System.out.print(temp1 + " = ");
				System.out.println(temp1 + temp2);
				flag = 0;
			}
		}
	}
}
