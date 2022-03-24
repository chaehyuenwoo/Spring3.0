<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("utf-8"); %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h2 style="color: green;">Spring MVC Controller Test</h2>

<h3>1. <a href="test/param.action?name=suzi&phone=010-123-1234&
email=suzi@naver.com">GET방식 테스트</a></h3>

<h3>2. POST방식 테스트</h3>
<form action="test/param.action" method="post">
이름: <input type="text" name="name"/><br/>
전화: <input type="text" name="phone"/><br/>
이메일: <input type="text" name="email"/><br/>
<input type="submit" value="전송"/><br/>
</form>

</body>
</html>
