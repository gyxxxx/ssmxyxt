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


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<TITLE>添加洗衣信息</TITLE>

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
	document.location.href="xiyixinxi_add.jsp?id=<%=id%>";
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
	<form action="addXiyixinxi.do" name="form1" method="post">
		<table width="100%" border="1" align="center" cellpadding="3"
			cellspacing="1" style="border-collapse: collapse" bgcolor="#F2FDFF">
			<tr bgcolor="#E7E7E7">
				<td height="30" colspan="2" background="images/table_header.gif">添加洗衣信息</td>
			</tr>
			<tr>
				<td width="200">编号：</td>
				<td><input name='bianhao' type='text' id='bianhao'
					value='<%=connDbBean.getID()%>' onblur='' class="form-control" /></td>
			</tr>
			<tr>
				<td width="200">洗衣方法：</td>
				<td><select name='xiyifangfa' id='xiyifangfa'
					class="form-control"><option value="干洗">干洗</option>
						<option value="空气洗">空气洗</option>
						<option value="水洗">水洗</option></select>&nbsp;*<label id='clabelxiyifangfa'
					style='margin-top: 16px;' /></td>
			</tr>
			<tr>
				<td width="200">衣服类型：</td>
				<td><select name='yifuleixing' id='yifuleixing'
					class="form-control"><option value="鞋子">鞋子</option>
						<option value="裤子">裤子</option>
						<option value="毛衣">毛衣</option>
						<option value="短羽绒服">短羽绒服</option>
						<option value="长羽绒服">长羽绒服</option>
						<option value="大衣">大衣</option></select></td>
			</tr>
			<tr>
				<td width="200">注意内容：</td>
				<td><input name='zhuyineirong' type='text' id='zhuyineirong'
					value='' onblur='checkform()' size='50' class="form-control"
					style="width: 600px;" />&nbsp;*<label id='clabelzhuyineirong'
					style='margin-top: 16px;' /></td>
			</tr>
			<tr>
				<td width="200">价格：</td>
				<td><input name='jiage' type='text' id='jiage' value=''
					onblur='checkform()' class="form-control" />&nbsp;*<label
					id='clabeljiage' style='margin-top: 16px;' /></td>
			</tr>
			<tr>
				<td width="200">备注：</td>
				<td><textarea name='beizhu' cols='50' rows='5' id='beizhu'
						onblur='' class="form-control" style="width: 600px; height: 80px;"></textarea></td>
			</tr>


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
 
	var xiyifangfaobj = document.getElementById("xiyifangfa"); if(xiyifangfaobj.value==""){document.getElementById("clabelxiyifangfa").innerHTML="&nbsp;&nbsp;<font color=red>请输入洗衣方法</font>";return false;}else{document.getElementById("clabelxiyifangfa").innerHTML="  "; } 	var zhuyineirongobj = document.getElementById("zhuyineirong"); if(zhuyineirongobj.value==""){document.getElementById("clabelzhuyineirong").innerHTML="&nbsp;&nbsp;<font color=red>请输入注意内容</font>";return false;}else{document.getElementById("clabelzhuyineirong").innerHTML="  "; } 	var jiageobj = document.getElementById("jiage"); if(jiageobj.value==""){document.getElementById("clabeljiage").innerHTML="&nbsp;&nbsp;<font color=red>请输入价格</font>";return false;}else{document.getElementById("clabeljiage").innerHTML="  "; } 	var jiageobj = document.getElementById("jiage"); if(jiageobj.value!=""){ if(/^[0-9]+.?[0-9]*$/.test(jiageobj.value)){document.getElementById("clabeljiage").innerHTML=""; }else{document.getElementById("clabeljiage").innerHTML="&nbsp;&nbsp;<font color=red>必需数字型</font>"; return false;}}      


return true;   
}   
popheight=450;
</script>
<script src="images/hsgcommon/jq.js"></script>
<script src="images/hsgcommon/common.js"></script>
<script src="images/hsgcommon/bootbox.js"></script>