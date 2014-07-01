package ssd_adena_input;

public class ObtainCryD {
	
	public static void start() {
		double lollus = ( ajutine_main.Global.soulReserv / ajutine_main.Global.soulKuluPerHit ) / (ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitSSD);
		System.out.println("See on lollus: "+lollus);
		System.out.println("See on soulReserv: "+ajutine_main.Global.soulReserv);
		System.out.println("See on soulKuluPerHit: "+ajutine_main.Global.soulKuluPerHit);
		System.out.println("See on cryDReserv: "+ajutine_main.Global.cryDReserv);
		System.out.println("See on cryDKuluPerHit: "+ajutine_main.Global.cryDKuluPerHitSSD);
		
		while (ajutine_main.Global.soulReserv / ajutine_main.Global.soulKuluPerHit > ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitSSD) { 
			//see on cryD ostmine souli liia korral
			double ostmine=Buy.start( ajutine_main.Global.cryDPrice, ajutine_main.Global.cryDLump, ajutine_main.Global.adenaReserv);
			ajutine_main.Global.cryDKogusOsta=ajutine_main.Global.cryDKogusOsta+ostmine;
			ajutine_main.Global.cryDReserv=ajutine_main.Global.cryDReserv+ostmine;
			ajutine_main.Global.adenaReserv=ajutine_main.Global.adenaReserv-ostmine*ajutine_main.Global.cryDPrice;
			System.out.println("Osteti "+ajutine_main.Global.cryDKogusOsta+" kristalli.");
			System.out.println("Reservis on pärast ostu "+ajutine_main.Global.cryDReserv+" kristalli.");
			System.out.println("Adena pärast ostu on j2rel "+ajutine_main.Global.adenaReserv);
			System.out.println();
			if(ostmine==0) {
				break;
			}
		}
	}

}
