import java.util.Locale;
import java.util.ResourceBundle;

public class Test118N
{
	public static void main(String[] args) 
	{
		//Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		Locale myLocale = new Locale("en", "US");

		ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);

		System.out.println(bundle.getString("hello"));
	}
}
