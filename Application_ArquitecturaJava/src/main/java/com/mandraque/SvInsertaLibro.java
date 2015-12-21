package com.mandraque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/SvInsertaLibro")
public class SvInsertaLibro extends HttpServlet
{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Llego al servlet");

		// 1
		String isbn ="'"+ request.getParameter("txtIsbn")+"'";
		String titulo ="'"+ request.getParameter("txtTitulo")+"'";
		String categoria ="'"+ request.getParameter("txtCategoria")+"'";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		Boolean	 resultado = false;

		// 2
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/arquitecturajava", "root", "mysql");
			
			preparedStatement =connection.prepareStatement("insert into tb_libro (isbn, titulo, categoria) values ("+isbn+", "+titulo+", "+categoria+")");
			
			resultado = (preparedStatement.executeUpdate()>0)?true:false;
			
			if(resultado)
			{
				System.out.println("Registro insertado");
			}
			else
			{
				System.out.println("No se inserto el registro");
			}
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("Error en la carga de driver: "+e);
		}
		catch (SQLException e)
		{
			System.out.println("Error accediendo a la base de datos: "+e);
		}
		finally
		{
			//Cerrando recursos
		
				try
				{
					if(preparedStatement != null)
					{
					preparedStatement.close();
					}
					
					if(connection != null)
					{
						connection.close();
					}
				}
				catch (SQLException e)
				{
					System.out.println("Error al cerrar la sentencia o cerrar la conexion");
				}
			
		}
	}

}
