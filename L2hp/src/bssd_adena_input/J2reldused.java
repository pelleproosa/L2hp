package bssd_adena_input;

public class J2reldused {
	
	public static void start() {
		if(ajutine_main.Global.spiritReserv / ajutine_main.Global.spiritKuluPerHit > ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitBSSD) {
			ajutine_main.Global.BSSDHits = Math.floor(ajutine_main.Global.cryDReserv / ajutine_main.Global.cryDKuluPerHitBSSD);
		} else {
			ajutine_main.Global.BSSDHits = Math.floor(ajutine_main.Global.spiritReserv / ajutine_main.Global.spiritKuluPerHit);
		}
		ajutine_main.Global.BSSDShots = ajutine_main.Global.BSSDHits * ajutine_main.Global.BSSDOutputAmount;
		ajutine_main.Global.cryDJ2rel = ajutine_main.Global.cryDReserv - ajutine_main.Global.BSSDHits * ajutine_main.Global.cryDKuluPerHitBSSD;
		ajutine_main.Global.spiritJ2rel = ajutine_main.Global.spiritReserv - ajutine_main.Global.BSSDHits * ajutine_main.Global.spiritKuluPerHit;
	}

}
