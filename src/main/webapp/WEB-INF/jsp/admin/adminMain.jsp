<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/18
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>管理员界面</title>
    <%--bookstrap cdn--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<dic class="container-fluid">
    <div class="row">
        <div class="col-md-2" style="background: aqua">
            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="text-align: center">
                <li><label>课堂作业管理系统</label></li>
                <li><label>课程管理</label></li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加课程</a>
                </li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加学生到课程</a>
                </li>
                <li><label>教师管理</label></li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加教师</a>
                </li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除教师</a>
                </li>
                <li><label>学生管理 </label></li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加学生</a>
                </li>
                <li><a href="" style="color: lightseagreen">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除学生</a>
                </li>
                <li style="vertical-align: bottom"><a href="">返回主页</a></li>
            </ul>
        </div>
        <div class="col-md-6">
            <%--            主窗口，显示所有课程--%>

            <table id="class" class="table table-striped table-hover">
                <caption>所有课程:</caption>
                <thead>
                <tr>
                    <th>课程号</th>
                    <th>课程名</th>
                    <th>上课时间</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
        <div class="col-md-4" id="clickShow" style="visibility: hidden">
            <div class="row">
                <div>
                    <label>课程名:</label>
                    <br>
                    <label>授课教师:</label>
                </div>
            </div>
            <div>
                <table id="student" class="table table-striped table-hover">
                    <caption>上课学生</caption>
                    <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</dic>
</body>
<script>
    <%--todo:course的数据绑定与行点击时间，点击该行后显示学生、教师表--%>
    document.getElementById("clickShow").style.visibility="visible";
</script>
</html>
