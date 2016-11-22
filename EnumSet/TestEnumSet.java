import java.util.EnumSet;

public class TestEnumSet
{
	public static void main(String[] args) 
	{
		EnumSet es = EnumSet.noneOf(Season.class);
		es.add(Season.SPRING);
		es.add(Season.WINTER);
		es.add(Season.SUMMER);

		System.out.println(es);
	}
}

enum Season
{
	SPRING, SUMMER, FAIL, WINTER
}
