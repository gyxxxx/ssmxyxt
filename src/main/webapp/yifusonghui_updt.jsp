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
<TITLE>修改衣服送回</TITLE>

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
	<form action="updateYifusonghui.do" name="form1" method="post">
		<table width="100%" border="1" align="center" cellpadding="3"
			cellspacing="1" style="border-collapse: collapse" bgcolor="#F2FDFF">
			<tr bgcolor="#E7E7E7">
				<td height="30" colspan="2" background="images/table_header.gif">修改衣服送回<input
					type="hidden" name="id" value="${yifusonghui.id}" /></td>
			</tr>
			<tr>
				<td width="200">编号：</td>
				<td><input name='bianhao' type='text' id='bianhao' value=''
					onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<tr>
				<td width="200">洗衣方法：</td>
				<td><input name='xiyifangfa' type='text' id='xiyifangfa'
					value='' onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<tr>
				<td width="200">衣服类型：</td>
				<td><input name='yifuleixing' type='text' id='yifuleixing'
					value='' onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
			<tr>
				<td width="200">价格：</td>
				<td><input name='jiage' type='text' id='jiage' value=''
					onblur='' class="form-control" readonly='readonly' /></td>
			</tr>
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


			<tr align='center' height="22">
				<td width="25%" height="45" align="right">&nbsp;</td>
				<td width="75%" align="left"><input type="submit"
					name="querenzhuce" id="querenzhuce" value="提交"
					onClick="return checkform();" class="btn btn-info btn-small" /> <input
					type="reset" value="重置" class="btn btn-info btn-small" />&nbsp;</td>
			</tr>
			<script language="javascript">document.form1.bianhao.value='${yifusonghui.bianhao}';</script>
			<script language="javascript">document.form1.xiyifangfa.value='${yifusonghui.xiyifangfa}';</script>
			<script language="javascript">document.form1.yifuleixing.value='${yifusonghui.yifuleixing}';</script>
			<script language="javascript">document.form1.jiage.value='${yifusonghui.jiage}';</script>
			<script language="javascript">document.form1.huoguibianhao.value='${yifusonghui.huoguibianhao}';</script>
			<script language="javascript">document.form1.xiadanren.value='${yifusonghui.xiadanren}';</script>

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