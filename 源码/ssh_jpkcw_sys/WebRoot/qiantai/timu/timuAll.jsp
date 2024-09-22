<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link href="css/Common.css" rel="stylesheet" type="text/css" />
    <link href="css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
        
    </script>
  </head>
  
<body>
<!-- head如果图片高度不合适。请修改Common.ces里面的".Header .HeaderTop"的高度。和".Header"的高度-->
<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>    
<!-- head-->	
	
	
	
	
<!--body-->
<div align="center" class="Wrapper">
<div id="MainCenter" align="center" class="MainCenter">
	     <div id="navigation" class="naivgation">
			 <jsp:include flush="true" page="/qiantai/inc/incLeft.jsp"></jsp:include> 
		 </div>
		 <div id="content" class="Sub">
				<div class="NewContainer770">
					<div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">
						     <span style="float:left">在线自测</span>
						</div>
					</div>
					<div class="Slot">
					    <form action="<%=path %>/ziciDafen.action" name="formAdd" method="post">
						   <c:forEach items="${requestScope.timuList}"  varStatus="sta" var="timu">
								<table cellspacing="1" cellpadding="1">
									<tr>
										<td>
											${sta.index+1 }：${timu.name }(<font color="red">${timu.fenshu }分</font>)
											&nbsp;&nbsp;&nbsp;
										</td>
									</tr>
									<tr>
										<td align="left">
											    A:<input type="radio" name="${timu.id}" value="A" style="border: 0"/>${timu.xuanxianga }<br/>
											    B:<input type="radio" name="${timu.id}" value="B" style="border: 0"/>${timu.xuanxiangb }<br/>
											    C:<input type="radio" name="${timu.id}" value="C" style="border: 0"/>${timu.xuanxiangc }<br/>
											    D:<input type="radio" name="${timu.id}" value="D" style="border: 0"/>${timu.xuanxiangd }<br/>
										</td>
									</tr>
								</table>
								<br/>
						   </c:forEach>
						   <input type="submit" value="确定"/>  
			           </form>
                    </div>
				</div>
		 </div>
</div>
</div>
<!--body-->
	
	
	
<!--foot -->	
<div align="center" class="Wrapper">
	<div id="footer" align="center" class="Footer">
		 <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	</div>
</div>
<!--foot -->	
</body>
</html>
