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
                <div class="row content">
                    <div class="col">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Search</h5>
                                <form action="/todo/list" method="get">
                                    <input type="hidden" name="size" value="${pageRequestDTO.size}">
                                    <div class="mb-3">
                                        <input type="checkbox" name="finished" ${pageRequestDTO.finished ? "checked" : ""}> finished
                                    </div>
                                    <div class="mb-3">
                                        <input type="checkbox" name="types" value="t" ${pageRequestDTO.checkType("t") ? "checked" : ""}> title
                                        <input type="checkbox" name="types" value="w" ${pageRequestDTO.checkType("W") ? "checked" : ""}> writer
                                        <input type="text" name="keyword" class="form-control" value='<c:out value="${pageRequestDTO.keyword}"/>'>
                                    </div>
                                    <div class="input-group mb-3 dueDateDiv">
                                        <input type="date" name="from" class="form-control" value="${pageRequestDTO.from}">
                                        <input type="date" name="to" class="form-control" value="${pageRequestDTO.to}">
                                    </div>
                                    <div class="input-group mb-3">
                                        <div class="float-end">
                                            <button class="btn btn-primary" type="submit">Search</button>
                                            <button class="btn btn-info clearBtn" type="reset">Clear</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
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
                                                <td><a href="/todo/read?tno=${dto.tno}&${pageRequestDTO.link}" class="text-decoration-none"><c:out value="${dto.title}"/></a></td>
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
                                            <li class="page-item">
                                                <a class="page-link" data-num="${responseDTO.start-1}" href="#">Previous</a>
                                            </li>
                                        </c:if>
                                        <c:forEach begin="${responseDTO.start}" end="${responseDTO.end}" var="num">
                                            <li class="page-item ${responseDTO.page == num ? "active":""}">
                                                <a class="page-link" data-num="${num}" href="#">${num}</a>
                                            </li>
                                        </c:forEach>
                                        <c:if test="${responseDTO.next}">
                                            <li class="page-item">
                                                <a class="page-link" data-num="${responseDTO.end+1}" href="#">Next</a>
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

            <script>
                document.querySelector(".pagination").addEventListener("click",function (e){
                    e.preventDefault();
                    e.stopPropagation();

                    const target = e.target;

                    if (target.tagName !== 'A'){
                        return;
                    }

                    const num = target.getAttribute("data-num");
                    const formObj = document.querySelector("form");

                    formObj.innerHTML += `<input type="hidden" name="page" value="\${num}">`

                    formObj.submit();

                }, false)
                document.querySelector(".clearBtn").addEventListener("click", function (e){
                    e.preventDefault();
                    e.stopPropagation();

                    self.location = "/todo/list";
                }, false)
            </script>
        </div>
    </body>
</html>