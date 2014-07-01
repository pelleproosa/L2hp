package INI;

import java.io.FileNotFoundException;



public class INI_GLOBAL {
	public static void start(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] tulem = new String[MAIN.GLOBAL.INI_lines];
	try {
		tulem=failifuntsioonid.LoeFaili_Aadress_Algus_L6pp(MAIN.GLOBAL.SaveFileName);
		//tulem[0] on ebaoluline
		MAIN.GLOBAL.SaveFileName=tulem[1];
		MAIN.GLOBAL.INI_lines=Integer.parseInt(tulem[2]);
		//tulem[3] on ebaoluline
		MAIN.GLOBAL.aknanimi=tulem[4];
		MAIN.GLOBAL.width=Integer.parseInt(tulem[5]);
		MAIN.GLOBAL.height=Integer.parseInt(tulem[6]);
		MAIN.Funktsioonid.TulbadReadDoubleJadasse(tulem[8],tulem[9]); //sisestab 8 ja 9 funtsioonis.
		MAIN.GLOBAL.btn1=tulem[11];
		MAIN.GLOBAL.btn2=tulem[12];
		MAIN.GLOBAL.btn3=tulem[13];
		MAIN.GLOBAL.btn4=tulem[14];
		MAIN.GLOBAL.lbl1string=tulem[15];
		// ... vaba ruum uutele komponentidele
		MAIN.GLOBAL.btnlockation_1=tulem[26];
		MAIN.GLOBAL.btnlockation_2=tulem[27];
		MAIN.GLOBAL.btnlockation_3=tulem[28];
		MAIN.GLOBAL.btnlockation_4=tulem[29];
		MAIN.GLOBAL.lbllockation_1=tulem[30];
		MAIN.GLOBAL.inputlockation_1=tulem[31];
		MAIN.GLOBAL.outputlockation_1=tulem[32];
		
		//	tulem[49]="tagasi kirjutatud";
	//	failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), tulem, "rewrite",MAIN.GLOBAL.INI_lines);
	} 
	
		catch (FileNotFoundException e) {
		
		System.out.println("faili ei leia!  INI");
		
		
		
				
				String Sisu[]={
				"#File:/ name / nr of lines here /",
				MAIN.GLOBAL.SaveFileName,
				""+MAIN.GLOBAL.INI_lines,
				"#Window:/ name / width / height /",
				MAIN.GLOBAL.aknanimi,
				""+MAIN.GLOBAL.width,
				""+MAIN.GLOBAL.height,
				"#Items positions:/ Columns / Rows /",  /*siin peab kirjutama juurde, et loeks jada failist sisse*/
				"{10, 75, 75, 75, 10, 200, 10, 10, 10, 10}",
				"{10, 75, 75, 75, 75, 75, 10, 10, 10, 10}",
				"#Components:/ 1..4 buttons names / 5 label1 text value /",
				MAIN.GLOBAL.btn1,
				MAIN.GLOBAL.btn2,
				MAIN.GLOBAL.btn3,
				MAIN.GLOBAL.btn4,
				"MAIN.GLOBAL.lbl1string",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"#Components locations in window(column, row):/ buttons 1..4 / label 5 / input1, output1 /",
				MAIN.GLOBAL.btnlockation_1,
				MAIN.GLOBAL.btnlockation_2,
				MAIN.GLOBAL.btnlockation_3,
				MAIN.GLOBAL.btnlockation_4,
				MAIN.GLOBAL.lbllockation_1,
				MAIN.GLOBAL.inputlockation_1,
				MAIN.GLOBAL.outputlockation_1,
				"",
				"",
				"",
				"",
				"",
				"",
				"", //// hõivatud akna komponentidele
				"Yet not used variables",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"#END#",
				};
		
		
		failifuntsioonid.Fail_Kirjuta((MAIN.GLOBAL.SaveFileName), Sisu, "append",MAIN.GLOBAL.INI_lines);
		
	}

	}
}
