<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h1 style="color:red;text-align:center"> Login Page</h1>

<p style="color:red">${errorMsg}</p>
<form action="lhsurl"  method="post">
  Username: <input type="text" name="uname"><br>
  password: <input type="password" name="pwd"><br>
  <input type="submit"  value="Login">
</form>
