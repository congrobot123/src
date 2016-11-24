import java.util.EnumMap;

public class TestEnumMap
{
	public static void main(String[] args) 
	{
		EnumMap map = new EnumMap(Season.class);
		map.put(Season.SPRING, "´ºÅ¯»¨¿ª");
		map.put(Season.SUMMER, "ÏÄÈÕÑ×Ñ×");

		System.out.println(map);
	}
}

enum Season
{
	SPRING, SUMMER, FALL, WINTER
}
