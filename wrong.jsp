<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "model.MorseLetters" %>
<%@ page import = "model.MorseAudios" %>
<%@ page import = "model.MorsePics" %>
<%@ page import = "model.MorseConverter" %>

<%
//get the requested object from the Servlet
String word = (String) session.getAttribute("word");
String wordID = (String) session.getAttribute("wordID");
int counter = (Integer) session.getAttribute("counter");

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Your Practice Result</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
    
    <!-- For the collapsable "show me the correct answer" button -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="head">
    <img src="CSS files/background.jpg" style="width:100%; height:400px" />
    <div class="centered"> <h1> Check your result here! </h1> </div>
  </div>
  
  <div class="body">
    <div class="instruction">
    <p>Sorry! You didn't type the Morse Code correctly for this word <%=word %>. Please try again!</p>
    </div>
    
    <button class="button" class="btn btn-info" data-toggle="collapse" data-target="#demo"> Show me the correct answer </button>
    <div id="demo" class="collapse">
        <p>The correct Morse Code input should be: </p>
        <p><%=wordID %></p>
    </div>
    </br>
    
    </br>
    <form action="tryAgain.jsp" name="tryAgain" method="get">
        <button class="button"> Try Again </button>
        <input type="hidden" name="word" value=<%=word %> />
        <input type="hidden" name="wordID" value=<%=wordID %> />
        <input type="hidden" name="counter" value=<%=counter %> />
    </form>
    </br>
      
    <a href="practice.jsp"><button class="button"> Practice a New Word </button></a>
    </br>
  </div>

  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>

</body>
</html>
