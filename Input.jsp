<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SMU Exchange Programme</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/scrolling-nav.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<!-- The #page-top ID is part of the scrolling feature - the data-spy and data-target are part of the built-in Bootstrap scrollspy function -->
<body>

	<%
		String username = request.getParameter("username");
        String password = request.getParameter("password");
		
		out.println(username);
	%>


	<section id="about" class="about-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
					<form action="processLogin" method="post">
						<h1>Please input your application</h1>
						<br>
						<input type="text"class="inputs" placeholder="first name" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="last name" /> 
						<br><br>
						
						<input type="radio" name="sex" value="male"> Singapore Citizen &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;   
						<input type="radio" name="sex" value="female"> Others
						<br><br>
						
						<input type="text"class="inputs" placeholder="identification no." /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="email" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="date of birth" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="address (street)" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="address (postal code)" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="hostel (hostel id)" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="hostel (room type)" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="school" /> 
						<br><br>
						
						<input type="text"class="inputs" placeholder="matriculation year" /> 
						<br><br>
						
						<button class="btn btn-default page-scroll" type="submit">Login</button>
					</form>
                </div>
            </div>
        </div>
    </section>
	
	

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Scrolling Nav JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/scrolling-nav.js"></script>

</body>

</html>
