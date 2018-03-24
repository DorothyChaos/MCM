<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>MCM - Translate</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
</head>
<body>

  <div class="head">
    <img src="CSS files/background.jpg" style="width:100%; height:400px" />
    <div class="centered"> <h1> Welcome to Translate Function! </h1> </div>
  </div>
  
  <div class="body">
     <div class="instruction">
        <p>Type in any words, phrases or sentences to be translated into Morse Code and get a beautiful visualization of it!</p>
        <p>Turn on your sound to hear the magic!</p>
     </div>

	
   <div id="form">
    <form name="MCM" action="buttonID" method="post">
         <input type="text" name="word" value="" /> 
        </br>
        </br>
        <input type="submit" name="action" value="Letter-By-Letter" />
        <input type="submit" name="action" value="Whole" />
            
    </form>
    </div>
    
  </div>    
    
  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>

</body>
</html>
