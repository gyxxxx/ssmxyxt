<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="guizixinxihsgb" scope="page"
	class="com.bean.GuizixinxiBean" />

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=guizixinxi.xls");
%>
<html>
<head>
<title>柜子信息</title>
</head>

<body>
	<%
			String sql="select * from guizixinxi  order by id desc";

			
			%>
	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="00FFFF" style="border-collapse: collapse">
		<tr>
			<td width="30" align="center" bgcolor="CCFFFF">序号</td>
			<td align='center' bgcolor='#ebf0f7'>货柜编号</td>
			<td align='center' bgcolor='#ebf0f7'>规格</td>
			<td align='center' bgcolor='#ebf0f7'>位置</td>


			<td width="120" align="center" bgcolor="CCFFFF">添加时间</td>

		</tr>
		<%		
				List pagelist3=guizixinxihsgb.getAllGuizixinxi(5);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
		<tr>
			<td align="center"><%=i+1 %></td>
			<td>${u.huoguibianhao}</td>
			<td>${u.guige}</td>
			<td>${u.weizhi}</td>




		</tr>
		<%
  }}
   %>

	</table>
	<br>
</body>
</html>

