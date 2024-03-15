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
public class Erabiltzaileak {

	public	String erabizenaString;
	public	String erabAbizenaString;
	public	String Na_Zenb;
	public	String erabPasahitzaString;
	public	String erabPasahitzaRepeat;
	public String username;
	

	
	
	

	/**
	 * @param args
	 */

	public void Erabiltzailea(String izenaString, String abizenaString, String Na, String pasahitza) {

		this.erabizenaString = izenaString;
		this.erabAbizenaString = abizenaString;
		this.Na_Zenb = Na;
		this.erabPasahitzaString = pasahitza;
	}
	
	/**
	 * @return Erabiltzailearen izena eskuratu
	 */
	public String getErabizenaString() {
		return erabizenaString;
	}

	/**
	 * @param Erabiltzailearen izena ezarri
	 */
	public void setErabizenaString(String erabizenaString) {
		this.erabizenaString = erabizenaString;
	}

	/**
	 * @return Erabiltzailearen abizena eskuratu
	 */
	public String getErabAbizenaString() {
		return erabAbizenaString;
	}

	/**
	 * @param Erabiltzailearen abizena ezarri
	 */
	public void setErabAbizenaString(String erabAbizenaString) {
		this.erabAbizenaString = erabAbizenaString;
	}

	/**
	 * @return the na_Zenb
	 */
	public String getNa_Zenb() {
		return Na_Zenb;
	}

	/**
	 * @param na_Zenb the na_Zenb to set
	 */
	public void setNa_Zenb(String na_Zenb) {
		this.Na_Zenb = na_Zenb;
	}

	/**
	 * @return the erabPasahitzaString
	 */
	public String getErabPasahitzaString() {
		return erabPasahitzaString;
	}

	/**
	 * @param erabPasahitzaString the erabPasahitzaString to set
	 */
	public void setErabPasahitzaString(String erabPasahitzaString) {
		this.erabPasahitzaString = erabPasahitzaString;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String Galdetu() {
		Erabiltzaileak erabiltzailea = new Erabiltzaileak();
	    String resultMessage = "";

	    try {
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.println("Sartu Nan (9 karaktere):");
	            Na_Zenb = sc.nextLine();
	           
	            
	        } while (Na_Zenb.length() != 9);

	        System.out.println("Sartu Izena");
	        erabizenaString = sc.nextLine();
	        
	        System.out.println("Sartu Abizena");
	        erabAbizenaString = sc.nextLine();
	       
	        do {
	            System.out.println("Sartu Pasahitza:");
	            erabPasahitzaString = sc.nextLine();

	            System.out.println("Sartu Pasahitza Berriro:");
	             erabPasahitzaRepeat = sc.nextLine();

	       
	            if (!erabPasahitzaString.equals(erabPasahitzaRepeat)) {
	                System.out.println("Pasahitzak ez datoz bat. Saiatu berriro.");
	            }
	        } while (erabPasahitzaString.length() < 6 || !erabPasahitzaString.equals(erabPasahitzaRepeat));
	       
	
	        
	        sc.close();
	       
	        Erabiltzailea(erabizenaString, erabAbizenaString, Na_Zenb, erabPasahitzaString);
	        resultMessage = "Datuak ondo gorde dira";
	        
	        return resultMessage;

	    } catch (Exception e) {
	        e.printStackTrace();
	        resultMessage = "Errorea gertatu da. Mesedez, saiatu berriro.";
	        return resultMessage;
	    }
	}
	
	
	
	
	
	
}
	
	
	

	
	
    
	
	

	


