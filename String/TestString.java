public class TestString
{
	public static void main(String[] args) 
	{
		String str1 = new String("hello world");
		System.out.println(str1);
		str1 = str1 + " hello world";
		System.out.println(str1);

		StringBuffer str2 = new StringBuffer("hello world");
		System.out.println(str2);
		str2.append(" hello world");
		System.out.println(str2);
		str2.setCharAt(0, 'H');
		System.out.println(str2);

		StringBuilder str3 = new StringBuilder("hello world");
		System.out.println(str3);
		str3.setCharAt(0, 'H');
		System.out.println(str3);

		byte[] b = {65, 66, 67, 68};
		String str4 = new String(b);
		System.out.println(str4);

		String str5 = new String("abcd");
		String str6 = new String("abce");
		System.out.println(str5.compareTo(str6));

		String str7 = new String("abcd");
		String str8 = new String("ABCD");
		System.out.println(str7. compareToIgnoreCase(str8));

		char[] data = {'a', 'b', 'c'};
		String str9 = String.copyValueOf(data);
		System.out.println(str9);

		String str10 = new String("hello world");
		String str11 = str10.concat(" hello world");
		System.out.println(str11);

		String str12 = new String("hello world");
		str12 = str12.concat(" hello world");
		System.out.println(str12);

		String str13 = new String("hello world");
		String str14 = new String("Hello World");
		System.out.println(str13.equals(str14));
		System.out.println(str13.equalsIgnoreCase(str14));

		String str15 = new String("hello world");
		byte[] b1 = str15.getBytes();
		for(int temp1 : b1)
		{
			System.out.print(" " + temp1);
		}
		System.out.println();

		String str16 = new String("hello world");
		char[] dest1 = new char[20];
		str16.getChars(6, 11, dest1, 10);
		for(char temp2 : dest1)
		{
			System.out.print(" " + temp2);
		}
		System.out.println();

		String str17 = new String("hello world");
		String[] array1 = str17.split(" ");
		for(String temp3 : array1)
		{
			System.out.println(temp3);
		}

		String str18 = new String("hello world");
		String str19 = str18.substring(6);
		System.out.println(str19);

		String str20 = String.valueOf(1);
		System.out.println(str20);
	}
}
