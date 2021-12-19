<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/17
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录界面</title>
    <%--     bookstrap cdn--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal">
                <span class="heading">用户登录</span>
                <%--                账号、密码--%>
                <div class="form-group">
                    <input type="number" class="form-control" id="Account" placeholder="请 输 入 您 的 账 号(由学校提供)" required>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="Password" placeholder="请 输 入 您 的 密 码(初始密码为“111111”)"
                           required>
                </div>
                <div class="form-group">
                    <%--                    选择身份登录--%>
                    <div>
                        <label class="radio-inline">
                            <input type="radio" name="loginWay" id="Radios1" value="student" checked>学生登录
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="loginWay" id="Radios2" value="teacher">教师登录
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="loginWay" id="Radios3" value="admin">管理员登录
                        </label>
                    </div>
                    <%--    记住密码--%>
                    <div class="main-checkbox">
                        <input type="checkbox" value="None" id="checkbox1" name="check"/>
                        <label for="checkbox1"></label>
                    </div>
                    <span class="text">Remember Password</span>
                    <%--    按钮--%>
                    <button type="submit" class="btn btn-default" onclick="login()">登录</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<style>
    .form-bg {
        background: #00b4ef;
    }

    .form-horizontal {
        background: #fff;
        padding-bottom: 40px;
        border-radius: 15px;
        text-align: center;
    }

    .form-horizontal .heading {
        display: block;
        font-size: 35px;
        font-weight: 700;
        padding: 35px 0;
        border-bottom: 1px solid #f0f0f0;
        margin-bottom: 30px;
    }

    .form-horizontal .form-group {
        padding: 0 40px;
        margin: 0 0 25px 0;
        position: relative;
    }

    .form-horizontal .form-control {
        background: #f0f0f0;
        border: none;
        border-radius: 20px;
        box-shadow: none;
        padding: 0 20px 0 45px;
        height: 40px;
        transition: all 0.3s ease 0s;
    }

    .form-horizontal .form-control:focus {
        background: #e0e0e0;
        box-shadow: none;
        outline: 0 none;
    }

    .form-horizontal .form-group i {
        position: absolute;
        top: 12px;
        left: 60px;
        font-size: 17px;
        color: #c8c8c8;
        transition: all 0.5s ease 0s;
    }

    .form-horizontal .form-control:focus + i {
        color: #00b4ef;
    }

    .form-horizontal .fa-question-circle {
        display: inline-block;
        position: absolute;
        top: 12px;
        right: 60px;
        font-size: 20px;
        color: #808080;
        transition: all 0.5s ease 0s;
    }

    .form-horizontal .fa-question-circle:hover {
        color: #000;
    }

    .form-horizontal .main-checkbox {
        float: left;
        width: 20px;
        height: 20px;
        background: #11a3fc;
        border-radius: 50%;
        position: relative;
        margin: 5px 0 0 5px;
        border: 1px solid #11a3fc;
    }

    .form-horizontal .main-checkbox label {
        width: 20px;
        height: 20px;
        position: absolute;
        top: 0;
        left: 0;
        cursor: pointer;
    }

    .form-horizontal .main-checkbox label:after {
        content: "";
        width: 10px;
        height: 5px;
        position: absolute;
        top: 5px;
        left: 4px;
        border: 3px solid #fff;
        border-top: none;
        border-right: none;
        background: transparent;
        opacity: 0;
        -webkit-transform: rotate(-45deg);
        transform: rotate(-45deg);
    }

    .form-horizontal .main-checkbox input[type=checkbox] {
        visibility: hidden;
    }

    .form-horizontal .main-checkbox input[type=checkbox]:checked + label:after {
        opacity: 1;
    }

    .form-horizontal .text {
        float: left;
        margin-left: 7px;
        line-height: 20px;
        padding-top: 5px;
        text-transform: capitalize;
    }

    .form-horizontal .btn {
        float: right;
        font-size: 14px;
        color: #fff;
        background: #00b4ef;
        border-radius: 30px;
        padding: 10px 25px;
        border: none;
        text-transform: capitalize;
        transition: all 0.5s ease 0s;
    }

    @media only screen and (max-width: 479px) {
        .form-horizontal .form-group {
            padding: 0 25px;
        }

        .form-horizontal .form-group i {
            left: 45px;
        }

        .form-horizontal .btn {
            padding: 10px 20px;
        }
    }
</style>
<script type="text/javascript" src="https://lib.baomitu.com/jquery/3.6.0/jquery.js">
    /**
     * 登录方式
     *
     */
    let loginWays = document.getElementsByName("loginWay");
    let loginWay;

    function login() {
        let account = document.getElementById("Account").value;
        let password = document.getElementById("Password").value;
        for (let i = 0; i < loginWays.length; i++) {
            if (loginWays[i].checked) {
                loginWay = loginWays[i].value;
            }
        }
        if (this.loginWay === "student") {
            //学生登录 todo：
            $.ajax({
                url: "${pageContext.request.contextPath}/student/studentLog",
                type:"post",
                data:JSON.stringify({
                    "studentID":account,
                    "password":password
                }),
                success:function (res){
                    console.log(res);
                }
            });
        }
        if (this.loginWay === "teacher") {
            //教师登录 todo：
        }
        if (this.loginWay === "admin") {
            //管理员登录 todo：
        }
    }
</script>
</html>
