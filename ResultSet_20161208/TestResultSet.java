import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class TestResultSet
{
	public static void main(String[] args)
		throws Exception
	{
		//1������100����������
		insertPreparedStatement();

		//2���������������ݣ���֤�ɻع���ͬʱ�޸ļ�¼��
		indexUpdatePreparedStatement();

		//3���������������ݣ��鿴���޸�
		indexPreparedStatement();
	}

	public static void insertPreparedStatement()
		throws Exception
	{
		//1���������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2��ͨ��DriverManager��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3��ͨ��Connection���󴴽�Statement����
			PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null, ?, ?, 'Male', 'test info')");
		)
		{
			//4��ʹ��Statementִ��SQL���
			for(int i = 0; i<100; ++i)
			{
				pstmt.setString(1, "xxx" + (i+1));
				pstmt.setString(2, "123456789" + (i+1));
				pstmt.executeUpdate();				
			}
		}
	}

	public static void indexUpdatePreparedStatement()
		throws Exception
	{
		//1���������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2��ͨ��DriverManager��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3��ͨ��Connection���󴴽�Statement����
			PreparedStatement pstmt = conn.prepareStatement("select * from student_table", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		)
		{
			//4��ʹ��Statementִ��SQL���
			ResultSet rs = pstmt.executeQuery();

			//5�����������
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

			rs.afterLast();
			int j = 100;
			while(rs.previous())
			{
				for(int i=0; i<columnCount; ++i)
				{
					System.out.print(rs.getString(i+1) + "\t");
				}
				System.out.println();
				
				rs.updateString(2, "yyy" + j);
				rs.updateRow();

				--j;
			}
		}

		System.out.println("\n");
	}

	public static void indexPreparedStatement()
		throws Exception
	{
		//1���������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2��ͨ��DriverManager��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3��ͨ��Connection���󴴽�Statement����
			PreparedStatement pstmt = conn.prepareStatement("select * from student_table");
		)
		{
			//4��ʹ��Statementִ��SQL���
			ResultSet rs = pstmt.executeQuery();

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

		System.out.println("\n");
	}
}
