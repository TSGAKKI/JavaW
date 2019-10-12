<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户管理-BootCRM</title>
<!-- 引入css样式文件 -->
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" type="text/css" />
</head>
<body>
<a><%=basePath%></a>
	<div style="height: 100%">
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<a class="navbar-brand" href="customer/list.action">BOOT客户管理系统
					v2.0</a>
			</div>
			<ul class="nav navbar-top-links navbar-right">
				<!-- 邮件通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-envelope"></i>
						<i class="fa fa-caret-down"></i>
				</a> <!-- 邮件通知内部 -->
					<ul class="dropdown-menu dropdown-messages">
						<li><a href="#">
								<div>
									<strong>张经理</strong> <span class="pull-right text-muted">
										<em>昨天</em>
									</span>
								</div>
								<div>今天晚上开会，讨论一下下个月工作的事...</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看全部消息</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 邮件通知 end -->
				<!-- 任务通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a> <!-- 任务 通知内部 -->
					<ul class="dropdown-menu dropdown-tasks">
						<li><a href="#">
								<div>
									<p>
										<strong>任务 1</strong> <span class="pull-right text-muted">完成40%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">完成40%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>任务 2</strong> <span class="pull-right text-muted">完成20%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
											style="width: 20%">
											<span class="sr-only">完成20%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看所有任务</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 用户信息和系统设置 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i>
								用户： ${user.usercode}</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
						<li class="divider"></li>
						<li><a
							href="user/logout"> <i
								class="fa fa-sign-out fa-fw"></i>退出登录
						</a></li>
					</ul></li>
				<!-- 用户信息和系统设置结束 -->
			</ul>
			<!-- 左侧显示列表部分 start-->
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="查询内容...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
									</button>
								</span>
							</div>
						</li>
						<li><a
							href="${pageContext.request.contextPath }/customer/list.action"
							class="active"> <i class="fa fa-edit fa-fw"></i> 客户管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								客户拜访
						</a></li>
					</ul>
				</div>
			</div>
		</nav>

		<!-- 客户列表查询部分  start-->
		<div
			style="margin-left: 250px; padding-left: 30px; background-color: white; height: 100%;">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">客户管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" method="get"
						action="${pageContext.request.contextPath }/customer/list.action">
						<div class="form-group">
							<label for="customerName">客户名称</label> <input type="text"
								class="form-control" id="customerName" value="${custName }"
								name="custName" />
						</div>
						<div class="form-group">
							<label for="customerFrom">客户来源</label> <select
								class="form-control" id="customerFrom" name="custSource">
								<option value="">--请选择--</option>
								<c:forEach items="${fromType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custSource}">selected</c:if>>
										${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custIndustry">所属行业</label> <select
								class="form-control" id="custIndustry" name="custIndustry">
								<option value="">--请选择--</option>
								<c:forEach items="${industryType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custIndustry}"> selected</c:if>>
										${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custLevel">客户级别</label> <select class="form-control"
								id="custLevel" name="custLevel">
								<option value="">--请选择--</option>
								<c:forEach items="${levelType}" var="item">
									<option value="${item.dict_id}"
										<c:if test="${item.dict_id == custLevel}"> selected</c:if>>
										${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
			</div>
			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#newCustomerDialog" onclick="clearCustomer()">新建</a>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">客户信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>编号</th>
									<th>客户名称</th>
									<th>客户来源</th>
									<th>客户所属行业</th>
									<th>客户级别</th>
									<th>固定电话</th>
									<th>手机</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${customers}" var="row">
									<tr>
										<td>${row.cusid}</td>
										<td>${row.cusname}</td>
										<td>${row.cussource}</td>
										<td>${row.cusindustry}</td>
										<td>${row.cuslevel}</td>
										<td>${row.cusphone}</td>
										<td>${row.cusmoblie}</td>
										<td><a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#customerEditDialog"
											onclick="editCustomer(${row.cusid})">修改</a> <a href="#"
											class="btn btn-danger btn-xs"
											onclick="deleteCustomer(${row.cusid})">删除</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page
								url="${pageContext.request.contextPath }/customer/list.action" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
	</div>
	<!-- 引入js文件 -->
	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
</body>
</html>