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
				margin-left: 322px;
			}
			.row-fluid .span8{
				width: 100%;
			}
			.btn-group {
			    margin: -12px -15px 5px -5px;
			}
			.btn-group > .btn + .dropdown-toggle .caret {
			    margin-top: 8px;
			}
			.row-fluid [class*="span"]{
				margin-left: 0px;
			}
			[class*="span"]{
				margin-left: 0px;
			}
		</style>

		<script>
		
		</script>
	</head>

	<body style="padding: 0;margin-left: 0;background-color: #FFF;">
			<div class="row-fluid">
				<div class="span12">
					<div class="row-fluid">
						<div class="span8">
							<div class="row-fluid">
								<div class="span12" style="margin-top: 13px;">
									<div class="row-fluid">
										<div class="span12">
											<h3 class="text-left" style="float: left;margin-left: 100px;">排行榜</h3>
											<form class="form-search" style="margin: 0;">
												<div class="btn-group">
													<select class="playertype" style="float: left; margin-top: 15px; margin-left: 30px;">
													<option>-----请选择------</option>
													<option class="student" value="1" id="student">学生</option>
													<option class="teacher" value="2" id="teacher">教师</option>
												</select>
												
												</div>
												<div class="btn-group" style="margin-left: 40px;">
													<select class="playercontext" style="float: left; margin-top: 15px; margin-left: 20px;">
													<option>-----请选择------</option>
												</select>
												</div>
												<!--<select style="float: left;margin-top: 15px; margin-left: 30px;">
													<option>运动员类型</option>
													<option>长跑</option>
													<option>短跑</option>
												</select>
												<select style="float: left;margin-top: 15px; margin-left: 20px;">
													<option>运动员类型</option>
												</select>-->
												<div style="position: absolute;right: 100px;top: 16px;">
													<input placeholder="对应的具体检索内容" class="input-medium search-query" type="text" /> <button type="submit" class="btn-warning">查找</button>
												</div>
											</form>
										</div>

									</div>
								</div>
								<table class="table" style="margin-bottom: 0px;">
									<thead>
										<tr style="background-color: #f0ad4e;">
											<th>
												排名
											</th>
											<th>
												学院名
											</th>
											<th>
												学院积分
											</th>
											<!--<th>
												状态
											</th>-->
										</tr>
									</thead>
									<tbody>
										<tr class="success">
											<td>
												1
											</td>
											<td>
												计算机科学与技术学院
											</td>
											<td>
												160
											</td>
										</tr>
										<tr class="error">
											<td>
												2
											</td>
											<td>
												制造科学与工程学院
											</td>
											<td>
												143
											</td>
										</tr>
										<tr class="warning">
											<td>
												3
											</td>
											<td>
												材料科学与工程学院

											</td>
											<td>
												132
											</td>
										</tr>
										<tr class="info">
											<td>
												4
											</td>
											<td>
												生命科学于工程学院

											</td>
											<td>
												120
											</td>
										</tr>
										<tr class="info">
											<td>
												5
											</td>
											<td>
												土木工程与建筑学院

											</td>
											<td>
												112
											</td>
										</tr>
										<tr class="info">
											<td>
												6
											</td>
											<td>
												文学与艺术学院

											</td>
											<td>
												108
											</td>
										</tr>
										<tr class="info">
											<td>
												7
											</td>
											<td>
												环境与资源学院

											</td>
											<td>
												102
											</td>
										</tr>
										<tr class="info">
											<td>
												8
											</td>
											<td>
												国防科技学院

											</td>
											<td>
												94
											</td>
										</tr>
										<tr class="info">
											<td>
												9
											</td>
											<td>
												经济管理学院

											</td>
											<td>
												90
											</td>
										</tr>
										<tr class="info">
											<td>
												10
											</td>
											<td>
												信息工程学院
											</td>
											<td>
												88
											</td>
										</tr>
										<tr class="info">
											<td>
												11
											</td>
											<td>
												外国语学院

											</td>
											<td>
												86
											</td>
										</tr>
										<tr class="info">
											<td>
												12
											</td>
											<td>
												政治学院

											</td>
											<td>
												78
											</td>
										</tr>
										<tr class="info">
											<td>
												13
											</td>
											<td>
												体育学院

											</td>
											<td>
												76
											</td>
										</tr>
										<tr class="info">
											<td>
												14
											</td>
											<td>
												理学院
											</td>
											<td>
												74
											</td>
										</tr>
										<tr class="info">
											<td>
												15
											</td>
											<td>
												法学院

											</td>
											<td>
												58
											</td>
										</tr>
									</tbody>
								</table>
								
							</div>
						</div>
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
				url: "indexAction/listTopPlayer.json",
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