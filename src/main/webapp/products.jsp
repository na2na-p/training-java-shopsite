<%--
  Created by IntelliJ IDEA.
  User: akiyoshi_yamamoto
  Date: 2022/09/05
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
      <title>寿司オンラインショッピングサイト</title>
  </head>
  <body>
    <jsp:include page="./components/main_menu.jsp"/>
    <hr>
    検索キーワードを入力してください。
    <form action="#" method="post">
		<label>
			<input type="text" name="keyword">
		</label>
		<input type="submit" value="検索">
    </form>
    <%-- DBから商品一覧のArray持ってきてControllerから渡されてきてここで表示する。 --%>
  </body>
</html>
