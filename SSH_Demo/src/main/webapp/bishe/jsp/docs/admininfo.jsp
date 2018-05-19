<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="../../base/css/bootstrap.min.css" />
				<link rel="stylesheet" type="text/css" href="../../base/css/layoutit.css" />
		<link rel="stylesheet" type="text/css" href="../../base/css/bootstrap-combined.min.css" />
		
		<script type="text/javascript" src="../../base/js/jquery.min.js" ></script>
		<script type="text/javascript" src="../../base/js/jquery/jquerysession.js" ></script>
		<script type="text/javascript" src="../../base/js/bootstrap.min.js" ></script>
		
	</head>
	<style type="text/css">
		/*form{
			width: 100%;
   			height: 40px;
		}*/
		select{
			margin-left: 5px;	
			margin-bottom:0px;
		}
	</style>

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
									<legend>系统管理员——个人信息</legend>
									<label>ID</label>
									<input type="text" class="userid" disabled="false" value="adm01" />
									<span class="help-block"></span>
									<label>姓名</label>
									<input type="text" class="username" disabled="false" value="系统管理员1" />
									<span class="help-block"></span>
									<label>权限等级</label>
									<input type="text" disabled="false" class="priority" value="3" />
									<span class="help-block"></span>
								</fieldset>
							</form>

						</div>
						<div class="container-fluid">
							<div class="row-fluid">
								<div class="span12">
									<form style="width: 100%;height: 40px;">
										<dl style="float: left;">
											<dt style="line-height: 32px;">
						修改权限操作：
					</dt>
										</dl>
										<div class="btn-group" style="float: left;">
											<select class="usertype">
												<option>--用户类型--</option>
												<option>运动员</option>
												<option>赛事管理员</option>
											</select>
										</div>
										<fieldset style="float: left;">
											<input style="margin: 0;height: 30px;" class="input_adminID" type="text" />
											<div class="btn-group">
												<select class="setPriority">
													<option>--权限设置--</option>
													<option>1</option>
													<option>2</option>
													<option>3</option>
												</select>
												
											</div> <button class="btn btn-danger sureEdit" type="submit">确认修改</button>
										</fieldset>
									</form>
									<form style="width: 100%;height: 40px;">
										<dl style="float: left;">
											<dt style="line-height: 32px;">
						修改密码操作：
					</dt>
										</dl>
										<fieldset style="float: left;">
											<input style="margin: 0;height: 30px;" class="inputpassword" type="text" /> <button class="btn btn-danger editPasswordBtn" type="submit">确认修改</button>
										</fieldset>
									</form>
									<form style="width: 100%;height: 40px;">
										<dl style="float: left;">
											<dt style="line-height: 32px;">
						校运会状态控制：
					</dt>
										</dl>
										<fieldset style="float: left;">
											<button class="btn btn-primary startApplybtn" type="submit">校运会开始/办结</button>
										</fieldset>
									</form>
								</div>
							</div>
						</div>
	</body>

	<script>
		var admin;
		
		$(function() {
			var adminstr = '<%=session.getAttribute("admin")%>';
			admin = JSON.parse(adminstr);
			$('.userid').attr("value", admin.adminID);
			$('.username').attr('value', admin.adminName);
			$('.priority').attr('value', admin.priority);
		});

		$('.editPasswordBtn').click(function() {
			var paswd = $('.inputpassword').val();
			var adminid = admin.adminID;
			$.ajax({
				type: "post",
				url: "../../../aminisotrAction/editPasswordAction.json",
				async: true,
				data: {
					adminID: adminid,
					paswd: paswd
				}
			});
		});

		$('.startApplybtn').click(function() {
			$.ajax({
				type: "post",
				url: "../../../aminisotrAction/startOrCloseApplyAction.json",
				async: true,
				data: {
					role: JSON.toLocaleString("admin")
				}
			});
		});
		$('.sureEdit').click(function(){
			var adminid = $('.input_adminID').val();
			var usertype = $('.usertype option:checked').val();
			var pripority = $('.setPriority').val();
			$.ajax({
				type:"post",
				url:"../../../aminisotrAction/editPripority.json",
				async:true,
				data : {
					adminid :adminid,
					usertype :usertype,
					pripority : pripority
				}
			});
		});
		
		
	</script>
</html>