package ssd_adena_input;

public class J2reldused {
	
	public static void start() {
		if(ajutine_main.Global.soulReserv / ajutine_main.Global.soulKuluPerHit > ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitSSD) {
			ajutine_main.Global.SSDHits = Math.floor(ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitSSD);
		} else {
			ajutine_main.Global.SSDHits = Math.floor(ajutine_main.Global.soulReserv / ajutine_main.Global.soulKuluPerHit);
		}
		ajutine_main.Global.SSDShots = ajutine_main.Global.SSDHits * ajutine_main.Global.SSDOutputAmount;
		ajutine_main.Global.cryDJ2rel = ajutine_main.Global.cryDReserv - ajutine_main.Global.SSDHits * ajutine_main.Global.cryDKuluPerHitSSD;
		ajutine_main.Global.soulJ2rel = ajutine_main.Global.soulReserv - ajutine_main.Global.SSDHits * ajutine_main.Global.soulKuluPerHit;
	}

}
