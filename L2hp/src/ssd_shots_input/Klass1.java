package ssd_shots_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm
	ajutine_main.Global.SSDReal=Math.ceil(ajutine_main.Global.SSDRequested / ajutine_main.Global.SSDOutputAmount) * ajutine_main.Global.SSDOutputAmount;
	ajutine_main.Global.SSDHits = ajutine_main.Global.SSDReal / ajutine_main.Global.SSDOutputAmount;
	ajutine_main.Global.cryDKogusOsta = ajutine_main.Global.SSDHits * ajutine_main.Global.cryDKuluPerHitSSD - ajutine_main.Global.cryDReserv;
	ajutine_main.Global.soulKogusOsta = ajutine_main.Global.SSDHits * ajutine_main.Global.soulKuluPerHit - ajutine_main.Global.soulReserv;
	
	if(ajutine_main.Global.cryDKogusOsta < 0) {
		ajutine_main.Global.cryDKogusOsta = 0;
	}
	if(ajutine_main.Global.soulKogusOsta < 0) {
		ajutine_main.Global.soulKogusOsta = 0;
	}
	ajutine_main.Global.cryDReservAlguses = ajutine_main.Global.cryDReserv;
	ajutine_main.Global.soulReservAlguses = ajutine_main.Global.soulReserv;
	ajutine_main.Global.cryDReserv = ajutine_main.Global.cryDReserv + ajutine_main.Global.cryDKogusOsta - ajutine_main.Global.SSDHits * ajutine_main.Global.cryDKuluPerHitSSD;
	ajutine_main.Global.soulReserv = ajutine_main.Global.soulReserv + ajutine_main.Global.soulKogusOsta - ajutine_main.Global.SSDHits * ajutine_main.Global.soulKuluPerHit;
	
	System.out.println("SSDREAL;SSDHITS;CRYDKOGUSOSTA;soulKOGUSOASTA "+ajutine_main.Global.SSDReal+" "+ajutine_main.Global.SSDHits+" "+ajutine_main.Global.cryDKogusOsta+" "+ajutine_main.Global.soulKogusOsta);
	
	ajutine_main.Global.adenaKulu = ajutine_main.Global.cryDKogusOsta * ajutine_main.Global.cryDPrice + ajutine_main.Global.soulKogusOsta * ajutine_main.Global.soulPrice;
	ajutine_main.Global.adenaReserv = ajutine_main.Global.adenaReserv - ajutine_main.Global.adenaKulu; 
	
	if(ajutine_main.Global.adenaReserv < 0) {
		ajutine_main.Global.craftAdenaAssessment = "BAD";
	} else {
		ajutine_main.Global.craftAdenaAssessment = "GOOD";
	}
	System.out.println("You need to buy a further "+ajutine_main.Global.cryDKogusOsta+" cryD and "+ajutine_main.Global.soulKogusOsta+" soul.");

	if(ajutine_main.Global.craftAdenaAssessment == "GOOD") {
		System.out.println("You will have "+ajutine_main.Global.adenaReserv+" adena remaining.");
	} else {
		System.out.println("Craft will consume "+ajutine_main.Global.adenaKulu+" adena.");
	}
	System.out.println("You will have "+ajutine_main.Global.cryDReserv+" cryD and "+ajutine_main.Global.soulReserv+" soul remaining.");
	}
	
		 
		
		
	}
	



