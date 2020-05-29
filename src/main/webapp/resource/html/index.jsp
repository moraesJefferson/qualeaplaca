<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/buscaPlaca" var="buscaPlaca"/>
<!DOCTYPE html>
<html>
<head>
<title>Qual é a placa?</title>
<script type="text/javascript" src="<c:url value="/resource/js/index.js"/>"/></script>
<link rel="stylesheet" href="<c:url value="/resource/css/index.css"/>"/>
</head>

<body>

    <div class="page">
        <h2 class="title-area">
            <div class="title">Qual é a placa?</div>
            <div class="subtitle">Insira uma foto de uma placa de trãnsito e então tentaremos identifica-la para você</div>
        </h2>
	        <input id="photo" class="hidden" accept="image/*" type="file" name="foto" onchange="sendPhoto(event)"></input>
	        <button class="click-for-photo" onclick="clickForPhoto()">Carrega imagem foto</button>
	        <div class="picture-square">
	            <img class="picture-img" id="photo-show" src="<c:url value="/resource/img/placeholder.jpg"/>" alt=""/>
	        </div>
	        <div id="response-box" class="response-box"></div>
	        <form name="form" id="form" action="${buscaPlaca}" method="post">
	         	<input type="hidden" name="imagem" id="imagem">
	        	<input type="submit"/>
	        </form>
    </div>
</body>
</html> 