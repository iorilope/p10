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

		erabizenaString = izenaString;
		erabAbizenaString = abizenaString;
		Na_Zenb = Na;
		erabPasahitzaString = pasahitza;
	}
	
	public String Galdetu() {
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
	        resultMessage = "Datuak ondo gorde dira";
	        
	        return resultMessage;

	    } catch (Exception e) {
	        e.printStackTrace();
	        resultMessage = "Errorea gertatu da. Mesedez, saiatu berriro.";
	        return resultMessage;
	    }

	    


	    
	
	  

	}
	
}
	
	
	

	
	
    
	
	

	


