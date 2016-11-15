package servlet;

import java.sql.*;
public class Login {
public Connection conn=null;
public Connection getConn(){
	String DRIVER="com.mysql.jdbc.Driver";
	//String url="jdbc:mysql://localhost:3306/qstore?user=root&password=8836219&useUnicode=true&characterEncoding=GBK";
	String url = "jdbc:mysql://localhost:3306/qstore?user=root&password=8836219&useUnicode=true&characterEncoding=GBK";
	if(conn==null){
		try{
		Class.forName(DRIVER).newInstance();
		conn=DriverManager.getConnection(url);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
return conn;
}
}
