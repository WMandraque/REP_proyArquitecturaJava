package com.mandraque;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvListarLbros
 */
@SuppressWarnings("serial")
@WebServlet("/SvListarLbros")
public class SvListarLibros extends HttpServlet
{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/arquitecturajava", "root", "mysql");
			
			ResultSet rs = connection.prepareStatement("SELECT * FROM tb_libro").executeQuery();
			
		
			
			while(rs.next())
			{
				
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
