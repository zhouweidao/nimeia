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
									<input type="text" class="userid" disabled="false" value="mng01" />
									<span class="help-block"></span>
									<label>姓名</label>
									<input type="text" class="username" disabled="false" value="赛事管理员1" />
									<span class="help-block"></span>
									<label>权限等级</label>
									<input type="text" disabled="false" class="priority" value="2" />
									<span class="help-block"></span>
								</fieldset>
							</form>

						</div>
						<div class="container-fluid">
							<div class="row-fluid">
								<div class="span12">
										<dl style="float: left;">
											<dt style="line-height: 32px;">
						录入成绩操作：
					</dt>
										</dl>
										<div class="btn-group">
											<select class="itemkinds">
												<option>--类别--</option>
												<option>男子</option>
												<option>女子</option>
											</select>
										</div>
										<div class="btn-group">
											<select class="itemtype">
												<option>--项目类型--</option>
												<option>个人</option>
												<option>团体</option>
											</select>
										</div>
										<div class="btn-group">
											<select class="itemname">
												<option>--项目名--</option>
											</select>
										</div>
										<div class="btn-group">
											<select class="playername">
												<option>--运动员姓名--</option>
											</select>
										</div>
										<div class="btn-group paiming">
											<select>
												<option>--名次--</option>
												<option value="1">第1名</option>
												<option value="2">第2名</option>
												<option value="3">第3名</option>
												<option value="4">第4名</option>
												<option value="5">第5名</option>
												<option value="6">第6名</option>
												<option value="7">第7名</option>
												<option value="8">第8名</option>
											</select>

										</div>
										<input class="report" placeholder="请输入比赛成绩" type="text">
											<button class="btn btn-success sureInsert">确认录入</button> <button class="btn btn-warning repealInsert">撤销录入</button>
									<form class="form-inline">
										<dl>
											<dt style="float: left;line-height: 32px;">
						修改密码操作：
					</dt>
										</dl>
										<fieldset>
											<input class="inputpassword" type="text" /> <button class="btn btn-danger editPasswordBtn">确认修改</button>
										</fieldset>
									</form>
									<form>
										<dl>
											<dt style="float: left;line-height: 32px;">
						报名控制操作：
					</dt>
										</dl>
											<button  class="btn btn-primary startApplybtn">开启/关闭报名</button>
									</form>
								</div>
							</div>
						</div>
					</div>
	</body>

	<script>
		var manager;
		var playerEntryForms = [];
		var playerEntryForm;
		$(function() {
			var managerstr = '<%=session.getAttribute("manager")%>';
			manager = JSON.parse(managerstr);
			$('.userid').attr("value", manager.adminID);
			$('.username').attr('value', manager.adminName);
			$('.priority').attr('value', manager.priority);
			//判断系统管理员是否开启了报名功能
			$.ajax({
				type: "post",
				url: "../../../aminisotrAction/isRunningAction.json",
				async: true,
				success: function(result) {
					if(result.indexOf('error')!=-1) {
						$('.startApplybtn').attr('disabled', 'disabled');
					} else {
						$('.startApplybtn').removeAttr('disabled');
					}
				}
			});
		});
		
		$('.editPasswordBtn').click(function(){
			var paswd = $('.inputpassword').val();
			var adminid = manager.adminID;
			$.ajax({
				type:"post",
				url:"../../../aminisotrAction/editPasswordAction.json",
				async:true,
				data:{
					adminID : adminid,
					paswd : paswd
				}
			});
		});
	

		$('.itemtype').change(function() {
			var itemtype = $('.itemtype option:checked').val();
			var sex = $('.itemkinds option:checked').val();
			$.ajax({
				type: "post",
				url: "../../../aminisotrAction/listAllItemName.json",
				async: true,
				data: {
					itemType: itemtype,
					itemsex: sex
				},
				success: function(items) {
					for(var i = 0; i < items.length; i++) {
						$('.itemname').append("<option id='" + items[i][0] + "'>" + items[i][1] + "</option>");
					}
				}
			});
		});

		$('.itemname').change(function() {
			playerEntryForms.length = 0;
			var itemid = $('.itemname option:checked').attr('id');
			$.ajax({
				type: "post",
				url: "../../../aminisotrAction/listAllPlayerName.json",
				async: true,
				data: {
					itemid: itemid
				},
				success: function(players) {
					for(var i = 0; i < players.length; i++) {
						$('.playername').append("<option id='" + players[i].playerID + "'>" + players[i].playerName+"-"+ players[i].playerID+"</option>");
						playerEntryForms.push(players[i]);
					}
				}
			});
		});
		
		$('.playername').change(function(event){
			var playerid = $('.playername option:checked').attr('id');
			var itemid = $('.itemname option:checked').attr('id');
			for(var i = 0; i < playerEntryForms.length; i++){
				if(playerEntryForms[i].itemID.indexOf(itemid)!=-1 && playerEntryForms[i].playerID.indexOf(playerid)!=-1){
					playerEntryForm = playerEntryForms[i];
					$('.report').val(playerEntryForm.report);
					break;
				}
			}
		});
		//录入成绩,playerid和itemid确定playerentryform里的运动员，paiming和score是要录入的成绩
		//用itemID和itemname，itemtype，得到itemscore表中的itemscore，最后将score插入playerentryfrom表中
		$('.sureInsert').click(function(){
			var playerid = $('.playername option:checked').attr("id");
			var itemid = $('.itemname option:checked').attr('id');
			var paiming = $('.paiming option:checked').attr('value');
			var score = $('.report').val();
			var itemname = $('.itemname option:checked').val();
			var itemtype = $('.itemtype').val();
			$.ajax({
				type:"post",
				url:"../../../aminisotrAction/savePlayerScore.json",
				async:true,
				data :{
					playerid : playerid,
					itemid : itemid,
					paiming : paiming,
					score : score,
					itemname :itemname,
					itemtype : itemtype
				},
				success : function(){
					
				}
			});
		
		});
		
		$('.repealInsert').click(function(){
			var playerid = $('.playername option:checked').attr("id");
			var itemid = $('.itemname option:checked').attr('id');
			$.ajax({
				type:"post",
				url:"../../../aminisotrAction/repealSavePlayerScore.json",
				async:true,
				data : {
					playerid : playerid,
					itemid : itemid
				},
			});
		});
		
		$('.startApplybtn').click(function(){
			$.ajax({
				type:"post",
				url:"../../../aminisotrAction/startOrCloseApplyAction.json",
				async:true,
				data : {
					role : JSON.toLocaleString("manager")
				},
				success : function(result){
					if(result.indexOf("success")!=-1){
						alert("报名成功开启！");
					}else{
						alert("报名成功关闭！");
					}
				}
			});
		});
		
	</script>

</html>
