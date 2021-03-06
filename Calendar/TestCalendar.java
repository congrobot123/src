import java.util.Calendar;
import java.util.Date;
import static java.util.Calendar.*;

public class TestCalendar 
{
	public static void main(String[] args) 
	{
		Date d1 = null;
		Calendar c1 = Calendar.getInstance();
		
		d1 = c1.getTime();
		System.out.println(d1);
		
		c1.add(DATE, 1);
		
		d1 = c1.getTime();
		System.out.println(d1);

		c1.set(2016, 10, 11, 19, 39, 00);
		
		d1 = c1.getTime();
		System.out.println(d1);

		c1.set(2015, 7, 10, 0, 0, 0);
		c1.add(MONTH, 6);
		d1 = c1.getTime();
		System.out.println(d1);

		c1.set(2015, 7, 10, 0, 0, 0);
		c1.roll(MONTH, 6);
		d1 = c1.getTime();
		System.out.println(d1);

		c1.set(2015, 7, 10, 0, 0, 0);
		c1.set(MONTH, 15);
		d1 = c1.getTime();
		System.out.println(d1);

		/*
		c1.setLenient(false);
		c1.set(2015, 7, 10, 0, 0, 0);
		c1.set(MONTH, 15);
		d1 = c1.getTime();
		System.out.println(d1);
		*/

		c1.set(2015, 7, 31, 0, 0, 

		);
		c1.set(MONTH, 8);
		//d1 = c1.getTime();
		//System.out.println(d1);
		c1.set(DATE, 5);
		d1 = c1.getTime();
		System.out.println(d1);
	}
}
