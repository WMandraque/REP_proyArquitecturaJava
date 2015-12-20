document.getElementById("btnInsertar").onclick = function() 
{
	
	if (document.getElementById("txtIsbn").value == "")
	{
		alert("Isbn vacio");
	}
	else
	{
	   document.frmInsertarLibro.submit();	
	}
}
