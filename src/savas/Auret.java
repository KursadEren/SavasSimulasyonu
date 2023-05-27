package savas;

import java.security.SecureRandom;


public class Auret extends Uret {
    private int uretim;

    public Auret() {
        super();
        uretim = 0;
    }

    public int getUretim() {
        return uretim;
    }

    public void setUretim(int uretim) {
        this.uretim = uretim;
    }
    protected int AtipiUretim() {
    	SecureRandom rand = new SecureRandom();
        int sayi = rand.nextInt(2) + 1;
        return sayi;
    }
    
    public void CalculateUretim() {
    	Uret uretim1 = new Uret();
    	uretim = uretim1.getUretim() * AtipiUretim();
    }
    
    public int AuretimGetir() {
        return uretim;
    }
}
