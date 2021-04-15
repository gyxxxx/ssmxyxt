﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db" />


<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"
	charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<TITLE>洗衣信息查询</TITLE>
<link rel="stylesheet" href="images/hsgcommon/common.css"
	type="text/css">
<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td>
				<table width="100%" border="0" align="center" cellpadding="4"
					cellspacing="1" bgcolor="#aec3de">
					<tr align="left" bgcolor="#F2FDFF">
						<td height="30" colspan="17" background="images/table_header.gif">洗衣信息列表</td>
					</tr>
				</table>
			</td>
		</tr>

		<tr valign="top">
			<td bgcolor="#FFFFFF">
				<table width="100%" border="1" align="center" cellpadding="4"
					cellspacing="1" bgcolor="#aec3de">

					<tr align="right" bgcolor="#ebf0f7">
						<td colspan="21">
							<table width="100%" border="0" align="center" cellpadding="4"
								cellspacing="1">
								<tr align="left">
									<td colspan="17">
										<form action="xiyixinxiList.do" name="myform" method="post">
											查询 编号：<input name="bianhao" type="text" id="bianhao"
												class="form-control2" /> 洗衣方法：<select name='xiyifangfa'
												id='xiyifangfa' class="form-control2"><option
													value="">所有</option>
												<option value="干洗">干洗</option>
												<option value="空气洗">空气洗</option>
												<option value="水洗">水洗</option></select> 衣服类型：<select
												name='yifuleixing' id='yifuleixing' class="form-control2"><option
													value="">所有</option>
												<option value="鞋子">鞋子</option>
												<option value="裤子">裤子</option>
												<option value="毛衣">毛衣</option>
												<option value="短羽绒服">短羽绒服</option>
												<option value="长羽绒服">长羽绒服</option>
												<option value="大衣">大衣</option></select> <input type="submit"
												value="查询" class="btn btn-info btn-small" />
										</form>
									</td>
								</tr>
							</table>
						</td>
					</tr>

					<tr align="center">
						<td style="padding-left: 0px; padding-right: 0px;"><table
								width="100%" border="1" align="center" cellpadding="4"
								cellspacing="1" bgcolor="#ebf0f7">
								<tr>
									<td align="center" bgcolor="#ebf0f7" width="30px" height="30">序号</td>
									<td align='center' bgcolor='#ebf0f7'>编号</td>
									<td align='center' bgcolor='#ebf0f7'>洗衣方法</td>
									<td align='center' bgcolor='#ebf0f7'>衣服类型</td>
									<td align='center' bgcolor='#ebf0f7'>注意内容</td>
									<td align='center' bgcolor='#ebf0f7'>价格</td>


									<td align="center" bgcolor="#ebf0f7" width="150px">添加时间</td>
									<td align="center" bgcolor="#ebf0f7" width="150px">操作</td>
								</tr>
								<%
					int i=0;
				%>
								<c:forEach items="${list }" var="u">
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


										<td align="center">${u.addtime }</td>
										<td align="center"><a class="btn btn-info btn-small"
											href="doUpdateXiyixinxi.do?id=${u.id }">编辑</a> <a
											class="btn btn-info btn-small"
											href="deleteXiyixinxi.do?id=${u.id }"
											onclick="{if(confirm('确定要删除吗?')){return true;}return false;}">删除</a>
											<a class="btn btn-info btn-small"
											href="xyxxDetail.do?id=${u.id}" target="_blank">详细</a></td>
									</tr>
								</c:forEach>
							</table></td>
					</tr>
				</table>


			</td>
		</tr>
	</table>



	<p align="center" class="fy">
		<c:if test="${sessionScope.p==1 }">
			<c:if test="${page.page>1}">
				<a href="xiyixinxiList.do?page=1">首页</a>
				<a href="xiyixinxiList.do?page=${page.page-1 }"> 上一页</a>
			</c:if>
			<c:if test="${page.page<page.totalPage}">
				<a href="xiyixinxiList.do?page=${page.page+1 }">下一页</a>
				<a href="xiyixinxiList.do?page=${page.totalPage }">末页</a>
			</c:if>
		</c:if>
	</p>





</body>
</html>
