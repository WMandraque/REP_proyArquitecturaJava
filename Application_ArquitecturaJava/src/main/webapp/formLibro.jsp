
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">

<head>
<meta charset="ISO-8859-1">
<title>Formulario Libro</title>
<link href="resources/css/mystile.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<h1>Formulario Alta Libro</h1>

	<form action="insertaLibro.jsp" id="frmInsertarLibro" name="frmInsertarLibro" method="post">
		<fieldset>
		<legend>Formulario de Alta de Libros</legend>
			<p /> <label for="txtIsbn">ISBN:</label> <input type="text" name="txtIsbn" id="txtIsbn" />
			<p /><label for="txtTitulo">Titulo:</label> <input type="text" name="txtTitulo" id="txtTitulo" />
			<p /><label for="txtCategoria">Categoria:</label> <input type="text" name="txtCategoria" id="txtCategoria" />
			<p /><input type="submit" value="Insertar" id="btnInsertar" />
		</fieldset>
	</form>
<script type="text/javascript" src="resources/myjs/formLibro.js" ></script>

</body>
</html>