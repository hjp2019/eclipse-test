package com.swufe.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	private ConnectionFactory(){
		
	}
	/**
	 * ͨ��web.xml��JNDIname�������ô�������
	 * @return
	 */
	public static Connection getConnection(){
/*		try {
			String JNDIname=(String)new javax.naming.InitialContext().lookup("java:comp/env/JNDIname");
			return ConnectionFactory.getConnection(JNDIname);
		} catch (NamingException e) {
			 
			System.out.print("��ݿ�δ���������ӳ�δ���ã�");
		}*/
		
		String driver = "com.mysql.jdbc.Driver";         // 驱动程序名

        
        String url = "jdbc:mysql://localhost/survey";     // URL指向要访问的数据库名scutcs          
        
        String user = "root";       // MySQL配置时的用户名

        String password = "root";      // MySQL配置时的密码


         
         Connection conn=null;
		try {
			Class.forName(driver);    // 加载驱动程序

			
			 conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     return conn;

	}
	/**
	 * ͨ��ָ����JNDI��ƻ�ȡ��ݿ�����,��JDBC/SURVEY
	 * @param JNDIname
	 * @return Connection
	 */
	public static Connection getConnection(String JNDIname){
	

		return getConnection();
		
		
		
	/*	
		try {
			Context initCtx = new InitialContext();
		      Context envCtx = (Context) initCtx.lookup("java:comp/env");
		      DataSource ds = (DataSource) envCtx.lookup(JNDIname);

			return ds.getConnection();
		} catch (NamingException e1) {
		 
			System.out.print("��ݿ�δ���������ӳ�δ���ã�");
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		*/

	}
}
