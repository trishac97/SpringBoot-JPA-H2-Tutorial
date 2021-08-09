<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
<form action="/addStudent">
  <label for="roomNo">Room No:</label><br>
  <input type="roomNo" id="roomNo" name="roomNo" value="John"><br>
  <label for="sid">Student ID:</label><br>
  <input type="text" id="sid" name="sid" value="Doe"><br><br>
  <label for="sName">Student Name:</label><br>
  <input type="text" id="sName" name="sName" value="Doe"><br><br>
  <label for="sCity">Student City:</label><br>
  <input type="text" id="sCity" name="sCity" value="Doe"><br><br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>