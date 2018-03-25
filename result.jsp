
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "model.MorseLetters" %>
<%@ page import = "model.MorseAudios" %>
<%@ page import = "model.MorsePics" %>

<%
//get the requested object from the Servlet
String mP = (String) session.getAttribute("mP");
String mA= (String) session.getAttribute("mA");
int counter = (Integer) session.getAttribute("counter");
int total = (Integer) session.getAttribute("total");
String word = (String) session.getAttribute("word");
mA = "MorseAudios/" + mA;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Your Morse Code Visualization</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
    
    <!-- Javascript: play the audio -->
    <script>
        
        function playAudio(){
        	var audio = document.getElementById("morseAudio");
        	audio.play();
        }
    </script>
    
</head>

<body>
  <div class="head">
    <img src="CSS files/background.jpg" style="width:100%; height:400px" />
    <div class="centered"> <h1> Check your Morse Code Visualization here! </h1> </div>
  </div>
  
  <div class="body">
    <div class="instruction">
    <img src="CSS files/bag.png" style="width:100px; height:100px" />
    <p> Click "previous" or "next" to look at the visualization for each letter of your word! </p>
    <p> Click "Try again" to start a new visualization! </p>
    </div>
    
    <!-- Get the picture for the morse code -->
    </br>
    <div class="morsePics"> <img src='MorsePics/<%=mP %>' /> </div>
   
    <!-- previous button -->
    <form name=changePic action=verify method=post>
        <% if(counter==0) { %>
        	<div class="previous"> <input type="submit" name="previous" value="previous" disabled/> </div>
        <% }
        else { %>
        <div class="previous"> <input type="submit" name="previous" value="previous"/> </div>
        <input type="hidden" name="counter" value="<%=counter-1 %>" />
        <input type="hidden" name="word" value="<%=word %>" />
        <% } %>
    </form>   
    
    <!-- next button -->
    <form name=changePic action=verify method=post>
        <% if(counter==total) { %>
        	<div class="next"> <input type="submit" name="next" value="next" disabled/> </div>
        <% }
        else { %>
        <div class="next"> <input type="submit" name="next" value="next"/> </div>
        <input type="hidden" name="counter" value="<%=counter+1 %>" />
        <input type="hidden" name="word" value="<%=word %>" />
        <% } %>
    </form>
    
    
    </br>
    </br>
    <!-- Get the audio for the morse code -->
    <div class="again">
    <form>   
        <input type="button" value="Play Audio" onclick="playAudio()" />
        <audio id="morseAudio" src='<%=mA %>'></audio>
    </form> 
    
    </br>
    <a href="index.jsp"> Play again </a>
    </div>
    
  </div>
</body>
</html>
