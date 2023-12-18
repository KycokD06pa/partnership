<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Новости</title>
</head>
<body>
<h1>Новости</h1><hr>
<#list images as img>
    <img ref="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>Название новости: </b>${product.title}<br>
<b>Описание: </b>${product.description}<br>
<b>Текст новости: </b>${product.text}<br>
<b>Дата: </b>${product.date}<br>
<hr>
<form action="/news/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>