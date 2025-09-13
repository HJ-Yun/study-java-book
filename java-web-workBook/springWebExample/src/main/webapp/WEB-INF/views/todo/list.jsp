<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 25. 9. 7.
  Time: 오후 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
              crossorigin="anonymous">

        <title>Bootstrap demo</title>
    </head>
    <body>
        <div class="container-fluid">
            <!-- navbar & card start -->
            <div class="row">
                <div class="row">
                    <div class="col">
                        <nav class="navbar navbar-expand-lg nav-bar-light bg-light">
                            <div class="container-fluid">
                                <a class="navbar-brand" href="#">Navbar</a>
                                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                                    <div class="navbar-nav">
                                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                                        <a class="nav-link" href="#">Features</a>
                                        <a class="nav-link" href="#">Pricing</a>
                                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                                    </div>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row content">
                    <div class="col">
                        <div class="card">
                            <div class="card-header">
                                Featured
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Special title treatment</h5>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Tno</th>
                                            <th scope="col">Title</th>
                                            <th scope="col">Writer</th>
                                            <th scope="col">DueDate</th>
                                            <th scope="col">Finished</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%-- <c:forEach items="${dtoList}" var="dto">
                                            <tr>
                                                <th scope="row"><c:out value="${dto.tno}"/></th>
                                                <td><a href="/todo/read?tno=${dto.tno}"><c:out value="${dto.title}"/></a></td>
                                                <td><c:out value="${dto.writer}"/></td>
                                                <td><c:out value="${dto.dueDate}"/></td>
                                                <td><c:out value="${dto.finished}"/></td>
                                            </tr>
                                        </c:forEach> --%>
                                        <c:forEach items="${responseDTO.dtoList}" var="dto">
                                            <tr>
                                                <th scope="row"><c:out value="${dto.tno}"/></th>
                                                <td><a href="/todo/read?tno=${dto.tno}" class="text-decoration-none"><c:out value="${dto.title}"/></a></td>
                                                <td><c:out value="${dto.writer}"/></td>
                                                <td><c:out value="${dto.dueDate}"/></td>
                                                <td><c:out value="${dto.finished}"/></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <div class="float-end">
                                    <ul class="pagination flex-wrap">
                                        <c:if test="${responseDTO.prev}">
                                            <li class="page-item disabled">
                                                <a class="page-link">Previous</a>
                                            </li>
                                        </c:if>
                                        <c:forEach begin="${responseDTO.start}" end="${responseDTO.end}" var="num">
                                            <li class="page-item ${responseDTO.page == num ? "active":""}"><a class="page-link" href="#">${num}</a></li>
                                        </c:forEach>
                                        <c:if test="${responseDTO.next}">
                                            <li class="page-item">
                                                <a class="page-link" href="#">Next</a>
                                            </li>
                                        </c:if>
                                    </ul>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- navbar & card end -->
            <!-- footer start -->
            <div class="row footer">
                <div class="row fixed-bottom" style="z-index: -100">
                    <footer class="py-1 my-1">
                        <p class="text-center text-muted">Footer</p>
                    </footer>
                </div>
            </div>
            <!-- footer end-->

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
                    crossorigin="anonymous">
            </script>
        </div>
    </body>
</html>