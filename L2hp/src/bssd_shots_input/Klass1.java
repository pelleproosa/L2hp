package bssd_shots_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm
	ajutine_main.Global.BSSDReal=Math.ceil(ajutine_main.Global.BSSDRequested / ajutine_main.Global.BSSDOutputAmount) * ajutine_main.Global.BSSDOutputAmount;
	ajutine_main.Global.BSSDHits = ajutine_main.Global.BSSDReal / ajutine_main.Global.BSSDOutputAmount;
	ajutine_main.Global.cryDKogusOsta = ajutine_main.Global.BSSDHits * ajutine_main.Global.cryDKuluPerHitBSSD - ajutine_main.Global.cryDReserv;
	ajutine_main.Global.spiritKogusOsta = ajutine_main.Global.BSSDHits * ajutine_main.Global.spiritKuluPerHit - ajutine_main.Global.spiritReserv;
	
	if(ajutine_main.Global.cryDKogusOsta < 0) {
		ajutine_main.Global.cryDKogusOsta = 0;
	}
	if(ajutine_main.Global.spiritKogusOsta < 0) {
		ajutine_main.Global.spiritKogusOsta = 0;
	}
	ajutine_main.Global.cryDReservAlguses = ajutine_main.Global.cryDReserv;
	ajutine_main.Global.spiritReservAlguses = ajutine_main.Global.spiritReserv;
	ajutine_main.Global.cryDReserv = ajutine_main.Global.cryDReserv + ajutine_main.Global.cryDKogusOsta - ajutine_main.Global.BSSDHits * ajutine_main.Global.cryDKuluPerHitBSSD;
	ajutine_main.Global.spiritReserv = ajutine_main.Global.spiritReserv + ajutine_main.Global.spiritKogusOsta - ajutine_main.Global.BSSDHits * ajutine_main.Global.spiritKuluPerHit;
	
	System.out.println("BSSDREAL;BSSDHITS;CRYDKOGUSOSTA;SPIRITKOGUSOASTA "+ajutine_main.Global.BSSDReal+" "+ajutine_main.Global.BSSDHits+" "+ajutine_main.Global.cryDKogusOsta+" "+ajutine_main.Global.spiritKogusOsta);
	
	ajutine_main.Global.adenaKulu = ajutine_main.Global.cryDKogusOsta * ajutine_main.Global.cryDPrice + ajutine_main.Global.spiritKogusOsta * ajutine_main.Global.spiritPrice;
	ajutine_main.Global.adenaReserv = ajutine_main.Global.adenaReserv - ajutine_main.Global.adenaKulu; 
	
	if(ajutine_main.Global.adenaReserv < 0) {
		ajutine_main.Global.craftAdenaAssessment = "BAD";
	} else {
		ajutine_main.Global.craftAdenaAssessment = "GOOD";
	}
	System.out.println("You need to buy a further "+ajutine_main.Global.cryDKogusOsta+" cryD and "+ajutine_main.Global.spiritKogusOsta+" spirit.");
	
	if(ajutine_main.Global.craftAdenaAssessment == "GOOD") {
		System.out.println("You will have "+ajutine_main.Global.adenaReserv+" adena remaining.");
	} else {
		System.out.println("Craftiks kulub "+ajutine_main.Global.adenaKulu+" adenat.");
	}
	System.out.println("You will have "+ajutine_main.Global.cryDReserv+" cryD and "+ajutine_main.Global.spiritReserv+" spirit remaining.");
	
		 
		
		
	}
	
}