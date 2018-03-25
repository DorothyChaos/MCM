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
    <title>Try Again</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
</head>

<body>
  <div class="head">
    <img src="CSS files/background.jpg" style="width:100%; height:400px" />
    <div class="centered"> <h1> Welcome to Practice Function! </h1> </div>
  </div>
  
  <div class="body">
    <div class="instruction">
        <p>Practice your Morse Code skills from our word bank!</p>
        <p>Type "0" for DIT and "1" for DAH</p>
        <p>Click on "try it" to hear your Morse Code you typed in. Click on "Submit" to see if you are getting it correct!</p>
        <p>Turn on your sound for the beautiful magic!</p>
        
        </br>
        </br>
        <h3>Put your Morse Code for this word in the blank below: <%=word %></h3>
     </div>
     
    <div id="form">
    <form name="practice" action="compare" method="post"">
        <input type="text" name="morseCode" value="Your Morse Code" />
        </br>
        </br>
        <input type="button" value="Try it" onclick="tryit();" />
        <input type="submit" name="submit" value="submit" />
        
        <input type="hidden" name="counter" value="0" />
        <input type="hidden" name="word" value=<%=word %> />
        <input type="hidden" name="wordID" value=<%=wordID %> />
    </form>
    </div>
    
<!--     Javascript related to "try it" button
    <script>
          function tryit() {
        	var input = document.getElementByName("morseCode").value; 
            for (i=0; i<input.length; i++){
        		if(input.contains("0")){
        			var audio = new Audio("0_number_morse_code.ogg.mp3");
        			audio.play();
        		}
        		
        		if(input.contains("1")){
        			var audio = new Audio("1_number_morse_code.ogg.mp3");
        			audio.play();
        		}
        	} 
        	
        	console.log(input);
        	
        }
    </script> -->
     
  </div>
  
  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>

</body>
</html>
