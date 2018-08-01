<%-- 
    Document   : play
    Created on : Mar 30, 2014, 7:45:28 PM
    Author     : Aston
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>G.A.W.D.  A.W.F.U.L.</title>
        <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">
        <link rel="icon" href="./images/favicon.ico" type="image/x-icon">

        <link href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" rel="stylesheet" />
        <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
        <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

        <script type="text/javascript">
            $(function () {
                $("#menu").menu({
                    position: {at: "left bottom"}
                });
            });
        </script>
        <script type="text/javascript">
            $(function () {
                $("#menu-sub").menu({
                    position: {at: "left bottom"}
                });
            });
        </script>
        <script>
            $(function () {
                $(document).tooltip();
            });
        </script>

        <link type="text/css" rel="stylesheet" href="<c:url value="./styles/styles.css" />" />

    </head>

    <body class="center">
        <div id="Header">
            <img class="center" src="images/logo.jpg" />
        </div>
        <div id="Container">
            <div id="NavigationContainer" class="FloatLeft LargePadding">
                <div id="headerlink" class="headerLink">
                    <div id="navHolder" >
                        <ul id="menu">
                            <li id="Home" class="LargePadding FloatLeft"><a href="./ChangePhones">Home</a></li>
                        </ul>
                    </div>
                </div>
                <div class="clear" ></div>
            </div>
            <br class="Clear">
            <div id="BodyContainer" class="LargePadding Floatleft">
                <div id="BodyContainerContent" class="LargePadding">