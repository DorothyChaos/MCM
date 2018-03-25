<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "model.MorseConverter" %>

<%
//call the method in java to generate a random word
MorseConverter obj = new MorseConverter();
String word = obj.getOrigWord();
String wordID = obj.getWordID();

%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>MCM - Practice</title>
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
    <form name="practice" action="compare" method="post">
        <input type="text" id="input2" name="morseCode" value="Your Morse Code" />
        </br>
        </br>
        <input type="button" id="tryit" value="try it" onclick="calculation();" />
        <input type="submit" name="submit" value="submit" />
        
        <input type="hidden" name="counter" value="0" />
        <input type="hidden" name="word" value=<%=word %> />
        <input type="hidden" name="wordID" value=<%=wordID %> />
    </form>
    </div>
    
    <!-- Javascript related to "try it" button -->
    <script>
    function calculation() {
    	var input2 = document.getElementById("input2").value; 
    	var files = [ ];
    
            for (i=0; i<input2.length; i++){
            	console.log(input2.length);
        		if(input2[i]==0){
        			files.push("MorseAudios/Morse Code Alphabet A Alpha.mp3");
    
        			
        		}
        		
        		if(input2[i]==1){	
        			files.push("MorseAudios/Morse Code Alphabet T Tango.mp3"); 
        		}

        	}  
         
        console.log(files);
        var i = -1;
        playSnd();
            
        }
    
    function playSnd()
    {
    	i++;
    	if(i == files.length) return;
    	files[i].addEventListener('ended', playSnd);
    	files[i].play();
    }
    </script>
     
  </div>
  
  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>

</body>
</html>
