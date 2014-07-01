package ssd_adena_input;

public class Buy {

	public static double start(double price, double lump, double adena){
		System.out.println("toimub kauplemine");
		double ostmine = 0;
		if(adena-price*lump>=0) {
			ostmine++;
			ostmine=ostmine*lump;
			adena=adena-price*lump;
			System.out.println("ost õnnestus");
		};
		return ostmine;
	}
	
}
