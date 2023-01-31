<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
    
<%@ page import="com.xoriant.models.User"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.poi.ss.usermodel.Cell"%>
<%@page import="org.apache.poi.ss.usermodel.DataFormatter"%>
<%@page import="org.apache.poi.ss.usermodel.Row"%>
<%@page import="org.apache.poi.ss.usermodel.Sheet"%>
<%@page import="org.apache.poi.ss.usermodel.Workbook"%>
<%@page import="org.apache.poi.xssf.usermodel.XSSFWorkbook"%>

<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body style="background-color:#7fc399">

<a href="http://localhost:6969/login">New Data</a><br>
<h2>Sheet Data</h2><br>
<% 

try{
	FileInputStream file = new FileInputStream("E:\\Filehandling\\info.xlsx");
	Workbook workbook = new XSSFWorkbook(file);
	DataFormatter dataFormatter = new DataFormatter();
	Iterator<Sheet> sheets = workbook.sheetIterator();
	while(sheets.hasNext()) {
		Sheet sh = sheets.next();%>
		<b><h3><%out.println("Sheet name is "+sh.getSheetName());%></h3></b>
		<table  border=10 style="background-color:#e6e6e6"><tr>
		<%
		Iterator<Row> iterator = sh.iterator();
		
		while(iterator.hasNext()) {
			Row row = iterator.next();
			Iterator<Cell> cellIterator = row.iterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				if(cellValue.isEmpty()){
					cellValue="--NULL--";
				}
				%>
				<td>
				<%out.print(cellValue);%>
				</td>
				
				
				<%
			}
			out.println("");%>
			
			</tr>
			<%
		}
		%></table><%
	}
	workbook.close();
}catch(Exception e) {
	//e.printStackTrace();
	%><h2><% out.println("Problem in accessing file");%></h2><%
}
%>
</body>
</html>