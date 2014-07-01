package ssd_adena_input;

public class FixUnhealthySurplus {
	public static void start() {
		double remainder = ajutine_main.Global.soulJ2rel % ajutine_main.Global.soulKuluPerHit;
		System.out.println("jääk on "+remainder);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if(remainder > 0) {
			if(ajutine_main.Global.soulReserv == ajutine_main.Global.soulReservAlguses) {} else {				
				ajutine_main.Global.soulReserv = ajutine_main.Global.soulReserv - remainder;
				ajutine_main.Global.adenaReserv = ajutine_main.Global.adenaReserv + ajutine_main.Global.soulPrice * remainder;
				ajutine_main.Global.soulJ2rel = ajutine_main.Global.soulJ2rel - remainder;
				ajutine_main.Global.soulKogusOsta = ajutine_main.Global.soulKogusOsta - remainder;  
			}
		}
		if(ajutine_main.Global.cryDJ2rel == ajutine_main.Global.cryDLump) {
			if(ajutine_main.Global.cryDReserv == ajutine_main.Global.cryDReservAlguses) {} else {
				ajutine_main.Global.cryDReserv = ajutine_main.Global.cryDReserv - ajutine_main.Global.cryDLump;
				ajutine_main.Global.adenaReserv = ajutine_main.Global.adenaReserv + ajutine_main.Global.cryDPrice * ajutine_main.Global.cryDLump;
				ajutine_main.Global.cryDJ2rel = ajutine_main.Global.cryDJ2rel - ajutine_main.Global.cryDLump;
				ajutine_main.Global.cryDKogusOsta = ajutine_main.Global.cryDKogusOsta - ajutine_main.Global.cryDLump; 
			}
		}
	}

}
