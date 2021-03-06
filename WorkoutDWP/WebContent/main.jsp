<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
            <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
                <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
                <html lang="en">

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <meta name="keywords" content="">
                    <meta name="description" content="">

                    <title>WorkOut Tracker</title>

                    <!-- Bootstrap CSS
   ================================================== -->
                    <link rel="stylesheet" href="css/bootstrap.min.css">
                    <link rel="stylesheet" href="css/bootstrap.css">

                    <!-- Animate CSS
   ================================================== -->
                    <link rel="stylesheet" href="css/animate.min.css">

                   <!-- Font Icons CSS
   ================================================== -->
   					<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                    <link rel="stylesheet" href="css/font-awesome.min.css">
                    <link rel="stylesheet" href="css/ionicons.min.css">

                    <!-- Main CSS
   ================================================== -->
                    <link rel="stylesheet" href="css/bootstrap.offcanvas.min.css">
                    <link rel="stylesheet" href="css/bootstrap.offcanvas.css">
                    <link rel="stylesheet" href="css/style.css">
                    <link rel="stylesheet" href="myStyles.css">

                    <!-- Google web font 
   ================================================== -->
                    <link rel='stylesheet' href="css/font-google.css">

                    <!-- Header section
================================================== -->

                </head>
<div class="navbar-header">
    <a class="navbar-toggle"> 
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
     </a>
    <h1><a class="navbar-brand" href="index.html">Workout Tracker</a></h1>
   </div>
<body>


	<!-- Preloader section
================================================== -->
	<div class="preloader">

		<div class="sk-spinner sk-spinner-pulse"></div>

	</div>


	<!-- Navigation section
================================================== -->
<div class="navbar navbar-default" role="navigation">
<div id="fullscreen_bg" class="fullscreen_bg"/>
<div class="container">

	<h1 class="form-signin-heading" style="color: white">Workout Tracker</h1>
	<form class="form-signin" form method="GET" action="GetStarted.do">
		<h1 class="form-signin-heading text-muted">Welcome</h1>
		<input type="text" class="form-control" name="username"  placeholder="User name" required="" autofocus="">
		<input type="password" class="form-control" name="password" placeholder="Password" required="">
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>
	</form>
	
	<br><br><br><br><br><br><br><hr>
	<form class="form-signin" form method="GET" action="newuser.jsp">
		<button class="btn btn-lg btn-primary btn-block" type="submit">Create New Account</button>
	</form>

</div>
</div>
</div>
	<!-- Footer section
================================================== -->



	<!-- Javascript 
================================================== -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/isotope.js"></script>
	<script src="js/imagesloaded.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/bootstrap.offcanvas.min.js"></script>
	<script src="js/bootstrap.offcanvas.js"></script>

</body>
</html>