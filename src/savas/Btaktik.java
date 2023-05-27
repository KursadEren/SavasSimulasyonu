package savas;

import java.security.SecureRandom;

public class Btaktik extends Taktik {
    private int SaldiriGucu;
    private int SavunmaGucu;
    private int BtaktikGuc;

    public Btaktik() {
        super();
        SaldiriGucu = 0;
        SavunmaGucu = 0;
        BtaktikGuc = 0;
    }

    public int getSaldiriGucu() {
        return SaldiriGucu;
    }

    public int getSavunmaGucu() {
        return SavunmaGucu;
    }

    public int getBtaktikGuc() {
        return BtaktikGuc;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        SaldiriGucu = saldiriGucu;
    }

    public void setSavunmaGucu(int savunmaGucu) {
        SavunmaGucu = savunmaGucu;
    }

    public void calculateBtaktikGuc() {
    	Taktik taktik = new Taktik();
    	BtaktikGuc = taktik.getValue() + BTaktik();
    }

    private int BTaktik() {
    	SecureRandom rand = new SecureRandom();
        return rand.nextInt(10) + 1;
    }
}
