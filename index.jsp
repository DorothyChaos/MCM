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
        <p> Choose the mode you would like to start with:  </p>
    </div>
    
    <div class="dropdown">
        <a href="translate.jsp"><button class="button"> Translate </button></a>
        <div class="dropdown-content">
            <p> Type in any words, phrases or sentences to be translated to Morse Code! </p>
        </div>
    </div>
    
    <div class="dropdown">
        <a href="practice.jsp"><button class="button"> Practice </button></a>
        <div class="dropdown-content">
            <p> Practice your Morse Code knowledge with our word bank! </p>
        </div>
    </div>
  </div>
  
  <div class="bottom"> <p> Copyright @ DVD-MCM </p> </div>
</body>
</html>
