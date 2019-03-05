<%@ page isELIgnored="false"%>

<html>
    <body>
        <div class="container">
            <span style="color: red"> ${errorMessage}</span>
            <form action="login" method="POST">
                Name: <input type="text" name="name"/> <br/>
                Password: <input type="password" name="password"/> <br/>
                <input type="submit"/>
            </form>
        </div>
    </body>
</html>