<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<HTML>
	<HEAD>
		<META http-equiv=Content-Type content="text/html; charset=utf-8">
		<style type="text/css">
	        .Header {background: url(<%=path %>/img/4.gif) #d10e00 repeat-x left top; height: 70px;width: 1366px;}
	        .HeaderTop {margin: 0px auto;}
        </style>
	</HEAD>

	<BODY text=#000000 bgColor=#ffffff leftMargin=0 rightmargin="0" topMargin=0 marginheight="0" marginwidth="0">
		<div class="Header HeaderTop">
			<br/>
			<font style="font-size: 40px;color: white;font-weight: bolder;display: block;text-align: left">
			    &nbsp;&nbsp;&nbsp;基于web网络教学系统
            </font>
		</div>
		<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
				<TR>
					<TD>
						<TABLE height=28 cellSpacing=0 cellPadding=0 width="100%" border=0>
								<TR><TD bgColor=#ffffff height=2></TD></TR>
								<TR>
								    <TD align=right bgColor=#d6d6d6 style="font-size: 13px;">
								       <c:if test="${sessionScope.userType==0}">
									        欢迎您：系统管理员
									   </c:if>
									   <c:if test="${sessionScope.userType==1}">
									        欢迎您： ${sessionScope.tea.teaRealname}（老师）
									   </c:if>
									   <c:if test="${sessionScope.userType==2}">
									        欢迎您： ${sessionScope.stu.stuRealname}（学生）
									   </c:if>
								       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                       <SCRIPT>setInterval("clock.innerHTML=new Date().toLocaleString()+'&nbsp;&nbsp;'+''.charAt(new Date().getDay());",1000)</SCRIPT><SPAN id=clock></SPAN>&nbsp;&nbsp;&nbsp;
                                    </TD>
                                </TR>
						</TABLE>
					</TD>
				</TR>
		</TABLE>
</HTML>
