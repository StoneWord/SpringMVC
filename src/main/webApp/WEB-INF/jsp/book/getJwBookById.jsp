<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>图书信息</title>
    </head>
    <body>
    
        <div align="center">
            <table border="1">
                <tr>
                    <td>书籍编号</td>
                    <td>书籍名称</td>
                    <td>价格/元</td>
                </tr>
                <tr>   
                    <td><c:out value="${book.getJw_id()}"></c:out></td>
                    <td><c:out value="${book.getJw_title()}"></c:out></td>
                    <td><c:out value="${book.getPrice()}"></c:out></td>
                </tr>
            </table>
        </div>
    </body>
</html>