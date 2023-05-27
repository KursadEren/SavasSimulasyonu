package savas;

import java.security.SecureRandom;


public class Uret {
    private Koloni UretKoloni;
    private int uretim;

    public Uret() {
        UretKoloni = null;
        uretim = 0;
    }

    public Koloni getUretKoloni() {
        return UretKoloni;
    }

    public int getUretim() {
        return uretim;
    }

    public void setUretKoloni(Koloni UretKoloni) {
        this.UretKoloni = UretKoloni;
    }

    public void setUretim(int uretim) {
        this.uretim = uretim;
    }

    public void duzUretim() {
    	SecureRandom rand = new SecureRandom();
        uretim = rand.nextInt(10) + 1;
    }

    public void EkleUret(Koloni UretKoloni1) {
        UretKoloni1.setYemekStogu(UretKoloni1.getYemekStogu() + UretKoloni1.getUretilmeOran());
    }
}
