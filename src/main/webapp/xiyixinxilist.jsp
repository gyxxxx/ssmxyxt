<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db" />

<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"
	charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=0">
<title>洗衣信息</title>

<link href="qtimages/lib/bootstrap/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="qtimages/css/index.css">
</head>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"
	charset="gb2312"></script>

<%

%>

<body>
	<jsp:include page="qttop.jsp"></jsp:include>
	<jsp:include page="bht.jsp"></jsp:include>
	<section id="introduce">
		<div class="container">
			<div class="head text-center">
				<h3>洗衣信息</h3>
			</div>

			<link rel="stylesheet" href="images/hsgcommon/divqt.css"
				type="text/css">
			<form action="xyxxList.do" name="myform" method="post"
				style="width: 100%">
				查询 编号：<input name="bianhao" type="text" id="bianhao"
					class="form-control2" /> 洗衣方法：<select name='xiyifangfa'
					id='xiyifangfa' class="form-control2"><option value="">所有</option>
					<option value="干洗">干洗</option>
					<option value="空气洗">空气洗</option>
					<option value="水洗">水洗</option></select> 衣服类型：<select name='yifuleixing'
					id='yifuleixing' class="form-control2"><option value="">所有</option>
					<option value="鞋子">鞋子</option>
					<option value="裤子">裤子</option>
					<option value="毛衣">毛衣</option>
					<option value="短羽绒服">短羽绒服</option>
					<option value="长羽绒服">长羽绒服</option>
					<option value="大衣">大衣</option></select> <input type="submit" value="查询" />
			</form>


			<br />
			<table width="100%" border="0" align="center" cellpadding="4"
				cellspacing="1" bgcolor="#ebf0f7">
				<tr>
					<td align="center" bgcolor="#ebf0f7" width="30px">序号</td>
					<td bgcolor='#ebf0f7'>编号</td>
					<td bgcolor='#ebf0f7'>洗衣方法</td>
					<td bgcolor='#ebf0f7'>衣服类型</td>
					<td bgcolor='#ebf0f7'>注意内容</td>
					<td bgcolor='#ebf0f7'>价格</td>


					<td align="center" bgcolor="#ebf0f7" width="150px">添加时间</td>
					<td align="center" bgcolor="#ebf0f7" width="50px">操作</td>
				</tr>
				<%
					int i=0;
				%>
				<c:forEach items="${list}" var="u">
					<%
					i++;
				%>
					<tr align="center" bgcolor="#FFFFFF">
						<td align="center"><%=i%></td>
						<td>${u.bianhao}</td>
						<td>${u.xiyifangfa}</td>
						<td>${u.yifuleixing}</td>
						<td>${u.zhuyineirong}</td>
						<td>${u.jiage}</td>


						<td align="center">${u.addtime}</td>
						<td align="center"><a href="xyxxDetail.do?id=${u.id}">详细</a></td>
					</tr>
				</c:forEach>
			</table>
			<br>

			<p align="center">
				<c:if test="${sessionScope.p==1 }">
					<c:if test="${page.page>1}">
						<a href="xyxxList.do?page=1">首页</a>
						<a href="xyxxList.do?page=${page.page-1 }"> 上一页</a>
					</c:if>
					<c:if test="${page.page<page.totalPage}">
						<a href="xyxxList.do?page=${page.page+1 }">下一页</a>
						<a href="xyxxList.do?page=${page.totalPage }">末页</a>
					</c:if>
				</c:if>
			</p>





		</div>
	</section>
	<jsp:include page="qtdown.jsp"></jsp:include>
	<jsp:include page="qtuserlog.jsp"></jsp:include>
	<script src="qtimages/lib/jquery/jquery.min.js"></script>
	<script src="qtimages/lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="qtimages/js/index.js"></script>

</body>
</html>
