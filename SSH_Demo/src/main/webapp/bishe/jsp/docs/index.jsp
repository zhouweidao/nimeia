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
													<input placeholder="对应的具体检索内容" class="input-medium search-query" type="text" /> <a class="submitbtn">查找</a>
												</div>
											</form>
										</div>

									</div>
								</div>
								<table class="table playertable" style="margin-bottom: 0px;">
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
		var playertype = "0";
		var playercontext = "0";
		var searchcontext;
		$('.playertype').change(function(event) {
			playertype = 0;
			$('.playercontext').empty();
			var type = $('.playertype option:checked').attr('class');
			if(type.indexOf("student") != -1) {
				playertype = "1";
				$('.playercontext').append("<option value='0'>-----请选择------</option><option value='2'>运动员编号</option><option value='3'>院校</option><option value='5'>专业</option><option value='6'>班级</option><option value='4'>项目名</option>");
			}

			if(type.indexOf("teacher") != -1) {
				playertype = "2";
				$('.playercontext').append("<option value='0'>-----请选择------</option><option value='2'>运动员编号</option><option value='3'>院校</option><option value='4'>项目名</option>");
			}
		})

		$('.playercontext').change(function() {
			playercontext = $('.playercontext option:checked').attr('value');
			alert(typeof(playercontext));
		});

		$('.submitbtn').click(function() {
			alert(1);
			var cells = [];
			searchcontext = $('.input-medium').val();
			if((playertype.indexOf("0")!=-1 && playercontext.indexOf("0")!=-1&& searchcontext == "")||(!playertype.indexOf("0")!=-1  && !playercontext.indexOf("0")!=-1  && searchcontext != "")) {
			$.ajax({
				type: "post",
				url: "../../../indexAction/listTopPlayer.json",
				async: true,
				data: {
					type: playertype,
					context: playercontext,
					searchCon: searchcontext,
					typeName : $('.playertype option:checked').text(),
					contextName : $('.playercontext option:checked').text()
				},
				success: function(players) {
					//下拉框输入框均为空>>>积分排行榜-1.1-《校内各院系总积分排行榜》----
					alert(players);
					$('.playertable thead tr').empty();
					$('.playertable tbody').empty();
					if(playertype.indexOf("0")!=-1 && playercontext.indexOf("0")!=-1&& searchcontext == "") {
						addCells(cells, '排名', '院系', '院系总积分');
						var str = "";
						for(var i = 0; i < cells.length; i++) {
							$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
						}
						for(var i = 0; i < players.length; i++) {
							str += "<tr class=''>"
							str += createtable(i, players[i].dept, players[i].score);
							str += "</tr>";
						}
					}//下拉框选了'学生'+'运动员编号'>>>积分排行榜-1.2-《学生-个人积分排名》-
					 else if(!playertype.indexOf("0")!=-1  && !playercontext.indexOf("0")!=-1  && searchcontext != "") {
						 alert("学生了");
						if(playertype == "1") {//下拉框选了1=='学生'//
							if(playercontext == "2") {//下拉框选了3=='运动员编号'//
								addCells(cells, '运动员ID', '运动员姓名', '性别', '年级', '班级', '专业', '院系', '个人积分', '班内排名', '业内排名', '院内排名', '校总排名');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class=''>"
									str += createtable(players[i].id, players[i].name, players[i].sex, players[i].grade,
										players[i].cls, players[i].marjor, players[i].dept, players[i].score, players[i].clsnum, players[i].marjornum, players[i].deptnum, players[i].schoolnum);
									str += "</tr>";
								}
							}//下拉框选了'学生'+'院校'>>>积分排行榜-1.3-《学生-院系内内积分排名前x名运动员-积分排行榜》-
							if(playercontext == "3") {//下拉框选了3=='院校'//
								addCells(cells, '排名', '运动员姓名', '性别', '班级', '个人总积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].cls, players[i].score);
									str += "</tr>";
								}
							}//下拉框选了'学生'+'项目名'.>>>积分排行榜-1.4-《学生-各项目的最高纪录榜》- 
							if(playercontext == "4") {//下拉框选了4=='项目名'//
								addCells(cells, '排名', '运动员姓名', '性别', '项目成绩');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].score);
									str += "</tr>";
								}
								addReaport(searchcontext);//单独显示：【 项目记录，纪录保持者】
							}//下拉框选了'学生'+'项目名'.>>>积分排行榜-1.5-《学生-专业内积分排名前x名运动员-积分排名榜》- 
							if(playercontext == "5") {//下拉框选了5=='专业'//
								addCells(cells, '排名', '运动员姓名', '性别', '班级', '个人积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].cls, players[i].score);
									str += "</tr>";
								}
							}//下拉框选了'学生'+'班级'.>>>积分排行榜-1.6-《班级内部排行榜》- 
							if(playercontext == "6") {//下拉框选了6=='班级'//
								addCells(cells, '排名', '运动员姓名', '性别', '个人积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].score);
									str += "</tr>";
								}
							}
							$('.playertable tbody').append(str);
						} else {//下拉框选了'教师'+'运动员编号'>>>积分排行榜-2.1-《教师-个人积分排名》-
							if(playercontext == "2") {//下拉框选了6=='运动员编号'//
								addCells(cells, '排名', '运动员ID', '运动员姓名', '性别', '院系', '个人积分', '院内排名', '校总排名');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].id, players[i].name, players[i].sex, players[i].dept, players[i].score,
										players[i].deptnum, players[i].schoolnum);
									str += "</tr>";
								}

							}//下拉框选了'教师'+'院校'>>>积分排行榜-2.2-《教师-校内各院系积分排行榜》-
							if(playercontext == "3") {//下拉框选了3=='院系'//
								addCells(cells, '排名', '运动员姓名', '性别', '个人积分');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].score);
									str += "</tr>";
								}
							}//下拉框选了'教师'+'院校'>>>积分排行榜-2.3-《教师-各项目的最高纪录榜》-
							if(playercontext == "4") {//下拉框选了4=='项目名'//
								addCells(cells, '排名', '运动员姓名', '性别', '项目成绩');
								var str = "";
								for(var i = 0; i < cells.length; i++) {
									$('.playertable thead tr').append("<th>" + cells[i] + "</th>");
								}
								for(var i = 0; i < players.length; i++) {
									str += "<tr class='info'>"
									str += createtable(i, players[i].name, players[i].sex, players[i].record);
									str += "</tr>";
								}
								addReaport(searchcontext);//单独显示：【 项目记录，纪录保持者】
							}
						}
					} 
				}
			});
			}else {
				//提示没有填完
				alert("还有没选择的项");
			}
		});

		//将所有表格中的参数添加到数组中
		function addCells() {
			for(var i = 1; i < arguments.length; i++) {
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