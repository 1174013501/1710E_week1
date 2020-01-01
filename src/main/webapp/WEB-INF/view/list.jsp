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
<link href="resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.css"></script>
</head>
<script type="text/javascript">
	function dels() {
		$.post(
			"del",
			{id:$("#gid:checked").val()},
			function(obj) {
				if (obj == 1) {
					alert("删除成功");
					location.href="selectgoods";
				}else {
					alert("删除失败");
				}
			},
			"json"
		)
	}
	
	function del(id) {
		$.post(
			"del",
			{id:id},
			function(obj) {
				if (obj == 1) {
					alert("删除成功");
					location.href="selectgoods";
				}else {
					alert("删除失败");
				}
			},
			"json"
		)
	}
</script>
<body>
	<form action="/selectgoods" method="post">
		名字查找：<input type="text" name="name" value="${g.name }"><input type="submit" value="查找">
		<a href="/toadd"><input type="button" value="添加"></a>
		<input type="button" value="批量删除" onclick="dels()"><br><br>
	
	
		<!-- 数据 -->
		<c:forEach items="${list }" var="u">
		
			<div style="float: left">
				<img alt="" src="/pic/${u.pic }" width="150px" height="150px"><br>
				
				价格：${u.price }<br>
				
				${u.name },${u.ename },${u.size }英寸<br>
				
				${u.tname },<a href="/selectgood?id=${u.id }">查看详情</a><br>
				<a href="/toupdate?id=${u.id }"><input type="button" value="修改">
				<a><input type="button" value="删除" onclick="del(${u.id })">
				<input type="checkbox" value="${u.id }" id="gid">
			</div>
			
		</c:forEach>
		
		
		<!-- 分页 -->
		<br><br><br><br><br><br><br><br><br><br><br><br>
		<div>
			<button name="pageNum" value="1">首页</button>
			<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
			<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
			<button name="pageNum" value="${pg.pages }">尾页</button>
			第${pg.pageNum }页/共${pg.pages }页
		</div>
		
		
	</form>
</body>
</html>