<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>欢迎登录！</h2>

<form action="stud?op=login" method="post" >
    <span>学生姓名</span><input type="text" name="name"/>
    <span>密码</span><input type="text" name="pass"/>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
