<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Todo PAGE</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
	Add a Todo for ${name}
	<form method="post">
		<fieldset class="form-group">
			<label>Description</label>
			<input type="text" name=desc class="form-control" required="required"/>
		</fieldset>
		<button type="submit" class="btn btn-success">Add</button>
	</form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>