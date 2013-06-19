package zweitesPaket;
/** Fahrenheit.jav
 * Klasse zur Wandlung von Temparaturen von Fahrenheit nach Celsius 
 */

/**
 * @author gzanetti
 * - training day 19 June 2013
 */
public class Fahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int UPPER = 300; // oberste Grenze
		final int LOWER = 0; // Fahrenheit Tiefstwert
		final int STEP = 20; // SCHRITTWERT
		
		// VARIABLEN
		// JE F�R FAHRENHEIT UND CELSIUS
		int fahr; 
		int celsius; 
		
		fahr = LOWER;
		
		while (fahr <=UPPER)
			
		{
			celsius = 5 * (fahr-32) /9;  // STANDARD FORMEL UM FAHRENHEIT IN CELSIUS UMZUWANDEL (FAHRENHEIT MINUS 32 DIVIDIERT DURCH 1.8)
			System.out.println("Fahrenheit: " + fahr + " Celsius" + celsius);
			fahr = fahr + STEP;
			
		}
			
		
		
		
	}

}
