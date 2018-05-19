<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style type="text/css">.row-fluid .span6 {
	width: 100%;
}

th {
	text-align: center !important;
}

td {
	text-align: center !important;
}

.table>tbody>tr>td,
.table>tbody>tr>th,
.table>tfoot>tr>td,
.table>tfoot>tr>th,
.table>thead>tr>td,
.table>thead>tr>th {
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

.pop-cancel,
.pop-ok {
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

.span8 div input{
	height: 30px;
	margin-right: 20px;
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
}</style>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="row-fluid">
					<div class="span2">
						<img alt="140x140"
							src="../../base/img/68ad566d7c8f72d258e173d0299cba71.jpg" />
					</div>
					<div class="span10">

								<legend>个人信息</legend>
								<div class="span8">
									<div style="float: left;">
								<label>ID</label> 
								<input type="text" class="playerid" disabled="false" value="20090351"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>用户类别</label> 
								<input type="text" class="usertype" disabled="false" value="学生"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>院系</label> 
								<input type="text" class="dept" disabled="false" value="材料科学与工程学院"/><span class="help-block"></span>
								</div>
								</div>
								<div class="span8">
								<div style="float: left;">
								<label>姓名</label> 
								<input type="text" class="username" disabled="false" value="梅强"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>性别</label> 
								<input type="text" class="sex" disabled="false" value="男"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>专业</label> 
								<input type="text" class="dept" disabled="false" value="应用化学"/><span class="help-block"></span>
								</div>
								</div>
								<div class="span8">
									<div style="float: left;">
								<label>权限等级</label> 
								<input type="text" class="proprity" disabled="false" value="1"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>联系方式</label> 
								<input type="text" class="phonenum" disabled="false" value="18200000000"/><span class="help-block"></span>
								</div>
								<div style="float: left;">
								<label>班级</label> 
								<input type="text" class="cls" disabled="false" value="应化1202"/><span class="help-block"></span>
								</div>
								</div>
								<div class="span8">
								<button class="editbtn btn btn-info buttom-left" id="editinfo">
									<i class="fa fa-wrench"></i>修改个人信息
								</button>
								<button class="savebtn btn btn-success pull-right">
									<i class="fa fa-save"></i>保&nbsp;存
								</button>
									 <button class="applybtn">报名</button>
									 </div>
							

					</div>
					<div class="span6">
						

						<table class="table firstTable">
							<thead>
								<tr style="background-color: #faa732;">
									<th>序号</th>
									<th>项目类别</th>
									<th>项目类型</th>
									<th>项目名称</th>
									<th>项目成绩</th>
									<th>项目排名</th>
									<th>项目(所得)积分</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								
							</tbody>
						</table>
						<table class="table secondTable" style="float: ;">
							<thead>
								<tr style="background-color: #faa732;">
									<th id="sumscore">总积分</th>
									<th id="deptnum">院排名</th>
									<th id="schoolnum">校排名</th>
								</tr>
							</thead>
							<tbody>
								<tr class="info">
									<td class = "sumItemScore" style="line-height: 74px;" rowspan="2">0</td>
									<td class = "deptNum" style="line-height: 74px;" rowspan="2">0</td>
									<td class = "schoolNum" style="line-height: 74px;" rowspan="2">0</td>
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
			<h2>报名</h2>
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
						<option>个人</option>
						<option>团体</option>
					</select>
				</div>
				<div class="form-group" style="position: relative;">

					<select class="itemname">
						<option>------请选择项目名------</option>
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
	var player;
$(function(){
	var playerstr = '<%=session.getAttribute("player")%>';
	player = JSON.parse(playerstr);
	alert(player);
	$('.playerid').val(player.playerID);
	$('.username').val(player.playerName);
	$('.sex').val(player.sex);
	$('.dept').val(player.depName);
	$('.cls').val(player.classes);
	$('.phonenum').val(player.tel);
	$('.playertype').val(player.player);
	$('.proprity').val(player.priority);
	//判断当前状态是否处于可报名
	$.ajax({
		type:"post",
		url:"../../../playerAction/isRunningAction.json",
		async:true,
		success : function(result){
			if(result.indexOf('error')!=-1){
				$('.applybtn').attr('disabled','disabled');
			}else{
				$('.applybtn').removeAttr('disabled');
			}
		}
	});
	//页面加载查看运动员是否有报名信息
 	showPlayerEntryInfos();
});

function showPlayerEntryInfos(){
	$.ajax({
		type:"post",
		url:"../../../playerAction/showPlayerInfo.json",
		async:true,
		data:{
			playerid : player.playerID,
			deptName : player.depName
		},
		success : function(playerinfos){
			var entryForm = playerinfos.entryForm;
			for(var i = 0;i < entryForm.length; i++){
				$('.firstTable tbody').append("<tr class = 'info'><td>"+i+"</td><td>"+player.sex
						+"</td><td>"+entryForm[i].itemType+"</td><td>"+entryForm[i].itemName+"</td><td>"
						+entryForm[i].record+"</td><td>"+entryForm[i].itemno+"</td><td>"+entryForm[i].itemScore+"</td><td><a>撤销报名<a></td></tr>");	
			}
			$('.sumItemScore').val(playerinfos.sumItemScore);
			$('.deptNum').val(playerinfos.deptNum);
			$('.schoolNum').val(playerinfos.schoolNum);
		}
	}); 
	
}

	//关闭弹窗
$('.pop-close').click(function() {
	$('.bgPop,.pop').hide();
});

//点击报名按钮，出现弹窗，并加载下拉框里边的数据
$('.applybtn').click(function() {
	$('.bgPop,.pop').show(1000);
});

$('.itemtype').change(function(){
	var itemtype = $('.itemtype option:checked').val();
	var sex = $('.itemkinds option:checked').val();
	$.ajax({
		type:"post",
		url:"../../../aminisotrAction/listAllItemName.json",
		async:true,
		data : {
			itemType : itemtype,
			itemsex : player.sex
		},
		success : function(items){
			for(var i = 0;i <items.length; i++){
				$('.itemname').append("<option id='"+items[i][0]+"'>"+items[i][1]+"</option>")
			}
		}
	});
});

//点击弹窗的报名按钮，如果成功给运动员信息也添加报名信息
$('.pop-ok').click(function(){
	var itemname = $('.itemname option:checked').val();
	var itemtype = $('.itemtype option:checked').val();
	$.ajax({
		type:"post",
		url:"../../../playerAction/playApply.json",
		async:true,
		data:{
			itemid : $('.itemname option:checked').attr('id'),
			itemname : itemname,
			itemtype : itemtype,
			playerEntry : JSON.stringify(player)
		},
		success : function(result){
			alert(result);
			if(result.indexOf("success")!=-1){
				showPlayerEntryInfos()
			}else{
				alert("报名失败");
			}
		}
	});
});

$('.editbtn').click(function() {
	$('input').removeAttr('disabled');
});



$('.savebtn').click(function() {
	
//	$('input').attr('disabled','disabled');
	$.ajax({
		type:"post",
		url:"../../../playerAction/editPlayerInfoAction.json",
		async:true,
		data : {
			playerid : $('.playerid').val(),
			username : $('.username').val(),
			sex : $('.sex').val(),
			dept : $('.dept').val(),
			cls : $('.cls').val(),
			phonenum : $('.phonenum').val(),
			usertype : $('.usertype').val(),
			proprity : $('.proprity').val()
		},
		success : function(result){
			alert(result);
		}
	});
});
</script>

</html>