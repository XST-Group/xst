<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 下午5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<header>
    <div class="container">
        <div class="navbar-header pull-left"><a href="/xst/index" class="navbar-brand">
            <img src="${assetsPath}/images/logo.png" alt="Logo" class="img-responsive" width="90"></a>
        </div>
        <nav class="collapse navbar-collapse pull-left">
            <ul class="navbar-nav nav topmenu">
                <li><a href="${rootPath}/course/list">课程</a></li>
                <li><a href="#">小组</a></li>
                <li><a href="${rootPath}/news/list">资讯</a></li>
            </ul>
        </nav>
        <div class="pull-right user-nav clearfix">
            <ul class="nav nav-login">
                <li><a href="#" id="loginButton">登录</a></li>
                <li><a href="${rootPath}/register">注册</a></li>
            </ul>
        </div>
    </div>
</header>
<!-- end of header -->
