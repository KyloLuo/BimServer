<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%request.setCharacterEncoding("UTF-8");%>
<%
String url="jdbc:mysql://localhost:3306/users?user=root&password=8836219&useUnicode=true&characterEncoding=GBK";
String username=java.net.URLDecoder.decode(request.getParameter("username"),"UTF-8");
String pwd=java.net.URLDecoder.decode(request.getParameter("password"),"UTF-8");
String sex=java.net.URLDecoder.decode(request.getParameter("sex"),"UTF-8");
String email=java.net.URLDecoder.decode(request.getParameter("email"),"UTF-8");
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn=DriverManager.getConnection(url);
String sql="insert into users values(\'"+username+"\',\'"+pwd+"\',\'"+sex+"',\'"+email+"')";
String sql1="select username from users where username=\'"+username+"\'";
Statement st=conn.createStatement();
PreparedStatement st1=conn.prepareStatement(sql);
ResultSet rs=st.executeQuery(sql1);


if(username.trim().equals("")|| pwd.trim().equals(""))
{
out.write("<font color=\"red\"> 用户名或密码为空！</font>");
}
else if(pwd.matches("[\\u4E00-\\u9FA5]+"))
{
out.write("<font color=\"red\">密码不得包含中文！</font>");
}
else if(!email.matches("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")){
out.write("<font color=\"red\">对不起,邮箱格式错误！</font>");
}
else if(rs.next()){
out.write("<font color=\"red\">该用户名已被注册!</font>");
} 
else{
out.write("<font color=\"red\">注册成功，"+username+"</font>");
st1.executeUpdate();
}

 rs.close();
 st.close();
 st1.close();
 conn.close();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'register_check.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<br>
  </body>
</html>
