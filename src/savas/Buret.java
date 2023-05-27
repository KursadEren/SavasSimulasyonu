package savas;

import java.security.SecureRandom;

public class Buret extends Uret {
    private int uretim;

    public Buret() {
        uretim = 0;
    }

    public int getBUretim() {
        return uretim;
    }

    public void calculateBUretim() {
        Uret yeniUret = new Uret();
        int sayi2 = BtipiUretim();
        uretim = yeniUret.getUretim() * sayi2;
    }

    private int BtipiUretim() {
    	SecureRandom rand = new SecureRandom();
        return rand.nextInt(6) + 5;
    }
}
