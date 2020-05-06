<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/15
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>成功了</title>
</head>
<body>
 <p>姓名：${ff.name}</p>
 <p>密码：${ff.password}</p>
 <p>年龄：${ff.age}</p>
 <p>描述：${ff.description}</p>
 <p>性别：${sessionScope.ff.sex}</p>

</body>
</html>
