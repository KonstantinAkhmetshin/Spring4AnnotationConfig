<%--
  Created by IntelliJ IDEA.
  User: kos
  Date: 19.04.15
  Time: 1:17
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request"/>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cash Machine</title>
</head>
<body>
    ${cardInfo}
    <div id="1" style="text-align: center; margin-bottom: 10px;">
        <h4>Ввдеите пикн-код для карты ${cardNUmber}</h4>
        <input id="pinInput" disabled="true" size="4" type="password">
    </div>
    <div id="keyboard">
        <table border=2 cellspacing=30 align="center" style="cursor: pointer;">
            <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
            </tr>
            <tr>
                <td>4</td>
                <td>5</td>
                <td>6</td>
            </tr>
            <tr>
                <td>7</td>
                <td>8</td>
                <td>9</td>
            </tr>
            <tr>
                <td style="visibility: hidden;"></td>
                <td align="center">0</td>
                <td style="visibility: hidden;"></td>
            </tr>
        </table>
    </div>
    <div id="buttons" style="display: inline-block;vertical-align: middle;width: 100%; margin-top: 30px" align="center" >
        <button onclick="sendCardNumber()">Ok</button>
        <button style="margin-left: 30px" onclick="clearInput()">Clear</button>
    </div>
    <script>
        var table = document.getElementById('keyboard');
        var cells = table.getElementsByTagName("td");
        var counter = 0;
        var pinInput = document.getElementById('pinInput');
        for (var i = 0; i < cells.length; i++) {
            cells[i].onclick = function () {
                cardInputFunction(this, sendCardNumber);
            };
        }

        function cardInputFunction(cellText, func) {
            if(pinInput.value.length == 4){
                return;
            }
            pinInput.value += cellText.innerHTML;
            counter++;
        }

        function clearInput(){
            pinInput.value = '';
        }

        function sendCardNumber(){
            document.location.href = "/pin?cardNumber="+pinInput.value;
        }

    </script>
</body>
</html>
