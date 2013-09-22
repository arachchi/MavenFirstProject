<%@page import="cse.maven.sample.NICcode" %>
<%@page import="cse.maven.sample.NIC" %>
<%@page import="cse.maven.sample.exception.InvalidInput"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>NIC Infomation</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<h1>NIC interpretation resutls</h1>

<h3>National Identity card Information</h3>
<%
	String NIC = request.getParameter("NIC");
        try{

	NICcode data=new NICcode(NIC);
        NIC user=data.set();

        out.println("BirthDay: " +user.year+" "+user.month+" "+user.days);
        out.println("Gender: "+user.gender);
        out.println("Voter: "+user.isVoter);

	}catch(InvalidInput ex){
            out.println(ex.getMessage());
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
%>
</head>
<body>

</body>
</html>