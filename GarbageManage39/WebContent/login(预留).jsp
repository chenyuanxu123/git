<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>垃圾分类信息化管理系统</title>
		<link  rel="stylesheet" href="css/index1.css"/>
		<script type="text/javascript" src="js/jquery.min.js"></script>
	</head>
	<script type="text/javascript">
		function login(){
			var user_name=$("#username").val();
			var user_pwd=$("#password").val();
			var yzm=$("#yzm").val();
			if(user_name==null||user_name==""){
				$("#tip1").css("display","block");
				/* return false; */
			}else if(user_pwd==null||user_pwd==""){
				$("#tip2").css("display","block");
				/* return false; */
			}else if(yzm==null||yzm==""){
				$("#tip3").css("display","block");
				/* return false; */
			}else{
				$("#form1").submit();
			}
		}
		
		$(function(){
			var user_name=$("#username").val();
			var user_pwd=$("#password").val();
			var yzm=$("#yzm").val();
			
			$("#username").blur(function(){
				if(user_name!=null||user_name!=""){
					$("#tip1").css("display","none");
				}
			});
			$("#password").blur(function(){
				if(user_pwd!=null||user_pwd!=""){
					$("#tip2").css("display","none");
				}
			});
			$("#yzm").blur(function(){
				if(yzm!=null||yzm!=""){
					$("#tip3").css("display","none");
				}
			});
			
			var error=getQueryString("error");
			var imageCode=getQueryString("imageCode");
			var userName=getQueryString("userName");
			var password=getQueryString("password");
			if(imageCode=="null"){
				imageCode="";
			}
			if(userName=="null"){
				userName="";
			}
			if(password=="null"){
				password="";
			}
			if(error==1){
				$("#tip4").html("*验证码错误");
				$("#username").val(userName);
				$("#password").val(password);
				$("#yzm").val(imageCode);
			}
			if(error==2){
				$("#tip4").html("*用户名或者密码错误");
				$("#username").val(userName);
				$("#password").val(password);
				$("#yzm").val(imageCode);
			}
			
		});
		
		function loadImage(){
			document.getElementById("randImage").src="${pageContext.request.contextPath }/images/image.jsp?"+Math.random();
		}
		
		function getQueryString(name){
			 var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
			 var url=decodeURI(decodeURI(window.location.search));	//获取返回路径
			 var r=url.substr(1).match(reg);
			 if(r!=null){
				 return unescape(r[2]);
			 }
			 return null;
		}
		
	</script>
<body>
<form action="${pageContext.request.contextPath }/userInfo/login.action" method="post" id="form1">
	    <div class="dowebok">
			<div class="titles">垃圾分类信息化管理系统后台登录</div>
	        <div class="logo"></div>
	        <div class="form-item">
	            <input id="username" name="user_name" class="inputType" type="text" autocomplete="off" placeholder="请输入用户名">
	            <p class="tip" id="tip1">*请输入合法的用户名</p>
	        </div>
	        <div class="form-item">
	            <input id="password" name="user_pwd" class="inputType" type="password" autocomplete="off" placeholder="请输入密码" >
	            <p class="tip" id="tip2">*请输入合法的密码</p>
	        </div>
			<div class="form-item">
	            <input onkeydown="if(event.keyCode==13)form1.submit()" id="yzm" name="yzm" class="yzm" type="text" autocomplete="off" placeholder="请输入验证码" maxlength="4">
				<img title="换一张试试" onclick="javascript:loadImage()" src="${pageContext.request.contextPath }/images/image.jsp" id="randImage" name="randImage"/>
	            <p class="tip" id="tip3">*验证码不能为空</p>
	            <p class="tip1" id="tip4"></p>
	        </div>
	        <div class="form-item">
	        	<input class="submit" type="button" onclick="login()" value="登录"/>
	        </div>
	        <div class="reg-bar">
	            <a class="reg" href="javascript:">立即注册</a>
	            <a class="forget" href="javascript:">忘记密码</a>
	        </div>
	    </div>
	</form>
</body>
</html>