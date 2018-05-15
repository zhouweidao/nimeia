<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
		<link rel="stylesheet" href="../../base/css/bootstrap.min.css" />
				<link rel="stylesheet" type="text/css" href="../../base/css/layoutit.css" />
		<link rel="stylesheet" type="text/css" href="../../base/css/bootstrap-combined.min.css" />
		
		<script type="text/javascript" src="../../base/js/jquery.min.js" ></script>
		<script type="text/javascript" src="../../base/js/jquery/jquerysession.js" ></script>
		<script type="text/javascript" src="../../base/js/bootstrap.min.js" ></script>
		
	</head>
	<body>
		<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="row-fluid">
				<div class="span2">
					<img alt="140x140" src="../../base/img/68ad566d7c8f72d258e173d0299cba71.jpg" />
				</div>
				<div class="span6">
					<form>
						<fieldset>
							 <legend>赛事管理员——个人信息</legend> 
							 <label>ID</label>
							 <input type="text" class="username" disabled="false" value=""/> 
							 <span class="help-block"></span> 
							 <label>姓名</label>
							 <input type="text" class="username" disabled="false" value=""/> 
							 <span class="help-block"></span> 
							 <label>权限等级</label>
							 <input type="text" disabled="false" class="priority" value=""/> 
							 <span class="help-block"></span> 
						</fieldset>
					</form>
					
		
	</div>
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<form class="form-inline">
				<dl style="float: left;">
					<dt style="line-height: 32px;">
						修改权限操作：
					</dt>
				</dl>
				<div class="btn-group">
					 <button class="btn">项目类别</button> <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="caret"></span></button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">女子</a>
						</li>
						<li>
							<a href="#">男子</a>
						</li>
					</ul>
				</div>
				<div class="btn-group">
					 <button class="btn">项目类型</button> <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="caret"></span></button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">个人</a>
						</li>
						<li>
							<a href="#">团体</a>
						</li>
					</ul>
				</div>
				<div class="btn-group">
					 <button class="btn">项目名</button> <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="caret"></span></button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">001</a>
						</li>
						<li>
							<a href="#">002</a>
						</li>
						<li>
							<a href="#">...</a>
						</li>
					</ul>
				</div>
				<div class="btn-group">
					 <button class="btn">运动员</button> <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="caret"></span></button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">运动员名+运动员ID-001</a>
						</li>
						<li>
							<a href="#">运动员名+运动员ID-002</a>
						</li>
						<li>
							<a href="#">运动员名+运动员ID-...</a>
						</li>
					</ul>
				</div>
				<div class="btn-group">
					 <button class="btn">获得名次</button> <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="caret"></span></button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">第1名</a>
						</li>
						<li>
							<a href="#">第2名</a>
						</li>
						<li>
							<a href="#">第3名</a>
						</li>
						<li>
							<a href="#">第4名</a>
						</li>
						<li>
							<a href="#">第5名</a>
						</li>
						<li>
							<a href="#">第6名</a>
						</li>
						<li>
							<a href="#">第7名</a>
						</li>
						<li>
							<a href="#">第8名</a>
						</li>
					</ul>
				</div>
				<input placeholder="请输入比赛成绩" type="text"> 
				<fieldset style="margin-top: 10px;margin-left: 97px;">
					 <button class="btn btn-success" type="submit">确认录入</button> <button class="btn btn-warning" type="submit">撤销录入</button>
				</fieldset>
			</form>
			<form class="form-inline">
				<dl>
					<dt style="float: left;line-height: 32px;">
						修改密码操作：
					</dt>
				</dl>
				<fieldset>
					<input type="text" /> <button class="btn btn-danger" type="submit">确认修改</button>
				</fieldset>
			</form>
			<form>
				<dl>
					<dt style="float: left;line-height: 32px;">
						报名控制操作：
					</dt>
				</dl>
				<fieldset>
					<button class="btn btn-primary" type="submit">开启/关闭报名</button>
				</fieldset>
			</form>
		</div>
	</div>
</div>
</div>
	</body>
</html>
