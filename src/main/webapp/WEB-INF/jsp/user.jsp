<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


</head>
<body style="background-color:#7fc399">

<h2><b>FORM</b></h2>
	
<form:form modelAttribute="user" style="background-color:#e1faf2" action="/register" method="post">
<table  border=1 >
<tr>
	<td>
	<div class="form-group">
    	<label for="a"><b>First Name</b></label>
    	<form:input path="fname"/>
  </div>
  <form:errors path="fname" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Last Name</b></label>
    	<form:input path="lname"/>
  </div>
    <form:errors path="lname" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Email</b></label>
    	<form:input path="mail" type="email"/>
  </div>
        <form:errors path="mail" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Designation</b></label>
    	<form:input path="desg"/>
  </div>
  </td>
  <td>
  <div class="form-group" >
    	<label for="a"><b>Start of Contract</b></label>
    	<form:input path="soc" type="date"/>
  </div>
  <form:errors path="soc" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>End of Contract</b></label>
    	<form:input path="eoc"  type="date"/>
  </div>
  <form:errors path="eoc" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Position Number</b></label>
    	<form:input path="posnum"/>
  </div>
  </td>
  </tr>
  <tr>
  <td>
  <div class="form-group">
    	<label for="a"><b>Function</b></label>
    	<form:select path="fn">
    	<form:option value="Java Developer" lable="Java Developer"/>
    	<form:option value="QA" lable="QA"/>
    	<form:option value="PM" lable="PM"/>
    	<form:option value="BA" lable="BA"/>
    	
    	</form:select>
  </div>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Manager Name</b></label>
    	<form:input path="mname"/>
  </div>
  <form:errors path="mname" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>PO Number</b></label>
    	<form:input path="ponum"/>
  </div>
      <form:errors path="ponum" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Vendor Name</b></label>
    	<form:input path="vname"/>
  </div>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Full Address</b></label>
    	<form:textarea path="paddr"/>
  </div>
  <form:errors path="paddr" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Contact Number</b></label>
    	<form:input path="num"/>
  </div>
  <form:errors path="num" cssClass="text-danger"></form:errors>
  </td>
  <td>
  <div class="form-group">
    	<label for="a"><b>Current location</b></label>
    	<form:input path="crrloc"/>
  </div>
    <form:errors path="crrloc" cssClass="text-danger"></form:errors>
  </td>
 </tr>
 </table>
 <div>
 <form:button type="submit" class="btn-success">Submit</form:button>
 
 </div>
  </form:form>    <br><br>
 <p>${error}</p>
</body>
</html>