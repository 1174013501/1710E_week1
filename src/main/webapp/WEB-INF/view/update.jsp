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
	$(function() {
		// 品牌
		$.post(
			"selectbrand",
			function (obj) {
				for ( var i in obj) {
					$("#bid").append("<option value='"+obj[i].id+"'>"+obj[i].name+"</option>");
				}
			},
			"json"
		)
		// 种类
		$.post(
			"selectType",
			function (obj) {
				for ( var i in obj) {
					$("#tid").append("<option value='"+obj[i].id+"'>"+obj[i].name+"</option>");
				}
			},
			"json"
		)
	})
	
	
	// 修改
	function update() {
		$.post(
			"update",
			$("form").serialize(),
			function(obj) {
				if (obj == 1) {
					alert("修改成功");
					location.href="selectgoods";
				}else {
					alert("修改失败");
				}
			},
			"json"
		)
	}
</script>
<body>
<form action="">
	编号：<input type="hidden" name="id" value="${g.id }">
	商品名称：<input type="text" name="name" value="${g.name }"><br>
	英文名称：<input type="text" name="ename" value="${g.ename }"><br>
	
	商品品牌：<select name="bid" id="bid">
		
		</select><br>
		
	商品种类：<select name="tid" id="tid">
		
		</select><br>
	
	商品尺寸：<input type="text" name="size" value="${g.size }"><br>
	商品单价（元）：<input type="text" name="price" value="${g.price }"><br>
	商品数量：<input type="text" name="num"  value="${g.num }"><br>
	商品标签：<input type="text" name="tab"  value="${g.tab }"><br>
	图片：<img alt="" src="/pic/${g.pic }" width="150px" height="150px"><br>
	<input type="button" value="修改" onclick="update()">
	
</form>
</body>
</html>