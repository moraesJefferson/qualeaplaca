<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Qual é a placa?</title>
<script type="text/javascript" src="<c:url value="/resource/js/index.js"/>"/></script>
<link rel="stylesheet" href="<c:url value="/resource/css/index.css"/>"/>
<meta charset="ISO-8859-1">
</head>
<body>
	<div class="page">
        <h2 class="title-area">
            <div class="title">Qual é a placa?</div>
        </h2>
        	<c:forEach var="imagem" items="${listaFotos}">
        		<div style="margin-bottom: 20px;">
			        <input id="photo" class="hidden" accept="image/*" type="file" name="foto"></input>
			        <div class="picture-square">
			            	<img class="picture-img" id="photo-show"  src="<c:url value="${imagem.foto}"/>" alt=""/>	        
			       </div>
			        <div id="response-box" class="response-box" >
			        	<input type="text" name="placa" id="placa" value="${imagem.placa}" disabled="disabled">	        
			        </div>
		        	<input type="hidden" name="imagem" id="imagem">
		        </div>
	        </c:forEach>        	
    </div>
</body>
</html>