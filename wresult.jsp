
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "model.MorseLetters" %>
<%@ page import = "model.MorseAudios" %>
<%@ page import = "model.MorsePics" %>

<%
//get the requested object from the Servlet
int total = (Integer) session.getAttribute("total");
String mP[] = (String[]) session.getAttribute("mP");
String mA[] = (String[]) session.getAttribute("mA");
for(int i = 0; i < total; i++){
	mA[i] = "MorseAudios/" + mA[i];
}
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
    <div class="morsePics"> 
    	<%for(int i = 0; i < total; i++){ %>
    	<img src='MorsePics/<%=mP[i] %>' /> 
    	<%} %>
    </div>
   
    </br>
    </br>
    <!-- Get the audio for the morse code -->
    <div class="again">
    <form>   
        <input type="button" value="Play Audio" onclick="playAudio()" />
        <%for(int i = 0; i < total; i++){ %>
        	<audio id="morseAudio" src='<%=mA[i]%>'></audio>
        <%} %>
    </form> 
    
    </br>
    <a href="index.jsp"> Home </a>
    </div>
    
  </div>
</body>
</html>