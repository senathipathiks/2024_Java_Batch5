<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            a{
                text-decoration: none;
            }
            .nav{
                border: solid black;
                background: radial-gradient(#648880, #293f50);
                color: white;
                height: 490px;
            }
            .contact{
                border: solid black;
                background: radial-gradient(#648880, #293f50);
                color: white;
                display: flex;
            }
            li:not(:last-child) {
            margin-bottom: 30px;
            }
            ul{
                list-style-type: none;
            }
            a{
                color: white;
                font-size: 30px;
            }
           li{
            padding: 10px;
           }
           .box{
            width: 50px;
            height: 50px;
            border: solid black;
            padding-left: 8px;
            padding-right: 8px;
            padding-top: 4px;
            padding-bottom: 4px;
            border-radius: 10px;
           }

        </style>
    </head>
    <body>
        <div class="nav">
        <ul>
            <li><a href="Insert.jsp" target="frame3" class="box">Insert</a></li>
            <li><a href="delete.jsp" target="frame3" class="box">delete</a></li>
            <li><a href="update.jsp" target="frame3" class="box">Update</a></li> 
            <li><a href="find.jsp" target="frame3" class="box">Find</a></li>
            <li><a href="viewall.jsp" target="frame3" class="box">ViewAll</a></li>
        </ul>
        </div>
        <!--  <div class="contact">
            <ul>
                <li><a href="aboutus.html" target="frame3" class="box">About US</a></li>
                <li><a href="feedback.html" target="frame3" class="box">Feedback</a></li>
            </ul>
        </div>-->
    </body>
</html>