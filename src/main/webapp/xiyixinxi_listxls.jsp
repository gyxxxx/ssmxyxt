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
<title>ϴ����Ϣ</title>
</head>

<body>
	<%
			String sql="select * from xiyixinxi  order by id desc";

			
			%>
	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="00FFFF" style="border-collapse: collapse">
		<tr>
			<td width="30" align="center" bgcolor="CCFFFF">���</td>
			<td align='center' bgcolor='#ebf0f7'>���</td>
			<td align='center' bgcolor='#ebf0f7'>ϴ�·���</td>
			<td align='center' bgcolor='#ebf0f7'>�·�����</td>
			<td align='center' bgcolor='#ebf0f7'>ע������</td>
			<td align='center' bgcolor='#ebf0f7'>�۸�</td>



			<td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>

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

