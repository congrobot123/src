import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestStat
{
	public static void main(String[] args)
		throws FileNotFoundException
	{
		String[] array1 = null;
		Entry[] array2 = new Entry[10];

		Scanner sc = new Scanner(new File("a.txt"));

		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			//System.out.println(str);
			
			array1 = str.split(",");
			
			int flag = 0;
			for(int i=0; i<array2.length; ++i)
			{
				if(array2[i] != null)
				{
					Entry entry = array2[i];
					String name = entry.GetKey();

					if(name.equals(array1[1]))
					{
						//System.out.println("test1");
						flag = 1;
						int count = entry.GetValue();
						count++;
						entry.SetValue(count);
					}
				}
			}

			if(flag == 0)
			{
				//System.out.println("test2");
				Entry entry = new Entry(array1[1], 1);

				for(int j=0; j<array2.length; ++j)
				{
					if(array2[j] == null)
					{
						array2[j] = entry;
						break;
					}
				}
			}
		}

		for(int k=0; k<array2.length; ++k)
		{
			if(array2[k] != null)
			{
				System.out.println(array2[k].GetKey() + " " + array2[k].GetValue());
			}
		}

		for(int i = 0; i< array2.length-1; ++i)
		{
			for(int j=i+1; j<array2.length; ++j)
			{
				if(array2[i] != null)
				{
					if(array2[j] != null)
					{
						if( array2[i].GetValue() > array2[i].GetValue() )
						{
							Entry temp = array2[j];
							array2[j] = array2[i];
							array2[i] = temp;
						}
					}
					else
					{
						continue;
					}
				}
				else
				{
					break;
				}
			}
		}

		for(int k=0; k<array2.length; ++k)
		{
			if(array2[k] != null)
			{
				System.out.println(array2[k].GetKey() + " " + array2[k].GetValue());
			}
		}
	}
}

class Entry
{
	private String key;
	private int value;

	public String GetKey()
	{
		return key;
	}

	public void SetKey(String key)
	{
		this.key = key;
	}

	public int GetValue()
	{
		return value;
	}

	public void SetValue(int value)
	{
		this.value = value;
	}

	public Entry(String key, int value)
	{
		this.key = key;
		this.value = value;
	}
}
