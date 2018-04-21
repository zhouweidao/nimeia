<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<title>Admin页面</title>  
</head>  
<body>  
    <form action="addUser" method="post">  
        adminID:<input type="text" name="adminID"/><br/>  
        <input type="submit" value="添加"/><br/>  
    </form>  
    <form action="deleteUser" method="post">  
        adminName:<input type="text" name="adminName"/><br/>  
        <input type="submit" value="删除"/><br/>  
    </form> 
</body>  
</html>  
