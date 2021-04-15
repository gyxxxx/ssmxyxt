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
<title>购物车</title>

<link href="qtimages/lib/bootstrap/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="qtimages/css/index.css">
</head>
<%
if(request.getSession().getAttribute("username")==null)
{
	out.print("<script>alert('对不起,请您先登陆!');location.href='index.do';</script>");
	return;
}
  String id="";


 



   %>



<script language="javascript">
function checkform()
{
	
}
function gow()
{
	document.location.href="gouwucheadd.jsp?id=<%=id%>";
}
</script>


<body>
	<jsp:include page="qttop.jsp"></jsp:include>
	<jsp:include page="bht.jsp"></jsp:include>
	<section id="introduce">
		<div class="container">
			<div class="head text-center">
				<h3>购物车</h3>
			</div>

			<link rel="stylesheet" href="images/hsgcommon/divqt.css"
				type="text/css">
			<link rel="stylesheet" href="images/hsgcommon/commonqt.css"
				type="text/css">
			<script src="images/hsgcommon/common.js"></script>
			<script src="images/hsgcommon/bootbox.js"></script>
			<% 





%>



			<table width="100%" border="1" align="center" cellpadding="3"
				cellspacing="1" bordercolor="#CCCCCC"
				style="border-collapse: collapse" class="newsline">
				<form action="addGouwuche.do" name="form1" method="post">
					<tr>
						<td width="200">编号：</td>
						<td><input name='bianhao' type='text' id='bianhao' value=''
							onblur='' class="form-control" readonly='readonly' /></td>
					</tr>
					<script language="javascript">document.form1.bianhao.value='<%=connDbBean.readzd("xiyixinxi","bianhao","id",request.getParameter("id"))%>';document.form1.bianhao.setAttribute("readOnly",'true');</script>
					<tr>
						<td width="200">洗衣方法：</td>
						<td><input name='xiyifangfa' type='text' id='xiyifangfa'
							value='' onblur='' class="form-control" readonly='readonly' /></td>
					</tr>
					<script language="javascript">document.form1.xiyifangfa.value='<%=connDbBean.readzd("xiyixinxi","xiyifangfa","id",request.getParameter("id"))%>';document.form1.xiyifangfa.setAttribute("readOnly",'true');</script>
					<tr>
						<td width="200">衣服类型：</td>
						<td><input name='yifuleixing' type='text' id='yifuleixing'
							value='' onblur='' class="form-control" readonly='readonly' /></td>
					</tr>
					<script language="javascript">document.form1.yifuleixing.value='<%=connDbBean.readzd("xiyixinxi","yifuleixing","id",request.getParameter("id"))%>';document.form1.yifuleixing.setAttribute("readOnly",'true');</script>
					<tr>
						<td width="200">注意内容：</td>
						<td><input name='zhuyineirong' type='text' id='zhuyineirong'
							value='' onblur='' class="form-control" readonly='readonly' /></td>
					</tr>
					<script language="javascript">document.form1.zhuyineirong.value='<%=connDbBean.readzd("xiyixinxi","zhuyineirong","id",request.getParameter("id"))%>';document.form1.zhuyineirong.setAttribute("readOnly",'true');</script>
					<tr>
						<td width="200">价格：</td>
						<td><input name='jiage' type='text' id='jiage' value=''
							onblur='' class="form-control" readonly='readonly' /></td>
					</tr>
					<script language="javascript">document.form1.jiage.value='<%=connDbBean.readzd("xiyixinxi","jiage","id",request.getParameter("id"))%>';document.form1.jiage.setAttribute("readOnly",'true');</script>
					<tr>
						<td width="200">下单人：</td>
						<td><input name='xiadanren' type='text' id='xiadanren'
							onblur='' class="form-control"
							value='<%=(String)request.getSession().getAttribute("username")%>'
							readonly="readonly" /></td>
					</tr>


					<tr align='center' height="22">
						<td width="25%" align="right">&nbsp;</td>
						<td width="75%" align="left"><input type="submit"
							name="querenzhuce" id="querenzhuce" value="提交"
							onClick="return checkform();" /> <input type="reset" value="重置" />&nbsp;
						</td>
					</tr>
				</form>
			</table>

			<script language="javascript">popheight = 450;</script>

		</div>
	</section>
	<jsp:include page="qtdown.jsp"></jsp:include>
	<jsp:include page="qtuserlog.jsp"></jsp:include>
	<script src="qtimages/lib/jquery/jquery.min.js"></script>
	<script src="qtimages/lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="qtimages/js/index.js"></script>

</body>
</html>
