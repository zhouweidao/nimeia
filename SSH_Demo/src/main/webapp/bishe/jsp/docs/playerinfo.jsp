<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
				<link rel="stylesheet" type="text/css" href="../../base/css/layoutit.css" />
		<link rel="stylesheet" type="text/css" href="../../base/css/bootstrap-combined.min.css" />
		
		<script type="text/javascript" src="../../base/js/jquery.min.js" ></script>
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
							 <legend>个人信息</legend> 
							 <label>姓名</label>
							 <input type="text" disabled="false" value=""/> 
							 <span class="help-block"></span> 
							 <label>性别</label>
							 <input type="text" disabled="false" value=""/> 
							 <span class="help-block"></span>
							 <label>学院</label>
							 <input type="text" disabled="false" value=""/> 
							 <span class="help-block"></span> 
							 <button class="editbtn btn btn-info buttom-left" type="submit"><i class="fa fa-wrench"></i>修改个人信息</button>
							 <button class="savebtn btn btn-success pull-right" type="submit"><i class="fa fa-save"></i>保&nbsp;存</button>
							 <button class="applybtn btn btn-warning dropdown-toggle" type="submit"><i class="fa fa-plus"></i> 报名</button>
						</fieldset>
					</form>
					<table class="table">
						<thead>
							<tr>
								<th>
									项目编号
								</th>
								<th>
									项目名称
								</th>
								<th>
									参赛时间
								</th>
								<th>
									状态
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							<tr class="info">
								
							</tr>
							<tr class="info">
								
							</tr>
						</tbody>
					</table>
				</div>
				<div class="span4">
				</div>
			</div>
		</div>
	</div>
</div>
	</body>
	
	<script>
		
		$(function(){
			$('.savebtn').hide();
		});
		$('.editbtn').click(function(){
				$('.savebtn').show();
			});
		
		
	</script>
</html>