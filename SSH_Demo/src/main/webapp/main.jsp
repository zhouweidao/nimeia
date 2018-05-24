<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="renderer" content="webkit">

		<title>西南科技大学运动管理系统</title>

		<meta name="keywords" content="CASIT_UI">
		<meta name="description" content="">

		<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

		<link rel="stylesheet" type="text/css" href="bishe/base/plugins/bootstrap/bootstrap.css">
		<link href="bishe/base/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
		<link href="bishe/base/css/animate.css" rel="stylesheet">
		<link href="bishe/base/css/style.css?v=4.1.0" rel="stylesheet">
		<script src="bishe/base/js/jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="bishe/base/plugins/bootstrap/bootstrap.min.js" type="text/javascript"></script>
		<style>
			*{
				margin: 0;
				padding: 0;
			}
			html {
				overflow: hidden;
				important!
			}
			
			body {
				overflow-x: hidden;
				overflow-y: hidden;
			}
			
			.title {

				height: 100%;

				

			}
			.tools ul li{
				float: left;
				list-style: none;
			}
			div#footer {
			    width: 54%;
			    height: 103px;
			    background: #5ca2ea;
			    margin-left: 23%;
			}
		</style>
	</head>

	<body class="" style="background: #e8e8e8;">
		<!--左侧导航开始-->
		<!--<div id="rel_header"></div>-->
		<div class="col-sm-12 title">
			<div id="header">
				<img style="margin-left: 15%;width:70%;" src="bishe/base/img/XKDsport-sys.png"/>
			</div>
			<!--<div class="header"><img src="base/img/XKDsport-sys.png"/></div>-->
			<div class="tools" style="    position: absolute;right: 475px;top: 25px;">
				
				<ul>
					<li>
						<a id="Login_start_" data-toggle="modal" data-target="#loginModalA" data-whatever="@mdo">运动员登录</a>
					</li>
					<li style="margin: 0 20px;">
						<a id="Login_start1_" data-toggle="modal" data-target="#loginModalB" data-whatever="@mdo">赛事管理员登录</a>
					</li>
					<li>
						<a id="Login_start2_" data-toggle="modal" data-target="#loginModalC" data-whatever="@mdo">系统管理员登录</a>
					</li>
				</ul>
				
			</div>
			
			
				<iframe style="margin-left: 15%;" class="J_iframe" name="iframe0" width="70%" height="50%" src="bishe/jsp/docs/index.jsp" frameborder="0" data-id="index_v1.html" seamless></iframe>
			
			<!--<div id="footer">

				

			</div>-->
		</div>
		<!-- 用户A模态框 -->
			<div class="modal fade" id="loginModalA" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel">
				<div class="modal-dialog" role="document" style="height: 100%;width: 100%;position: relative;">
					<div class="modal-content" style="width: 400px;position: absolute;top:25%;left: 39.5%;">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="loginModalLabel" style="text-align: center;">运动员登录</h4>
						</div>
						<div class="modal-body" >
								<div class="form-group" style="position:relative;">
									<input type="text" class="form-control usernameA" name="uname" placeholder="请输入用户名" >
									<i class="fa fa-user-o fa-lg" style="position: absolute;top:10px;right: 10px;"></i>
								</div>
								<div class="form-group" style="position:relative;">
									<input type="password" class="form-control passwordA" name="passwd" placeholder="请输入密码" >
									<i class="fa fa-lock fa-lg" style="position: absolute;top:10px;right: 12px;"></i>
								</div>
								<div>
								</div>
							<span class="showWorry">
							</span>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary btn-lg btn-block loginBtn" id="loginBtnA" data-loading-text="登录中...">登录</button>
							<a href="" style="text-decoration: none;"><span>忘记密码</span></a>
						</div>
					</div>
				</div>
			</div>
		<!-- 模态框结束 -->
		<!-- 用户B模态框 -->
			<div class="modal fade" id="loginModalB" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel">
				<div class="modal-dialog" role="document" style="height: 100%;width: 100%;position: relative;">
					<div class="modal-content" style="width: 400px;position: absolute;top:25%;left: 39.5%;">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="loginModalLabel" style="text-align: center;">赛事管理员登录</h4>
						</div>
						<div class="modal-body" >
							<form id="login-formb">
								<div class="form-group" style="position:relative;">
									<input type="text" class="form-control usernameB" name="uname" placeholder="请输入用户名">
									<i class="fa fa-user-o fa-lg" style="position: absolute;top:10px;right: 10px;"></i>
								</div>
								<div class="form-group" style="position:relative;">
									<input type="password" class="form-control passwordB" name="passwd" placeholder="请输入密码">
									<i class="fa fa-lock fa-lg" style="position: absolute;top:10px;right: 12px;"></i>
								</div>
								<div>
								</div>
							</form>
							<span class="showWorry">
							</span>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary btn-lg btn-block loginBtn" id="loginBtnB" data-loading-text="登录中...">登录</button>
							<a href="" style="text-decoration: none;"><span>忘记密码</span></a>
						</div>
					</div>
				</div>
			</div>
		<!-- 模态框结束 -->
		<!-- 用户C模态框 -->
			<div class="modal fade" id="loginModalC" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel">
				<div class="modal-dialog" role="document" style="height: 100%;width: 100%;position: relative;">
					<div class="modal-content" style="width: 400px;position: absolute;top:25%;left: 39.5%;">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="loginModalLabel" style="text-align: center;">系统管理员登录</h4>
						</div>
						<div class="modal-body" >
							<form id="login-formc">
								<div class="form-group" style="position:relative;">
									<input type="text" class="form-control usernameC" name="uname" placeholder="请输入用户名">
									<i class="fa fa-user-o fa-lg" style="position: absolute;top:10px;right: 10px;"></i>
								</div>
								<div class="form-group" style="position:relative;">
									<input type="password" class="form-control passwordC" name="passwd" placeholder="请输入密码" >
									<i class="fa fa-lock fa-lg" style="position: absolute;top:10px;right: 12px;"></i>
								</div>
								<div id="showDetails">
								</div>

							</form>
							<span class="showWorry">
							</span>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary btn-lg btn-block loginBtn" id="loginBtnC" data-loading-text="登录中...">登录</button>
							<a href="" style="text-decoration: none;"><span>忘记密码</span></a>
						</div>
					</div>
				</div>
			</div>

	<script>
	

   	$(function(){
		$('.loginBtn').click(function(event){
			var id = event.target.id;
			var username;
			var pasw;
			var type = 0;
			if(id.indexOf("loginBtnA") != -1){
				 username = $('.usernameA').val();
				 pasw = $('.passwordA').val();
			  	type = 1;
			}
			if(id.indexOf("loginBtnB") != -1){
				 username = $('.usernameB').val();
				 pasw = $('.passwordB').val();
				type = 2;
			}
			if(id.indexOf("loginBtnC") != -1){
				 username = $('.usernameC').val();
				 pasw = $('.passwordC').val();
				type = 3;
			}
			$.ajax({
				type:"post",
				url:"indexAction/login.html",
				async:true,
				data : {
					username : username,
					pasw : pasw,
					type : type
				},
				success : function(result){
					$('.modal-backdrop,.modal').hide();
					var resultStr = JSON.parse(result);
					if(result.indexOf("playinfo")!=-1){
						$("iframe").attr("src","bishe/jsp/docs/playerinfo.jsp");
					}else if(result.indexOf("managerinfo")!=-1){
						$("iframe").attr("src","bishe/jsp/docs/managerinfo.jsp");
					}else if(result.indexOf("admininfo")!=-1){
						$("iframe").attr("src","bishe/jsp/docs/admininfo.jsp");
					}else{
						alert(result);
					}
				}
			});
		}); 
		});
		</script>
</html>