<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>图书信息</title>
    </head>
    <body>
    
        <div align="center">
            <form action="/book/showAll" method="post">
            	<table>
            		<tr>
            			<td>书籍编号</td>
            			<td><input type="text" id="bookid" name="bookid"></td>
                    	<td>书籍名称</td>
                    	<td><input type="text" id="bookname" name="bookname"></td>
                    	<td>价格/元</td>
                    	<td><input type="text" id="bookprice" name="bookprice"></td>
            			<td><input id="submit" type="submit" value="添加"></td>
            		</tr>
                </table>
            </form>
            
            <table border="1">
                <tr>
                	<td>书籍编号</td>
                 	<td>书籍名称</td>
                 	<td>价格/元</td>   
                </tr>
                <c:forEach items="${books}" var="book">
                	<tr>   
                    	<td><c:out value="${book.getJw_id()}"></c:out></td>
                    	<td><c:out value="${book.getJw_title()}"></c:out></td>
                    	<td><c:out value="${book.getPrice()}"></c:out></td>
                	</tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>