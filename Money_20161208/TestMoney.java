import java.util.Scanner;

public class TestMoney
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		char[] num = {'Áã','Ò¼','·¡','Èþ','ËÁ','Îé','Â½','Æâ','°Æ','¾Á'};
		char[] unit = {'Õû','Ôª','Ê°','°Û','Çª','Íò','Ê°','°Û','Çª','ÒÚ'};

		char[] array1 = new char[100];

		int i = 0;
		int j = 0;
		do
		{
			int value = money % 10;

			if(j == 0)
			{
				array1[i] = unit[j];
				i++;
				j++;

				array1[i] = unit[j];
				i++;
				j++;

				if(value != 0)
				{
					array1[i] = num[value];
					++i;
				}
			}
			else
			{
				if(value != 0)
				{
					array1[i] = unit[j];
					i++;
					j++;

					array1[i] = num[value];
					++i;
				}
				else
				{
					array1[i] = num[value];
					++i;
					++j;
				}
			}
			
			money = money / 10;
		}
		while (money != 0);

		for(int m = 0; m < i; ++m)
		{
			System.out.print(array1[m] + " ");
		}
		System.out.println();

		char[] array2 = new char[i];
		array2[0] = array1[0];
		array2[1] = array1[1];

		i = 2;
		int k2 = 2;

		int flag1 = 0;
		int flag2 = 0;
		for(; i<array2.length;)
		{
			if(array1[i] != 'Áã')
			{
				flag1 = 1;
				flag2 = 0;

				array2[k2] = array1[i];
				++k2;
				++i;
			}
			else
			{
				if(flag1 == 0)
				{
					i++;
				}
				else
				{
					if(flag2 == 0)
					{
						array2[k2] = array1[i];
						++k2;
						++i;
						flag2 = 1;
					}
					else
					{
						i++;
					}
				}
			}
		}

		for(int m = 0; m < k2; ++m)
		{
			System.out.print(array2[m] + " ");
		}
		System.out.println();

		char[] array3 = new char[k2];
		for(int k1=0; k1<array3.length; ++k1)
		{
			array3[k1] = array2[k2-1];
			--k2;
		}

		for(int m = 0; m < array3.length; ++m)
		{
			System.out.print(array3[m] + " ");
		}
		System.out.println();
		
		String str = String.copyValueOf(array3);
		System.out.println(str);
	}
}