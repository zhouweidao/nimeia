<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="../../base/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="../../base/css/layoutit.css" />
<link rel="stylesheet" type="text/css"
	href="../../base/css/bootstrap-combined.min.css" />

<script type="text/javascript" src="../../base/js/jquery.min.js"></script>
<script type="text/javascript"
	src="../../base/js/jquery/jquerysession.js"></script>
<script type="text/javascript" src="../../base/js/bootstrap.min.js"></script>

</head>
<style type="text/css">
.row-fluid .span6 {
	width: 100%;
}

th {
	text-align: center !important;
}

td {
	text-align: center !important;
}

.table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th,
	.table>thead>tr>td, .table>thead>tr>th {
	border: 1px solid #ddd;
}

* {
	padding: 0px;
	margin: 0px;
}

.pop {
	display: none;
	width: 600px;
	min-height: 470px;
	max-height: 750px;
	height: 470px;
	position: absolute;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	margin: auto;
	padding: 25px;
	z-index: 130;
	border-radius: 8px;
	background-color: #fff;
	box-shadow: 0 3px 18px rgba(100, 0, 0, .5);
}

.pop-top {
	height: 40px;
	width: 100%;
	border-bottom: 1px #E5E5E5 solid;
}

.pop-top h2 {
	float: left;
	display: black
}

.pop-top span {
	float: right;
	cursor: pointer;
	font-weight: bold;
	display: black
}

.pop-foot {
	height: 50px;
	line-height: 50px;
	width: 100%;
	border-top: 1px #E5E5E5 solid;
	text-align: right;
}

.pop-cancel, .pop-ok {
	padding: 8px 15px;
	margin: 15px 5px;
	border: none;
	border-radius: 5px;
	background-color: #337AB7;
	color: #fff;
	cursor: pointer;
}

.pop-cancel {
	background-color: #FFF;
	border: 1px #CECECE solid;
	color: #000;
}

.pop-content {
	height: 380px;
}

.pop-content-left {
	float: left;
}

.pop-content-right {
	width: 310px;
	float: left;
	padding-top: 20px;
	padding-left: 20px;
	font-size: 16px;
	line-height: 35px;
}

.bgPop {
	display: none;
	position: absolute;
	z-index: 129;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, .2);
}
</style>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="row-fluid">
					<div class="span2">
						<img alt="140x140"
							src="../../base/img/68ad566d7c8f72d258e173d0299cba71.jpg" />
					</div>
					<div class="span6">
						<form>
							<fieldset>
								<legend>个人信息</legend>
								<label>ID</label> <input type="text" class="username"
									disabled="false" value="" /> <span class="help-block"></span>
								<label>姓名</label> <input type="text" disabled="false"
									class="sex" value="" /> <span class="help-block"></span> <label>院系</label>
								<input type="text" disabled="false" class="dept" value="" /> <span
									class="help-block"></span> <label>班级</label> <input type="text"
									disabled="false" class="dept" value="" /> <span
									class="help-block"></span> <label>性别</label> <input type="text"
									disabled="false" class="dept" value="" /> <span
									class="help-block"></span> <label>联系方式</label> <input
									type="text" disabled="false" class="dept" value="" /> <span
									class="help-block"></span> <label>用户类型</label> <input
									type="text" disabled="false" class="dept" value="" /> <span
									class="help-block"></span>
								<button class="editbtn btn btn-info buttom-left" id="editinfo"
									type="submit">
									<i class="fa fa-wrench"></i>修改个人信息
								</button>
								<button class="savebtn btn btn-success pull-right" type="submit">
									<i class="fa fa-save"></i>保&nbsp;存
								</button>
								<button class="applybtn btn btn-warning dropdown-toggle"
									data-toggle="modal" data-target="#loginModalA"
									data-whatever="@mdo" type="submit">
									<i class="fa fa-plus"></i> 报名
								</button>
							</fieldset>
						</form>


						<table class="table">
							<thead>
								<tr style="background-color: #faa732;">
									<th>序号</th>
									<th>项目类别</th>
									<th>项目类型</th>
									<th>项目名称</th>
									<th>项目成绩</th>
									<th>项目排名</th>
									<th>项目(所得)积分</th>
									<th id="sumscore">总积分</th>
									<th id="deptnum">院排名</th>
									<th id="schoolnum">校排名</th>
								</tr>
							</thead>
							<tbody>
								<tr class="info">
									<td>1</td>
									<td>女</td>
									<td>个人</td>
									<td>400米</td>
									<td>60"020</td>
									<td>2</td>
									<td>14</td>
									<td style="line-height: 74px;" rowspan="2">17</td>
									<td style="line-height: 74px;" rowspan="2">29</td>
									<td style="line-height: 74px;" rowspan="2">2</td>
								</tr>
								<tr class="info">
									<td>2</td>
									<td>女</td>
									<td>团体</td>
									<td>400米</td>
									<td>60"020</td>
									<td>2</td>
									<td>14</td>

								</tr>
							</tbody>
						</table>
					</div>
					<div class="span4"></div>
				</div>
			</div>
		</div>
	</div>
	<!--遮罩层-->
	<div class="bgPop"></div>
	<!--弹出框-->
	<div class="pop">
		<div class="pop-top">
			<h2>课程介绍</h2>
			<span class="pop-close">Ｘ</span>
		</div>
		<div class="pop-content">
			<div class="pop-content-left">
				<img src="" alt="" class="teathumb">
			</div>
			<div class="pop-content-right">
				<div class="form-group" style="position: relative;">
					<select class="itemtype">
						<option>------请选择项目类型------</option>
					</select>
				</div>
				<div class="form-group" style="position: relative;">

					<select class="itemname">
						<option>------请选择项目名</option>
					</select>
				</div>
			</div>
		</div>
		<div class="pop-foot">
			<input type="button" value="关闭" class="pop-cancel pop-close">
			<input type="button" value="报名" class="pop-ok">
		</div>
	</div>
</body>

<script>

$(function(){
	var player = $.session.get("player");
	$.ajax({
		type:"post",
		url:"",
		async:true,
		success : function(result){
			if(result.equal('0')){
				$('.applybtn').attr('disabled','false');
			}else{
				$('.applybtn').attr('disabled','true');
			}
		}
	});
	$.ajax({
		type:"post",
		url:"",
		async:true,
		data:{
			playerid : JSON.toLocaleString(player.playerid)
		},
		success : function(playerinfos){
			for(var i = 0;i < playerinfos.length; i++){
				
			}
		}
	});
});
	
$('.pop-close').click(function() {
	$('.bgPop,.pop').hide();
});
$('.applybtn').click(function() {
	$('.bgPop,.pop').show(1000);
});
$('.editbtn').click(function() {
	$('input').attr('disabled', 'true');
});

$('.savebtn').click(function() {
	var playerid = $('.playerid').val();
	var username = $('.username').val();
	var sex = $('.sex').val();
	var dept = $('.dept').val();
	var cls = $('.cls').val();
	var phonenum= $('.phonenum').val();
	var usertype = $('.usertype').val();
	var partem = [];
	partem.push(playerid);
	partem.push(username);
	partem.push(sex);
	partem.push(dept);
	partem.push(cls);
	partem.push(phonenum);
	partem.push(usertype);
	
	$.ajax({
		type:"post",
		url:"",
		async:true,
		data : {
			playerinfo : JSON.toLocaleString(partem) 
		},
		success : function(result){
			alert(result);
		}
	});
});
	
</script>
</html>