<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Morse Code Mechanism - MCM</title>
    <link type="text/css" rel="stylesheet" href="css.css" />
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
</head>
<body>
  <div class="head">
    <img src="CSS files/background.jpg" style="width:100%; height:400px" />
    <div class="centered"> <h1> Welcome to Morse Code Mechanism! </h1> </div>
  </div>
  
  <div class="body">
    <div class="instruction">
    <img src="CSS files/bag.png" style="width:100px; height:100px" />
    <p> Please type any word, phrase or sentence you like! </p>
    <p> Click "submit" to get your word in a beautiful visualized Morse Code format. Turn on your sound! </p>
    </div>
    
    <div id="form">
    <form name="MCM" action="verify" method="post">
        <input type="text" name="word" value="put your word or phrase here" />
        </br>
        </br>
        <input type="submit" name="submit" value="Get your visualized morse code!" />
        
        <input type="hidden" name="counter" value="0" />
    </form>
    </div>
  </div>
  
  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>
</body>
</html>
