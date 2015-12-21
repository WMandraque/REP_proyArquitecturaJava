document.getElementById("frmInsertarLibro").onsubmit = function() 
{
	if (document.getElementById("txtIsbn").value == "")
	{
		alert("Isbn vacio");
		return;
	}
	else
	{
	   document.getElementById("frmInsertarLibro").submit();	
	}
}
