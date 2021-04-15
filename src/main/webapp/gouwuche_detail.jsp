<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db" />
<html>
<head>
<title>购物车详细</title>
<link rel="stylesheet" href="images/hsgcommon/common.css"
	type="text/css">
<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">

</head>

<body>

	购物车详细:
	<br>
	<br>

	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="#CBD8AC"
		style="border-collapse: collapse">
		<tr>
			<td width='11%'>编号：</td>
			<td width='39%'>${gouwuche.bianhao}</td>
			<td width='11%'>洗衣方法：</td>
			<td width='39%'>${gouwuche.xiyifangfa}</td>
		</tr>
		<tr>
			<td width='11%'>衣服类型：</td>
			<td width='39%'>${gouwuche.yifuleixing}</td>
			<td width='11%'>注意内容：</td>
			<td width='39%'>${gouwuche.zhuyineirong}</td>
		</tr>
		<tr>
			<td width='11%'>价格：</td>
			<td width='39%'>${gouwuche.jiage}</td>
			<td width='11%'>下单人：</td>
			<td width='39%'>${gouwuche.xiadanren}</td>
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

