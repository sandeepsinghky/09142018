<h1 id="banner">Unauthorized Access !!</h1>

     

        <hr />

     

        <c:if test="${not empty error}">

            <div style="color:red">

                Your fake login attempt was bursted, dare again !!<br /> 

                Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

            </div>

        </c:if>

     

        <p class="message">Access denied!</p>

       