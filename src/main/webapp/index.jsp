<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>寿司オンラインショッピングサイト</title>
    </head>
    <body>
        <jsp:include page="./components/main_menu.jsp"/>
        <%--    現在時刻を表示する    --%>
        <p><%= new java.util.Date() %></p>
    </body>
</html>
