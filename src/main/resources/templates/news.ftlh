<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Новости</title>
</head>
<body>
<h1>Новости</h1><hr>
<form ref="/bsu/v1/" method="get">
    Поиск по названию новости: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list news as news>
    <div>
        <p><b>${news.title}</b> ${news.description} руб. | <a href="/news/${news.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Новостей нет</h3>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="bsu/v1/news/save_news" method="post" enctype="multipart/form-data">
    Название новости: <input type="text" name="title"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Текст: <input type="text" name="text"/><br><br>
    Дата: <input type="date" name="date"/><br><br>
    Имя: <input type="text" name="author"/><br><br>
    Фотография: <input type="file" name="file"/><br><br>
    <input type="submit" value="Добавить новость"/>
</form>
</body>
</html>
