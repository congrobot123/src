import java.util.EnumMap;

public class TestEnumMap
{
	public static void main(String[] args) 
	{
		EnumMap map = new EnumMap(Season.class);
		map.put(Season.SPRING, "��ů����");
		map.put(Season.SUMMER, "��������");

		System.out.println(map);
	}
}

enum Season
{
	SPRING, SUMMER, FALL, WINTER
}
