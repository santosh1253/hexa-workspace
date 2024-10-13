 <%@include file="common/header.jspf" %>
<body>
    <%@include file="common/naviagation.jspf" %>
     <div class="container">
     <div><h1>Welcome</h1></div>
    <table class="table">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Description</th>
      <th>Target Date</th>
      <th>Is Done?</th>
      <th></th>
      <th></th>
    </tr>
    <tbody>
    <c:forEach items="${todos}" var="todo">
      <tr>
       <td>${todo.id }</td>
       <td>${todo.username}</td>
       <td>${todo.description }</td>
       <td>${todo.targetDate}</td>
       <td>${todo.done}</td>
       <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete${todo.id}</a></td>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update${todo.id}</a></td>
      </tr>
    </c:forEach>
    </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
     <%@include file="common/footer.jspf" %>
</body>
</html>