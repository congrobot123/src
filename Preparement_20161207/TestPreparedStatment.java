import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPreparedStatment
{
	public static void main(String[] args)
		throws Exception
	{
		insertUseStatment();
		
		insertPreparedStatement();
	}

	public static void insertUseStatment()
		throws Exception
	{
		long start = System.currentTimeMillis();
		//1、加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2、通过DriverManager获取数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3、通过Connection对象创建Statement对象
			Statement stmt = conn.createStatement();
		)
		{
			String sql = "insert into student_table values(null, 'xxx', '123456789000', 'male', 'test')";
			stmt.execute(sql);

			sql = "insert into student_table values(null, 'yyy', '1234567891111', 'male', 'test'); insert into student_table values(null, 'yxxx', '1234567892222', 'male', 'test');";
			System.out.println(sql);

			stmt.execute(sql);

			/*
			//4、使用Statement执行SQL语句
			for(int i = 0; i < 1; ++i)
			{
				sql = "insert into student_table values(null," +
							"'xsksk', '111111', 'male', 'test info');delete from student_table; insert into student_table values(null, 'yyy" + i + "'," + 
								"'1234567"+ i + "'," + 
									"'Male','test info');";
				System.out.println(sql);

				stmt.executeUpdate(sql);
				//System.out.println(i);
				
			}
			*/
		}

		long end = System.currentTimeMillis();
		System.out.println("Statment use time: "+ (end - start) );
	}

	public static void insertPreparedStatement()
		throws Exception
	{
		long start = System.currentTimeMillis();
		//1、加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2、通过DriverManager获取数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3、通过Connection对象创建Statement对象
			PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null, ?, ?, 'Male', 'test info')");
		)
		{
			//4、使用Statement执行SQL语句
			for(int i = 0; i < 10; ++i)
			{
				pstmt.setString(1, "yyy" + i);
				pstmt.setString(2, "7654321" + i);
				pstmt.executeUpdate();
				//System.out.println(i);
				
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("PreparedStatment use time: "+ (end - start) );
	}
}
