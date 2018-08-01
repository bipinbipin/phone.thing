<%@include file="../includes/header.jsp" %>
<center>
        <h1>Greg's Amazing Web Design AXL WSDL Future Useful Lifesaving System</h1>
        <h3>G.A.W.D. A.W.F.U.L.</h3>
        </center>
    <div class="badMessages">${validationErrors}</div>
    <div class="goodMessages">${pageMessage}</div>
    <div>
        <form action="./ChangePhones" method="POST">
            <table class="datatable">
                <tr><td><img src="images/question-mark-icon.png" alt="" title = "Select 1 and only 1 phone to update."/></td>
                    <td rowspan="3"><b>Select the Phone: </b></td>
                    <td><input type="radio" name="phoneID" value="SEP000BBE937F94">Room 1</td>
                </tr>
                
                <tr><td></td><td><input type="radio" name="phoneID" value="SEP000D28081E96">Room 2</td></tr>
                <%--<tr><td></td><td><input type="radio" name="phoneID" value="SEP00152BC7F04B">Room 3</td></tr>--%>
            
                <tr><td><img src="images/question-mark-icon.png" alt="" title = "Enter the new line mask, this should only be NUMBERS."/></td>
                    <td>New Mask: </td>
                    <td><input type="number" name="mask"></td></tr>
                <tr><td></td><td></td><td class="center"><input type="submit" value="Update Phone" name="phoneUpdate"></td></tr>
            </table>            
             
        </form>
        </div>
    </body>
</html>
