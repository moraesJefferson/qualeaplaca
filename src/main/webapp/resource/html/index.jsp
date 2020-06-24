<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/buscaPlaca" var="buscaPlaca"/>
<!DOCTYPE html>
<html>
<head>
<title>Qual é a placa?</title>
<script type="text/javascript" src="<c:url value="/resource/js/index.js"/>"/></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="<c:url value="/resource/css/index.css"/>"/>
</head>

<body>
		<div class="page">
	        <h2 class="title-area">
	            <div class="title">Qual é a placa?</div>
	            <div class="subtitle">Insira uma foto de uma placa de trãnsito e então tentaremos identifica-la para você</div>
	        </h2>
	         <form action = "http://localhost:8089/api/qualeaplaca/upload" onsubmit="addEventListener"method = "post" enctype = "multipart/form-data">
         		<input class="click-for-photo" type = "file" name = "file" size = "50" />
         		<input type = "submit" value = "Upload File"/>
      		</form>
    	</div>
</body>
</html> 