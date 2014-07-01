/**
 * 
 */
package MAIN;

import Graafiline_osa.tabel;
import INI.INI_GLOBAL;

/**
 * @author Pele
 *
 */ 
public class MAIN { 

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// Vahetest START
	//Funktsioonid.TulbadReadDoubleJadasse("{10, 75, 75, 75, 10, 200, 10, 1, 1, 77}", "{10, 75, 75, 75, 75, 75, 10, 1, 1, 1}");
	//System.exit(0);       
		// Vahetest END
		
		GLOBAL.SaveFileName=System.getProperty("user.dir")+"\\"+"L2Calc.ini";
		System.out.println(System.getProperty("user.dir")+"\\"+"L2Calc.ini");
		// System.out.println(System.getProperty("user.home")+"\\Desktop\\");

	INI_GLOBAL.start(args); 
	tabel.start(args);

	}

}
