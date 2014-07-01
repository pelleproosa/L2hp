package INI;




/*
 *                        Sisendiks anda  :  (String file name, String sisu, String t2psustus(append/rewrite))
 *                        Output gives: Boolean false=error, true=done;
 * 
 * */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class failifuntsioonid
{


	public static boolean Fail_Kirjuta(String Faili_Nimi, String[] Sisu, String Kirjutamise_Moodus, int sisu_suurus) throws Exception //Fail_Kirjuta algus
	{

	boolean moodus=true;
	
	File f=new File(Faili_Nimi);
		if (!f.exists())
		{
			if ( !f.createNewFile() ) 
			{
				return false;
			}
		}
		if (Kirjutamise_Moodus.equalsIgnoreCase("append"))
		{
			moodus=true;
		}else
		{
			moodus=false;
		}
		BufferedWriter output;
		output = new BufferedWriter(new FileWriter(Faili_Nimi,moodus));
		
		int i=0;
while (i<sisu_suurus){
	output.write(Sisu[i]);
	output.newLine();
	i++;
}

	        output.close();
        
	        
	        return true;
	}																												//Fail_Kirjuta lõpp








	public static String[] LoeFaili_Aadress_Algus_L6pp(String Read_File_Name) throws Exception {
		// Construct BufferedReader from FileReader
		BufferedReader br = new BufferedReader(new FileReader(Read_File_Name));
	 
		String[] line = new String[MAIN.GLOBAL.INI_lines];
		String rida= null;
		int i=0;
		while ((rida = br.readLine()) != null) {
			line[i]=rida;
			System.out.println(i+"  "+line[i]);
			i++;
		}
	 
		br.close();
		
		return line;

	}
}

