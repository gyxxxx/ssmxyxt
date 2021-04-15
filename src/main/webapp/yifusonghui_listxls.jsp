<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="yifusonghuihsgb" scope="page"
	class="com.bean.YifusonghuiBean" />

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=yifusonghui.xls");
%>
<html>
<head>
<title>衣服送回</title>
</head>

<body>
	<%
			String sql="select * from yifusonghui  order by id desc";

			
			%>
	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="00FFFF" style="border-collapse: collapse">
		<tr>
			<td width="30" align="center" bgcolor="CCFFFF">序号</td>
			<td align='center' bgcolor='#ebf0f7'>编号</td>
			<td align='center' bgcolor='#ebf0f7'>洗衣方法</td>
			<td align='center' bgcolor='#ebf0f7'>衣服类型</td>
			<td align='center' bgcolor='#ebf0f7'>价格</td>
			<td align='center' bgcolor='#ebf0f7'>货柜编号</td>
			<td align='center' bgcolor='#ebf0f7'>下单人</td>


			<td width="120" align="center" bgcolor="CCFFFF">添加时间</td>

		</tr>
		<%		
				List pagelist3=yifusonghuihsgb.getAllYifusonghui(8);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
		<tr>
			<td align="center"><%=i+1 %></td>
			<td>${u.bianhao}</td>
			<td>${u.xiyifangfa}</td>
			<td>${u.yifuleixing}</td>
			<td>${u.jiage}</td>
			<td>${u.huoguibianhao}</td>
			<td>${u.xiadanren}</td>




		</tr>
		<%
  }}
   %>

	</table>
	<br>
</body>
</html>

