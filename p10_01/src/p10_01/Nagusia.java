/**
 * 
 */
package p10_01;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Nagusia {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Erabiltzaileak erabiltzailea = new Erabiltzaileak();
		Konexioak konexioa = new Konexioak();
		
		konexioa.Konexioa();
		

		// Erabiltzaile taula sortzeko agindua
		// System.out.println(erabiltzailea.ErabiltzaileTaulaSortu());

		System.out.println(erabiltzailea.Galdetu());
		System.out.println(erabiltzailea.getErabizenaString());
		
	
		System.out.println(konexioa.usernameSortu(erabiltzailea));

	}

}
