<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기_[Pick Me]</title>
</head>
<body>

<%@ include file="../common/header.jsp" %>

<form action="/pickme/idSearch.au" method="post">
	<input type="text" name="userName" placeholder="이름"> <br>
	<input type="text" name="userEmail" placeholder="이메일"> <br>
	<button type="submit">아이디 찾기</button>
</form>

<br><br>
<a href="/pickme/views/user/UserPassSearchForm.jsp">비밀번호 찾기</a> <br>

<a href="/pickme/views/user/UserLoginForm.jsp">로그인</a>
/
<a href="/pickme/views/user/UserJoinForm.jsp">가입</a>



<%@ include file="../common/footer.jsp" %>

</body>
</html>