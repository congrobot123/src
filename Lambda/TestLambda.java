import java.util.Arrays;

public class TestLambda
{
	public static void main(String[] args) 
	{
		String a = "15432";
		Command command = (str, target) ->
							{
								str.append(target);
							};
		StringBuffer str = new StringBuffer("��ɵ������ǣ�");
		command.process(str, a);
		System.out.println(str);
	}
}

@FunctionalInterface
interface Command
{
	public abstract void process(StringBuffer str, String target);
}


