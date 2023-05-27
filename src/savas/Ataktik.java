package savas;
import java.security.SecureRandom;


public class Ataktik extends Taktik {
    private int SaldiriGucu;
    private int SavunmaGucu;
    private int yeniGuc;

    public Ataktik() {
        super();
        SaldiriGucu = 0;
        SavunmaGucu = 0;
        yeniGuc = 0;
    }

    public int getSaldiriGucu() {
        return SaldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        SaldiriGucu = saldiriGucu;
    }

    public int getSavunmaGucu() {
        return SavunmaGucu;
    }

    public void setSavunmaGucu(int savunmaGucu) {
        SavunmaGucu = savunmaGucu;
    }

    public int getATaktikGuc() {
        return yeniGuc;
    }

    
    protected int TaktikGuc() {
    	SecureRandom rand = new SecureRandom();
        int slsayi = rand.nextInt(10) + 1;
        int svsayi = rand.nextInt(5) + 1;
        int gonder = (slsayi + svsayi) * 2;
        return gonder;
    }

    public void calculateATaktikGuc() {
        Taktik taktik = new Taktik();
        yeniGuc = taktik.getValue() * TaktikGuc();
    }
}
