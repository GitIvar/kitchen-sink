<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html >
<head>
    <title>Spring MVC Form Handling</title>
  <link rel="stylesheet" href="css/styles.css" type="text/css" /> 
   
</head>
<body>

<h2>Student Information</h2>
<form:form action="validatelogin.htm" method="post" commandName="login">
	<tr>  <td>User Id:</td> <td><form:input  path="userId" /> </td> </tr> <br/>
	<tr> <td> Password :</td> <td><form:input path="password"/> </td> </tr><br/> 
	<tr> <td> Name :</td> <td><form:input path="name"/> </td> </tr><br/>
	<tr>	
	<td>Gender :</td><td><form:radiobutton path="gender" value="Male" />Male       
                   <form:radiobutton path="gender" value="Female" />Female</td><br/>    
                            
        </tr>		
	<tr>	
	<td>course :</td><td><form:checkbox path="course" value="Math" />Math        
                   <form:checkbox path="course" value="English" />English</td>    
                            
        </tr>		
	<tr> <td colspan=2>   <input type="submit"> </td>	</tr>
  </form:form>
 
  
</body>
</html>