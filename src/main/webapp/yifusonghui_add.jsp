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
<TITLE>添加衣服送回</TITLE>

<link rel="stylesheet" href="images/hsgcommon/common.css"
	type="text/css">
<link rel="stylesheet" href="images/hsgcommon/div.css" type="text/css">
</head>
<%
  String id="";
   %>

<script language="javascript">

function gows()
{
	document.location.href="yifusonghui_add.jsp?id=<%=id%>";
}
function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>
<body>
	<form action="addYifusonghui.do" name="form1" method="post">
		<table width="100%" border="1" align="center" cellpadding="3"
			cellspacing="1" style="border-collapse: collapse" bgcolor="#F2FDFF">
			<tr bgcolor="#E7E7E7">
				<td height="30" colspan="2" background="images/table_header.gif">添加衣服送回</td>
			</tr>
			<tr>
				<td width="200">编号：</td>
				<td><input name='bianhao' type='text' id='bianhao' value=''
					onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<script language="javascript">document.form1.bianhao.value='<%=connDbBean.readzd("gouwuche","bianhao","id",request.getParameter("id"))%>';document.form1.bianhao.setAttribute("readOnly",'true');</script>
			<tr>
				<td width="200">洗衣方法：</td>
				<td><input name='xiyifangfa' type='text' id='xiyifangfa'
					value='' onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<script language="javascript">document.form1.xiyifangfa.value='<%=connDbBean.readzd("gouwuche","xiyifangfa","id",request.getParameter("id"))%>';document.form1.xiyifangfa.setAttribute("readOnly",'true');</script>
			<tr>
				<td width="200">衣服类型：</td>
				<td><input name='yifuleixing' type='text' id='yifuleixing'
					value='' onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<script language="javascript">document.form1.yifuleixing.value='<%=connDbBean.readzd("gouwuche","yifuleixing","id",request.getParameter("id"))%>';document.form1.yifuleixing.setAttribute("readOnly",'true');</script>
			<tr>
				<td width="200">价格：</td>
				<td><input name='jiage' type='text' id='jiage' value=''
					onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<script language="javascript">document.form1.jiage.value='<%=connDbBean.readzd("gouwuche","jiage","id",request.getParameter("id"))%>';document.form1.jiage.setAttribute("readOnly",'true');</script>
			<tr>
				<td width="200">货柜编号：</td>
				<td><select name='huoguibianhao' id='huoguibianhao'
					class="form-control"><%=connDbBean.hsggetoption("guizixinxi","huoguibianhao")%></select>&nbsp;*<label
					id='clabelhuoguibianhao' style='margin-top: 16px;' /></td>
			</tr>
			<tr>
				<td width="200">下单人：</td>
				<td><input name='xiadanren' type='text' id='xiadanren' value=''
					onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<script language="javascript">document.form1.xiadanren.value='<%=connDbBean.readzd("gouwuche","xiadanren","id",request.getParameter("id"))%>';document.form1.xiadanren.setAttribute("readOnly",'true');</script>


			<tr align='center' height="22">
				<td height="45" align="right">&nbsp;</td>
				<td width="75%" align="left"><input type="submit"
					name="querenzhuce" id="querenzhuce" value="提交"
					onClick="return checkform();" class="btn btn-info btn-small" /> <input
					type="reset" value="重置" name="Submit2"
					class="btn btn-info btn-small" />&nbsp;</td>
			</tr>
		</table>
	</form>
</body>
</html>






<script language=javascript>  
 
 function checkform(){  
 
	var huoguibianhaoobj = document.getElementById("huoguibianhao"); if(huoguibianhaoobj.value==""){document.getElementById("clabelhuoguibianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入货柜编号</font>";return false;}else{document.getElementById("clabelhuoguibianhao").innerHTML="  "; } 	


return true;   
}   
popheight=450;
</script>
<script src="images/hsgcommon/jq.js"></script>
<script src="images/hsgcommon/common.js"></script>
<script src="images/hsgcommon/bootbox.js"></script>