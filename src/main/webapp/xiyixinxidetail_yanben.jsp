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
<title>ϴ����Ϣ</title>

<link href="qtimages/lib/bootstrap/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="qtimages/css/index.css">
</head>
<script language=javascript src='js/popup.js'></script>
<script language=javascript> 
function hsgpinglun(nbiao,nid){ 
popheight=450;
pop('hsgpinglun.jsp?biao='+nbiao+'&id='+nid,'��������',550,250) ;
}
</script>
<%
	String id=request.getParameter("id");
	
     %>
<body>
	<jsp:include page="qttop.jsp"></jsp:include>
	<jsp:include page="bht.jsp"></jsp:include>
	<section id="introduce">
		<div class="container">
			<div class="head text-center">
				<h3>ϴ����Ϣ</h3>
			</div>


			<table width="100%" border="0" align="center" cellpadding="3"
				cellspacing="1" bordercolor="#00FFFF"
				style="border-collapse: collapse" class="newsline">
				<tr>
					<td width='11%'>��ţ�</td>
					<td width='39%'>${xiyixinxi.bianhao}</td>
					<td width='11%'>ϴ�·�����</td>
					<td width='39%'>${xiyixinxi.xiyifangfa}</td>
				</tr>
				<tr>
					<td width='11%'>�·����ͣ�</td>
					<td width='39%'>${xiyixinxi.yifuleixing}</td>
					<td width='11%'>ע�����ݣ�</td>
					<td width='39%'>${xiyixinxi.zhuyineirong}</td>
				</tr>
				<tr>
					<td width='11%'>�۸�</td>
					<td width='39%'>${xiyixinxi.jiage}</td>
					<td width='11%'>��ע��</td>
					<td width='39%'>${xiyixinxi.beizhu}</td>
				</tr>
				<tr>
					<td colspan=4 align=center><input type=button name=Submit5
						value=���� onClick="javascript:history.back()" /> <input
						type=button name=Submit52 value=��ӡ
						onClick="javascript:window.print()" /> <!--jixaaxnnxiu--></td>
				</tr>

			</table>

		</div>
	</section>
	<jsp:include page="qtdown.jsp"></jsp:include>
	<jsp:include page="qtuserlog.jsp"></jsp:include>
	<script src="qtimages/lib/jquery/jquery.min.js"></script>
	<script src="qtimages/lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="qtimages/js/index.js"></script>

</body>
</html>

