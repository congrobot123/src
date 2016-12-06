import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;

public class TestMakeData
{
	private Connection conn = null;
	private Statement stmt = null;

	public static void main(String[] args)
		throws Exception
	{	
		TestMakeData test = new TestMakeData();
		
		test.Init();

		if(test.IsConnected() == true)
		{
			for(int i = 0; i<100; ++i)
			{
				String sql = "insert into student_table values (null, + " +
								"'xxx" + i + "'," + 
									"'1234567"+ i + "'," + 
										"'Male','test info')";
				test.Insert(sql);
			}
		}

		String sql = "select * from student_table";

		test.Index(sql);
		
		test.Close();

	}

	public boolean IsConnected()
	{
		if(conn == null)
		{
			return false;
		}

		if(stmt == null)
		{
			return false;
		}

		return true;
	}

	public void Init()
		throws Exception
	{
		//1���������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");

		//2��ͨ��DriverManager��ȡ���ݿ�����
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

		//3��ͨ��Connection���󴴽�Statement����
		stmt = conn.createStatement();
	}

	public void Close()
		throws Exception
	{
		if(stmt != null)
		{
			stmt.close();
		}

		if(conn != null)
		{
			conn.close();
		}
	}

	public boolean Insert(String sql)
		throws Exception
	{
		//4��ʹ��Statementִ��SQL���
		int result = stmt.executeUpdate(sql);

		if(result != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void Index(String sql)
		throws Exception
	{
		//4��ʹ��Statementִ��SQL���
		ResultSet rs = stmt.executeQuery(sql);

		//5�����������
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		while(rs.next())
		{
			for(int i=0; i<columnCount; ++i)
			{
				System.out.print(rs.getString(i+1) + "\t");
			}
			System.out.println();
		}
	}
}