<%--
  Created by IntelliJ IDEA.
  User: CrazyCodess
  Date: 2016/5/1
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除成功</title>
    <script language="javascript">

        setTimeout(function(){
            location.href="${rootPath}/admin/news/list";

        },1000);
    </script>
</head>
<body>
${deleteNewsMsg}
</body>
</html>
