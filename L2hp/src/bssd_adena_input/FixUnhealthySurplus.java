package bssd_adena_input;

public class FixUnhealthySurplus {
	public static void start() {
		double remainder = ajutine_main.Global.spiritJ2rel % ajutine_main.Global.spiritKuluPerHit;
		System.out.println("jääk on "+remainder);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if(remainder > 0) {
			if(ajutine_main.Global.spiritReserv == ajutine_main.Global.spiritReservAlguses) {} else {				
				ajutine_main.Global.spiritReserv = ajutine_main.Global.spiritReserv - remainder;
				ajutine_main.Global.adenaReserv = ajutine_main.Global.adenaReserv + ajutine_main.Global.spiritPrice * remainder;
				ajutine_main.Global.spiritJ2rel = ajutine_main.Global.spiritJ2rel - remainder;
				ajutine_main.Global.spiritKogusOsta = ajutine_main.Global.spiritKogusOsta - remainder;  
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
