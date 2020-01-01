<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%
	String path=request.getContextPath();
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- {pageContext.request.contextPath} -->

<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.css"></script>
</head>
<body>
	
	编号： ${g.id }<br>
	名字：${g. name }<br>
	英文名：${g.ename }<br>
	尺寸： ${g.size }<br>
	价格：${g. price }<br>
	数量：${g. num }<br>
	标签： ${g.tab }<br>
	品牌：${g. bname }<br>
	类型：${g. tname }<br>
	图片： <img alt="" src="/pic/${g.pic }" width="50px" height="50px"><br>
</body>
</html>