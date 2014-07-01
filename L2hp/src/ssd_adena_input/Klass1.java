package ssd_adena_input;

public class Klass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Algab programm ja faas 1
		ajutine_main.Global.soulReservAlguses = ajutine_main.Global.soulReserv;
		ajutine_main.Global.cryDReservAlguses = ajutine_main.Global.cryDReserv;
		ObtainCryD.start();
		
		//Algab faas 2
		ObtainSoul.start();
		
		//Algab faas 3
		ObtainBoth.start();
		
		//Algab tulemuste korrastamine
		J2reldused.start();
		FixUnhealthySurplus.start();
		
		//Kokkuvõte
		System.out.println("Tuleb osta "+ajutine_main.Global.cryDKogusOsta+" kristalli ja "+ajutine_main.Global.soulKogusOsta+ "kivikest");
		
		System.out.println("CryD enne crafti: "+ajutine_main.Global.cryDReserv);
		System.out.println("Soul enne crafti: "+ajutine_main.Global.soulReserv);
		
		System.out.println("Toimub hunnik crafte: "+ajutine_main.Global.SSDHits);
		System.out.println("Craftitakse hunnik shotte: "+ajutine_main.Global.SSDShots);
		System.out.println("Adena järel pärast crafti: "+ajutine_main.Global.adenaReserv);

		System.out.println("CryD järel pärast crafti: "+ajutine_main.Global.cryDJ2rel);
		System.out.println("Soul järel pärast crafti: "+ajutine_main.Global.soulJ2rel);
		
	}
	
}