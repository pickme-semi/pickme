<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기_[Pick Me]</title>
</head>
<body>

<%@ include file="../common/header.jsp" %>

<form action="/pickme/passSearch.au" method="post">
	<input type="text" name="userId" placeholder="아이디"> <br>	
	<input type="text" name="userEmail" placeholder="이메일"> 
	<button>발송</button><br>
	<input type="text" name="userAuCode" placeholder="인증코드"> 
	<button>확인</button><br>
	<button type="submit">비밀번호 재발급</button>
</form>

<br><br>

<a href="/pickme/views/user/UserIdSearchForm.jsp">아이디 찾기</a>

<br>

<a href="/pickme/views/user/UserLoginForm.jsp">로그인</a>
/
<a href="/pickme/views/user/UserJoinForm.jsp">가입</a>

<%@ include file="../common/footer.jsp" %>

</body>
</html>