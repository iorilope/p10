/**
 * 
 */
package p10_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Konexioak {
	Connection connection;
	static final String DB_URL = "jdbc:mysql://localhost:3306/programazioa";
	static final String USER = "root";
	static final String PASS = "mysql";
	
	public	String erabizenaString;
	public	String erabAbizenaString;
	public	String Na_Zenb;
	public	String erabPasahitzaString;
	public	String erabPasahitzaRepeat;
	public String username;
	
	public void Konexioa() {
		try {
			 connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Ondo konektatu da");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public String ErabiltzaileTaulaSortu() {
		String mezuaString = "";
		
		try {
			Statement stmnt = connection.createStatement();
			String sql_create_erab_table = "CREATE TABLE erabiltzaileak (" +
			"nan char(9) not null, "+
			"izena varchar(30) not null, "+
			"abizena varchar(30) not null, " +
			"pasahitza varchar(20) not null, "+
			"erab_Izena varchar(20) not null, "+
			"PRIMARY KEY (nan))";
			
			stmnt.executeUpdate(sql_create_erab_table);
			mezuaString = " Taula ondo sortu da";
			stmnt.close();
			return mezuaString;
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			mezuaString = "Errorea egond a taula sortzerakoan";
			return mezuaString;
			
		}
		
	}
	


	
	  
	
	
	public String usernameSortu() {
		String mezuaString ="";
		Statement stmt;
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT erab_Izena FROM erabiltzaileak");
			try {
		        Character lehenletra = erabizenaString.charAt(0);
		        String abizena = erabAbizenaString.toLowerCase();
		         username = lehenletra + abizena;

		         //Konprpobatu username-a existitzen dela edo ez den existitzen
		         while (rs.next()) {
		             if (rs.getString("erab_Izena").equalsIgnoreCase(username)) {
		                
		            	 username = lehenletra.toString() + erabizenaString.charAt(1) + abizena;
		                 break;
		             }
		         }
		         int counter = 1;
		         String proposedUsername = username;
		         while (rs.next()) {
		             if (rs.getString("erab_Izena").equalsIgnoreCase(username)) {
		                 counter++;
		                 username = username + String.format("%02d", counter);
		             } else {
		                 break;
		             }
		         }
		        
		        System.out.println(username);
		        mezuaString = "ErabiltzaileIzena ondo sortu da";
		        return mezuaString;

		    } catch (Exception e) {
		        e.printStackTrace();
		        mezuaString = "Errorea erabiltzaileIzena sortzerakoan";
		        return mezuaString;
		    }
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return mezuaString;
		
	}
	
	public String ErabiltzaileakSartu() {
		try {
			Statement stmt = connection.createStatement();
			String sqlErabiltzaileakInsert = "INSERT INTO erabiltzaileak (nan,izena,abizena,pasahitza,erab_Izena)" +
					"VALUES ("Na_Zenb","erabizenaString","erabAbizenaString","erabPasahitzaString","username")";
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
