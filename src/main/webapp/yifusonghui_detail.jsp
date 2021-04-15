<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db" />
<html>
<head>
<title>衣服送回详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css"
	type="text/css">
<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">

</head>

<body>

	衣服送回详细:
	<br>
	<br>

	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="#CBD8AC"
		style="border-collapse: collapse">
		<tr>
			<td width='11%'>编号：</td>
			<td width='39%'>${yifusonghui.bianhao}</td>
			<td width='11%'>洗衣方法：</td>
			<td width='39%'>${yifusonghui.xiyifangfa}</td>
		</tr>
		<tr>
			<td width='11%'>衣服类型：</td>
			<td width='39%'>${yifusonghui.yifuleixing}</td>
			<td width='11%'>价格：</td>
			<td width='39%'>${yifusonghui.jiage}</td>
		</tr>
		<tr>
			<td width='11%'>货柜编号：</td>
			<td width='39%'>${yifusonghui.huoguibianhao}</td>
			<td width='11%'>下单人：</td>
			<td width='39%'>${yifusonghui.xiadanren}</td>
		</tr>
		<tr>
			<td colspan=4 align=center><input type=button name=Submit5
				value=返回 onClick="javascript:history.back()" />&nbsp;<input
				type=button name=Submit5 value=打印
				onClick="javascript:window.print()" /></td>
		</tr>

	</table>

</body>
</html>

