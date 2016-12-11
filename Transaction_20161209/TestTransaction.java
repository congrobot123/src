import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.Savepoint;

public class TestTransaction 
{
	private Connection conn = null;
	private PreparedStatement pstmt1 = null;
	private PreparedStatement pstmt2 = null;
	
	public static void main(String[] args)
		throws Exception
	{
		TestTransaction t = new TestTransaction();

		t.init();

		if(t.conn != null)
		{
			t.transation();
		}

		t.close();
	}

	public void transation()
		throws Exception
	{
		//3、通过Connection对象创建Statement对象
		pstmt1 = conn.prepareStatement("insert into student_table values(null, ?, ?, 'Male', 'test info')");
		
		if(pstmt1 != null)
		{
			//4、使用Statement执行SQL语句
			for(int i = 0; i < 2; ++i)
			{
				pstmt1.setString(1, "yyy1" + i);
				pstmt1.setString(2, "7654321" + i);
				pstmt1.executeUpdate();
			}
			Savepoint a = conn.setSavepoint("a");

			index();

			for(int i = 0; i < 2; ++i)
			{
				pstmt1.setString(1, "yyy2" + i);
				pstmt1.setString(2, "7654322" + i);
				pstmt1.executeUpdate();
			}
			Savepoint b = conn.setSavepoint("b");
			index();

			pstmt1.setString(1, "yyy30");
			pstmt1.setString(2, "76543230");
			pstmt1.executeUpdate();

			index();

			conn.rollback(b);

			conn.commit();

			index();
		}
	}

	public void index()
		throws Exception
	{
		//3、通过Connection对象创建Statement对象
		pstmt2 = conn.prepareStatement("select * from student_table");

		if(pstmt2 != null)
		{
			//4、使用Statement执行SQL语句
			ResultSet rs = pstmt2.executeQuery();

			//5、操作结果集
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
			System.out.println("\n");
		}
	}

	public void init()
		throws Exception
	{
		//1、加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2、通过DriverManager获取数据库连接
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");
		
		if(conn != null)
		{
			conn.setAutoCommit(false);
		}
	}

	public void close()
		throws Exception
	{
		if(pstmt1 != null)
		{
			pstmt1.close();
		}

		if(pstmt2 != null)
		{
			pstmt2.close();
		}

		if(conn != null)
		{
			conn.close();
		}
	}
}
