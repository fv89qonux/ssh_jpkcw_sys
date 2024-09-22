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
        function down1(fujianPath,fujianYuashiMing)
        {
            var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
            url=encodeURI(url); 
            url=encodeURI(url); 
            window.open(url,"_self");
        }
        
        function shipinBofang(fujian)
        {
              var url="<%=path %>/bofang/bofang.jsp?fujian="+fujian;
              var n="";
              var w="700px";
              var h="600px";
              var s="resizable:no;help:no;status:no;scroll:yes";
	          openWin(url,n,w,h,s);
        }
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
						     <span style="float:left">教学视频</span>
						</div>
					</div>
					<div class="Slot">
					    <table width="100%" align="center" border="0" cellpadding="8" cellspacing="8">
						    <tr>
						        <td width="15%" align="left" style="font-size: 13px;">
						              视频名称：									    
						        </td>
						        <td width="85%" align="left" style="font-size: 13px;">
						            ${requestScope.shipin.shipinName }
						        </td>
						    </tr>
						    <tr>
						        <td width="15%" align="left" style="font-size: 13px;">
						              视频介绍：									    
						        </td>
						        <td width="85%" align="left" style="font-size: 13px;">
						            <c:out value="${requestScope.shipin.shipinJianjie }" escapeXml="false"></c:out>
						        </td>
						    </tr>
						    <tr>
						        <td width="15%" align="left" style="font-size: 13px;">
						              视频附件：									    
						        </td>
						        <td width="85%" align="left" style="font-size: 13px;">
 						            &nbsp;&nbsp;&nbsp;
						            <video style="width:600px;height:600px" src="/ssh_jpkcw_sys/${requestScope.shipin.fujian }"></video>
						            <a href="/ssh_jpkcw_sys/${requestScope.shipin.fujian }"><font color="red">下载视频</font></a>
						        </td>
						    </tr>
						    <tr>
						        <td width="15%" align="left" style="font-size: 13px;">
						              发布时间：									    
						        </td>
						        <td width="85%" align="left" style="font-size: 13px;">
						            ${requestScope.shipin.shijian }
						        </td>
						    </tr>
						</table> 
						
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
