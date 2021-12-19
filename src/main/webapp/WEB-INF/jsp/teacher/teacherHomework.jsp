<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/18
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>教师布置的作业</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2"  style="background: aqua">
            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="text-align: center">
                <li><label>课堂作业管理系统</label></li>
                <li><a href="">我的课程</a></li>
                <li><a href="">布置的作业</a></li>
                <li><a href="">修改密码</a></li>
                <li style="vertical-align: bottom"><a href="">返回主页</a></li>
            </ul>
        </div>
        <div class="col-md-10">
            <%--            作业表格--%>
            <table id="class" class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>作业id</th>
                    <th>作业描述</th>
                    <th>对应课程名</th>
                    <th>相关操作</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<script>

</script>
</html>
