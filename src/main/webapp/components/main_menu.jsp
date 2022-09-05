<%--
  Created by IntelliJ IDEA.
  User: akiyoshi_yamamoto
  Date: 2022/09/05
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<h1>寿司オンラインショッピングサイト</h1>
<br/>
<div class="main_menu">
    ★★★メニュー★★★
    <ul style="list-style: none;">
        <li><a href="${pageContext.request.contextPath}/products.jsp">商品</a></li>
        <li><a href="${pageContext.request.contextPath}/cart.jsp">カート</a></li>
        <li><a href="${pageContext.request.contextPath}/purchase.jsp">購入</a></li>
        <li><a href="${pageContext.request.contextPath}/login.jsp">ログイン</a></li>
        <li><a href="${pageContext.request.contextPath}/logout.jsp">ログアウト</a></li>
    </ul>
</div>
