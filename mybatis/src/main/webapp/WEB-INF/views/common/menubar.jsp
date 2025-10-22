<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.login-area a {
		text-decoration: none;
		color : black;
		font-size: 12px;
	}
	.nav-area {
		background-color: aqua;
		color: brown;
		height: 50px;
	}
	.menu {
		display: table-cell;
		width: 250px;
		height: 50px;
		vertical-align: middle;
		font-size: 14px;
		font-weight: 400;
	}
	.menu:hover {
		background-color: darkgray;
		cursor: pointer;
	}
</style>
</head>
<body>
	<h2 align="center">Welcome to MyBatis World</h2>
	<div class="Login-area" align="right">
		<form action="">
			<table>
				<tr>
					<td>아이디</td>
					<td><input name="userId" required autocomplete="current-password"></td>
					<td rowspan="2"><input type="submit" value="로그인" style="height: 50px;"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="password" required autocomplete="current-password"></td>
				</tr>
				<tr>
					<td colspan="3" align="center">
						<a href="enrollForm.me">회원가입</a>
						<a href="">아이디/비밀번호 찾기</a>
					</td>
				</tr>
			</table>
		</form>
		<table>
			<tr>
				<td colspan="2">
					<h4>xxx님 환영합니다</h4>
				</td>
			</tr>
			<tr>
				<td><a href="">마이페이지</a></td>
				<td><a href="">로그아웃</a></td>
			</tr>
		</table>
	</div>
	<br>
	<div class="nav-area" align="center">
		<div class="menu">HOME</div>
		<div class="menu">공지사항</div>
		<div class="menu">게시판</div>
		<div class="menu">ETC</div>
	</div>
</body>
</html>