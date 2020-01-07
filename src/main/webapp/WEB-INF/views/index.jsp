<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>핑거뱅크</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link href="${css}/login.css" rel="stylesheet">
</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first" style="font-size: 24px;font-family: serif;">
      FingerBank
    </div>

    <!-- Login Form -->
    <form>
      <input type="text" id="login" class="fadeIn second" name="id" placeholder="id">
      <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
      <input id="loginbtn" type="button" class="fadeIn fourth" value="LogIn">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">아직 FingerBank회원이 아니신가요?</a>
    </div>

  </div>
</div>
</body>
<script src="${js}/app.js"></script>
<script>
app.init("${ctx}");
</script>
</html>