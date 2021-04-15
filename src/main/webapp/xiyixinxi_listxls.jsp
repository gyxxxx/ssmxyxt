<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="xiyixinxihsgb" scope="page"
	class="com.bean.XiyixinxiBean" />

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=xiyixinxi.xls");
%>
<html>
<head>
<title>洗衣信息</title>
</head>

<body>
	<%
			String sql="select * from xiyixinxi  order by id desc";

			
			%>
	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="00FFFF" style="border-collapse: collapse">
		<tr>
			<td width="30" align="center" bgcolor="CCFFFF">序号</td>
			<td align='center' bgcolor='#ebf0f7'>编号</td>
			<td align='center' bgcolor='#ebf0f7'>洗衣方法</td>
			<td align='center' bgcolor='#ebf0f7'>衣服类型</td>
			<td align='center' bgcolor='#ebf0f7'>注意内容</td>
			<td align='center' bgcolor='#ebf0f7'>价格</td>



			<td width="120" align="center" bgcolor="CCFFFF">添加时间</td>

		</tr>
		<%		
				List pagelist3=xiyixinxihsgb.getAllXiyixinxi(8);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
		<tr>
			<td align="center"><%=i+1 %></td>
			<td>${u.bianhao}</td>
			<td>${u.xiyifangfa}</td>
			<td>${u.yifuleixing}</td>
			<td>${u.zhuyineirong}</td>
			<td>${u.jiage}</td>





		</tr>
		<%
  }}
   %>

	</table>
	<br>
</body>
</html>

