<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입_[Pick Me]</title>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<form action="/pickme/userJoin.au" method="post">
	<input type="text" name="userId" placeholder="아이디"><br>
	<input type="password" name="userPass" placeholder="비밀번호"><br>
	<input type="password" name="userPass2" placeholder="비밀번호 확인"><br>
	<input type="text" name="userName" placeholder="이름"><br>
	<input type="email" name="userEmail" placeholder="이메일"><br>
<button type="submit">가입</button>

</form>


<br><br>
<a href="/pickme/views/user/UserLoginForm.jsp">로그인</a>
<br>
<a href="/pickme/views/user/UserIdSearchForm.jsp">아이디 찾기</a>
/
<a href="/pickme/views/user/UserPassSearchForm.jsp">비밀번호 찾기</a>

<%@ include file="../common/footer.jsp" %>
</body>
</html>