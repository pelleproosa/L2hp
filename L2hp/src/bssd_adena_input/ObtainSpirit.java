package bssd_adena_input;

public class ObtainSpirit {
	
	public static void start() {
		while (ajutine_main.Global.spiritReserv / ajutine_main.Global.spiritKuluPerHit < ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitBSSD) { 
			//see on spiriti ostmine cryD liia korral
			double ostmine=Buy.start( ajutine_main.Global.spiritPrice, ajutine_main.Global.spiritLump, ajutine_main.Global.adenaReserv);
			ajutine_main.Global.spiritKogusOsta=ajutine_main.Global.spiritKogusOsta+ostmine;
			ajutine_main.Global.spiritReserv=ajutine_main.Global.spiritReserv+ostmine;
			ajutine_main.Global.adenaReserv=ajutine_main.Global.adenaReserv-ostmine*ajutine_main.Global.spiritPrice;
			System.out.println("Osta tuleb "+ajutine_main.Global.spiritKogusOsta+" kivikest.");
			System.out.println("Reservis on pärast ostu "+ajutine_main.Global.spiritReserv+" kivikest.");
			System.out.println("Adena pärast ostu on j2rel "+ajutine_main.Global.adenaReserv);
			System.out.println();
			if(ostmine==0) {
				break;
			}
		}
	}
	
}
