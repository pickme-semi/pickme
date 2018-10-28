<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인_[Pick Me]</title>
</head>
<body>
<%@ include file="../common/header.jsp" %>

<form action="/pickme/login.au" method="post">
	<input name="userId" type="text" placeholder="아이디"><br>
	<input name="userPass" type="password" placeholder="비밀번호"><br>
	<button type="submit" value="로그인">로그인</button>
</form>

<br><br>

<a href="/pickme/views/user/UserJoinForm.jsp">가입</a>
<br>
<a href="/pickme/views/user/UserIdSearchForm.jsp">아이디 찾기</a>
/
<a href="/pickme/views/user/UserPassSearchForm.jsp">비밀번호 찾기</a>


<%@ include file="../common/footer.jsp" %>
</body>
</html>