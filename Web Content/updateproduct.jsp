<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
		integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
		integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container theme-showcase" role="main">
		<form action="" method="post">
			<h2>New Client</h2>
			<input type="text" placeholder="Name" required="true"> <br />
			<input type="text" placeholder="Email" required="true"> <br />
			<input type="text" placeholder="Point of Contact Name" required="true"> <br />
			<input type="text" placeholder="Phone Number" required="true"> <br />
			<input type="text" placeholder="Fax" required="true"> <br />
			<input type="text" placeholder="Street Address 1" required="true"> <br />
			<input type="text" placeholder="Street Address 2" required="true"> <br />
			<input type="text" placeholder="City" required="true"> <br />
			<input type="text" placeholder="State" required="true"> <br />
			<input type="text" placeholder="ZIP" required="true"> <br />
			<select>
				<option value="1">incoming</option>
				<option value="2">outgoing</option>
			</select>
			<button type="submit" class="btn btn-xs btn-success">Add</button>
		</form>
		<form action="" method="post">
			
		</form>
	</div>
</body>
</html>