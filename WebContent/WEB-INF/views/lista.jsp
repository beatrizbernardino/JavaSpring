<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		
				<table class="table table-bordered">
			    <thead>
			     <tr>
			     <th>ID</th>
			      <th>Descrição</th>
			     </tr>
			    </thead>
			    <tbody>

    			<c:forEach var="tarefa" items="${tarefas}">
     	
    

			      <tr>
			      <td><c:out value="${tarefa.id}" /></td>
			       <td><c:out value="${tarefa.descricao}" /></td>
			      </tr>
				     
     			</c:forEach>
   
    			</tbody>

 			  </table>
			
</body>
</html>