package jap_morph_analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	//Klassenvariablen--------------------------------------------------------------------------------
	
	private final String driverName = "org.sqlite.JDBC";
	private final String driver = "jdbc:sqlite";
	private final String dbFile = "Lexeme.sqlite";
		
	
	//Klassenmethoden---------------------------------------------------------------------------------

	public void registerDriver() throws ClassNotFoundException
	{
		Class.forName(driverName);
	}
	
//------------------------------------------------------------------------------------------------	
	
	public void connectDB() throws SQLException
	{
		DriverManager.getConnection(driver+":"+dbFile);
	}
	
//------------------------------------------------------------------------------------------------	
	
	public void shutdownDBConn()
	{
		
	}
	
//------------------------------------------------------------------------------------------------	

	public void addEntry()
	{
		
	}
	
//------------------------------------------------------------------------------------------------	

	public void deleteEntry()
	{
		
	}
	
//------------------------------------------------------------------------------------------------	
	
	public void changeEntry()
	{
		
	}
	
//------------------------------------------------------------------------------------------------	
	
	public void searchEntry()
	{
		
	}
	
//------------------------------------------------------------------------------------------------	
	
	
	
//------------------------------------------------------------------------------------------------	

	
	
	//Konstruktoren-----------------------------------------------------------------------------------
	
	public DBConnect()
	{
		
	}
	
	public DBConnect (String driverName)
	{
		
	}
	
}
