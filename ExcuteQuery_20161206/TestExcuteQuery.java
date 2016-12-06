import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;

public class TestExcuteQuery 
{
	public static void main(String[] args)
		throws Exception
	{
		String sql = "select contact_id,telnum,name,passwd,gender,remark,auth " +
						"from contact_table,auth_table,gender_table " + 
							"where contact_table.gender_id = gender_table.id " + 
								"and contact_table.auth_id = auth_table.id";

		//1���������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");

		try
		(
			//2��ͨ��DriverManager��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase", "root", "congrobot");

			//3��ͨ��Connection���󴴽�Statement����
			Statement stmt = conn.createStatement();
		)
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
}
