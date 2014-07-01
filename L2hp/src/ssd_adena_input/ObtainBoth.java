package ssd_adena_input;

public class ObtainBoth {
	
	public static void start() {
		while (ajutine_main.Global.adenaReserv >= ajutine_main.Global.cryDPrice * ajutine_main.Global.cryDLump + ajutine_main.Global.soulPrice * ajutine_main.Global.cryDKuluPerHitSSD) {
			System.out.println("Otsustati lammutada veel kindaid ja osta kivikesi juurde");
			ajutine_main.Global.cryDKogusOsta=ajutine_main.Global.cryDKogusOsta+ajutine_main.Global.cryDLump;
			ajutine_main.Global.cryDReserv=ajutine_main.Global.cryDReserv+ajutine_main.Global.cryDLump;
			ajutine_main.Global.adenaReserv=ajutine_main.Global.adenaReserv-ajutine_main.Global.cryDLump*ajutine_main.Global.cryDPrice;
			
			while (ajutine_main.Global.soulReserv / ajutine_main.Global.soulKuluPerHit < ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitSSD) { 
				//see on souli ostmine cryD liia korral
				double ostmine=Buy.start( ajutine_main.Global.soulPrice, ajutine_main.Global.soulLump, ajutine_main.Global.adenaReserv);
				ajutine_main.Global.soulKogusOsta=ajutine_main.Global.soulKogusOsta+ostmine;
				ajutine_main.Global.soulReserv=ajutine_main.Global.soulReserv+ostmine;
				ajutine_main.Global.adenaReserv=ajutine_main.Global.adenaReserv-ostmine*ajutine_main.Global.soulPrice;
				System.out.println("Osta tuleb "+ajutine_main.Global.soulKogusOsta+" kivikest.");
				System.out.println("Reservis on pärast ostu "+ajutine_main.Global.soulReserv+" kivikest.");
				System.out.println("Adena pärast ostu on j2rel "+ajutine_main.Global.adenaReserv);
				System.out.println();
				if(ostmine==0) {
					break;
				}
			}
		}
	}

}