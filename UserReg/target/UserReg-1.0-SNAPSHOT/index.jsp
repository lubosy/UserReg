<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "LOG IN" %>
</h1>
<br/>
<form action="hello-servlet" method="post">
    <label>Username</label><br/>
    <input type="text" name="username"> <br/>

    <label>Password</label><br>
    <input type="text" name="password"> <br/>

<input type="submit" value="login">
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>