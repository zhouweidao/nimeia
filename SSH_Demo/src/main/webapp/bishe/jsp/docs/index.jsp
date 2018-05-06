<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="../../base/css/bootstrap.min.css" />
<link rel="stylesheet" href="../../base/css/loginmon.css" />
<link rel="stylesheet" type="text/css"
	href="../../base/css/layoutit.css" />
<link rel="stylesheet" type="text/css"
	href="../../base/css/bootstrap-combined.min.css" />
<link rel="stylesheet" type="text/css"
	href="../../base/css/plugins/jquerytreegrid/style.css" />
<script type="text/javascript" src="../../base/js/jquery.min.js"></script>
<script src="../../base/js/bootstrap.min.js" type="text/javascript"
	charset="utf-8"></script>

<style type="text/css">
h1 {
	margin-left: 500px;
}
</style>

<script>
	
</script>
</head>
	<body>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="row-fluid">
						<div class="span12">
							<h1>西南科技大学赛事系统</h1>
							<div style="width: 100%; height: 30px;">
								<!--<a id="Login_start_" class="btn btn-danger" style="width:100px;height:40px;border-radius: 0;">登录</a>
<a id="Regist_start_" class="btn btn-success" style="width:100px;height:40px;border-radius: 0;">注册</a>-->
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span12">
					<div class="row-fluid">
						<div class="span2 rightbow"></div>
						<div class="span8">
							<div class="row-fluid">
								<div class="span12">
									<div class="row-fluid">
										<div class="span12">
											<h3 class="text-left" style="float: left;">排行榜</h3>
											<form class="form-search">
												<select class="playertype" style="float: left; margin-top: 15px; margin-left: 30px;">
													<option>-----请选择------</option>
													<option class="student" value="1" id="student">学生</option>
													<option class="teacher" value="2" id="teacher">教师</option>
												</select>
												<select class="playercontext" style="float: left; margin-top: 15px; margin-left: 20px;">
													<option>-----请选择------</option>
												</select>
												<div style="float: left; margin-top: 15px; margin-left: 20px;">
													<input class="input-medium search-query" type="text" value="" />
													<button type="submit" class="btn-warning submitbtn">查找</button>
												</div>
											</form>
										</div>

									</div>
								</div>
								<table class="table playertable">
									<thead>
										<tr>
											<th>编号</th>
											<th>产品</th>
											<th>交付时间</th>
											<th>状态</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Default</td>
										</tr>
										<tr class="success">
											<td>1</td>
											<td>TB - Monthly</td>
											<td>01/04/2012</td>
											<td>Approved</td>
										</tr>
										<tr class="error">
											<td>2</td>
											<td>TB - Monthly</td>
											<td>02/04/2012</td>
											<td>Declined</td>
										</tr>
										<tr class="warning">
											<td>3</td>
											<td>TB - Monthly</td>
											<td>03/04/2012</td>
											<td>Pending</td>
										</tr>
										<tr class="info">
											<td>4</td>
											<td>TB - Monthly</td>
											<td>04/04/2012</td>
											<td>Call in to confirm</td>
										</tr>
									</tbody>
								</table>
								<div class="pagination pagination-centered">
									<ul>
										<li>
											<a href="#">上一页</a>
										</li>
										<li>
											<a href="#">1</a>
										</li>
										<li>
											<a href="#">2</a>
										</li>
										<li>
											<a href="#">3</a>
										</li>
										<li>
											<a href="#">4</a>
										</li>
										<li>
											<a href="#">5</a>
										</li>
										<li>
											<a href="#">下一页</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span12"></div>
						</div>
					</div>

				</div>
			</div>
		</div>
		</div>

	</body>
	<script>
		var playertype;
		var playercontext;
		var searchcontext;
		$('.playertype').change(function(event) {
			playertype = 0;
			$('.playercontext').empty();
			var type = $('.playertype option:checked').attr('class');
			if(type.indexOf("student") != -1) {
				playertype = 1;
				$('.playercontext').append("<option value='0'>-----请选择------</option><option value='2'>运动员编号</option><option value='3'>院校</option><option value='5'>专业</option><option value='6'>班级</option><option value='4'>项目名</option>");
			}

			if(type.indexOf("teacher") != -1) {
				playertype = 2;
				$('.playercontext').append("<option value='0'>-----请选择------</option><option value='2'>运动员编号</option><option value='3'>院校</option><option value='4'>项目名</option>");
			}
		})

		$('.playercontext').change(function() {
			playercontext = $('.playercontext option:checked').attr('value');
			alert(typeof(playercontext));
		});

		$('.submitbtn').click(function() {
			var cells = [];
			cells.clear();
			searchcontext = $('.input-medium').val();
			$.ajax({
				type: "post",
				url: "",
				async: true,
				data: {
					type: playertype,
					context: playercontext,
					searchCon: searchcontext
				},
				success: function(players) {

					if(playertype.equal("0") && playercontext.equal("0") && searchcontext == "") {
						addCells(cells, '排名', '院系名', '院系总积分');
						var str = "";
						for(var i = 0; i < cells.length; i++) {
							$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
						}
						for(var i = 0; i < players.length; i++) {
							str += "<tr class=''>"
							str += createtable(i, players[i].dept, players[i].score);
							str += "</tr>";
						}
					} else if(!playertype.equal("0") && !playercontext.equal("0") && searchcontext != "") {
						if(playertype.equal("1")) {
							if(playercontext.equal("2")) {
								addCells(cells, '运动员ID', '运动员姓名', '性别', '年级', '班级名', '专业名', '院系名', '个人积分', '班内排名', '业内排名', '院内排名', '校总排名');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(players[i].id, players[i].name, players[i].sex, players[i].grade,
										players[i].cls, players[i].marjor, players[i].dept, players[i].score, clsnum, marjornum, deptnum, schoolnum);
									str += "</tr>";
								}
							}
							if(playercontext.equal("3")) {
								addCells(cells, '排名', '专业名', '专业总积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].marjor, players[i].score);
									str += "</tr>";
								}
							}
							if(playercontext.equal("4")) {
								addCells(cells, '排名', '运动员姓名', '项目成绩');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].name, players[i].score);
									str += "</tr>";
								}
								addReaport(searchcontext);
							}
							if(playercontext.equal("5")) {
								addCells(cells, '排名', '班级名', '班级总积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].name, players[i].score);
									str += "</tr>";
								}
							}
							if(playercontext.equal("6")) {
								addCells(cells, '排名', '运动员姓名', '班级名', '个人积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].name, players[i].cls, players[i].score);
									str += "</tr>";
								}
							}
						} else {
							if(playercontext.equal("2")) {
								addCells(cells, '运动员ID', '运动员姓名', '性别', '院系名', '个人积分', '院内排名', '校总排名');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(players[i].id, players[i].name, players[i].sex, players[i].dept, players[i].score,
										players[i].deptnum, players[i].schoolnum);
									str += "</tr>";
								}

							}
							if(playercontext.equal("3")) {
								addCells(cells, '排名', '运动员ID', '运动员姓名', '性别', '个人积分', '院系名');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].id, players[i].name, players[i].sex, players[i].score, players[i].dept);
									str += "</tr>";
								}
							}
							if(playercontext.equal("4")) {
								addCells(cells, '排名', '运动员姓名', '项目成绩');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(i, players[i].name, players[i].score);
									str += "</tr>";
								}
								
								addReaport(searchcontext);

							}
						}
					} else {
						//提示没有填完
					}
				}
			});

		});

		//将所有表格中的参数添加到数组中
		function addCells() {
			for(var i = 1; i < arguments.length - 1; i++) {
				arguments[0].push(arguments[i]);
			}
		}

		function addReaport(item) {
			$.ajax({
				type: "post",
				url: "",
				async: true,
				data: {
					itemname : item
				},
				success: function(result) {
					$('.pagination').append("该项目最高纪录为:"+result.record+" 由"+result.recordHolder+"保持");
				}
			});
		}

		//动态添加表格,table
		function createtable() {
			var str = "";
			for(var i = 0; i < arguments.length; i++) {
				str += "<td>" + arguments[i] + "</td>";
			}
			return str;
		}
	</script>
</html>