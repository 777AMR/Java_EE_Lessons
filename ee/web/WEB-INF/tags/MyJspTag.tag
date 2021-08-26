<%@ attribute name="name" required="false" %>
<br>hello world<br/>
<%= name %><br/>
<b>
    <% getJspBody().invoke(null)%>
</b>