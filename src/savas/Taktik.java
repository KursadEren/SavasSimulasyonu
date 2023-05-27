package savas;
import java.security.SecureRandom;

public class Taktik {
    private int value;
    
    
    public Taktik() {
        value = TaktikGuc();
        
    }
    
    public void Savas(Koloni koloni1, Koloni koloni2) {
        int fark = koloni1.getGuc() - koloni2.getGuc();

        if (fark > 0) {
           
            koloni2.setPopulasyon(koloni2.getPopulasyon() - (koloni2.getPopulasyon() * 1000 / fark) / 100);
            koloni1.setYemekStogu(koloni1.getYemekStogu() + (koloni2.getYemekStogu() * 1000 / fark) / 100);
            koloni2.setYemekStogu(koloni2.getYemekStogu() - (koloni2.getYemekStogu() * 1000 / fark) / 100);
            koloni1.setKazanma(koloni1.getKazanma() + 1);
            koloni2.setKaybetme(koloni2.getKaybetme() + 1);
        } else if (fark < 0) {
           
            koloni1.setPopulasyon(koloni1.getPopulasyon() - (koloni1.getPopulasyon() * (1000 / (-fark))) / 100);
            koloni2.setYemekStogu(koloni2.getYemekStogu() + (koloni1.getYemekStogu() * 1000 / (-fark)) / 100);
            koloni1.setYemekStogu(koloni1.getYemekStogu() - (koloni1.getYemekStogu() * (1000 / (-fark))) / 100);
            koloni1.setKaybetme(koloni1.getKaybetme() + 1);
            koloni2.setKazanma(koloni2.getKazanma() + 1);
        } else if (fark == 0) {
            
            if (koloni1.getPopulasyon() > koloni2.getPopulasyon()) {
                koloni2.setPopulasyon(koloni2.getPopulasyon() - (koloni2.getPopulasyon() * 5) / 100);
                koloni1.setYemekStogu(koloni1.getYemekStogu() + (koloni2.getYemekStogu() * 10) / 100);
                koloni2.setYemekStogu(koloni2.getYemekStogu() - (koloni2.getYemekStogu() * 10) / 100);
                koloni1.setKazanma(koloni1.getKazanma() + 1);
                koloni2.setKaybetme(koloni2.getKaybetme() + 1);
            } else if (koloni1.getPopulasyon() < koloni2.getPopulasyon()) {
                koloni1.setPopulasyon(koloni1.getPopulasyon() - (koloni1.getPopulasyon() * 5) / 100);
                koloni2.setYemekStogu(koloni2.getYemekStogu() + (koloni1.getYemekStogu() * 10) / 100);
                koloni1.setYemekStogu(koloni1.getYemekStogu() - (koloni1.getYemekStogu() * 10) / 100);
                koloni1.setKaybetme(koloni1.getKaybetme() + 1);
                koloni2.setKazanma(koloni2.getKazanma() + 1);
            } else {
               
            	
            	 SecureRandom rand = new SecureRandom();
                int rastgele = rand.nextInt(2); // 0  1
                if (rastgele == 0) {
                    koloni2.setPopulasyon(koloni2.getPopulasyon() - (koloni2.getPopulasyon() * 5) / 100);
                    koloni1.setYemekStogu(koloni1.getYemekStogu() + (koloni2.getYemekStogu() * 10) / 100);
                    koloni2.setYemekStogu(koloni2.getYemekStogu() - (koloni2.getYemekStogu() * 10) / 100);
                    koloni1.setKaybetme(koloni1.getKaybetme() + 1);
                    koloni2.setKazanma(koloni2.getKazanma() + 1);
                } else if (rastgele == 1) {
                    koloni1.setPopulasyon(koloni1.getPopulasyon() - (koloni1.getPopulasyon() * 5) / 100);
                    koloni2.setYemekStogu(koloni2.getYemekStogu() + (koloni1.getYemekStogu() * 10) / 100);
                    koloni1.setYemekStogu(koloni1.getYemekStogu() - (koloni1.getYemekStogu() * 10) / 100);
                    koloni1.setKaybetme(koloni1.getKaybetme() + 1);
                    koloni2.setKazanma(koloni2.getKazanma() + 1);
                }
            }
        }
    }
    
    private int TaktikGuc() {
    	SecureRandom rand = new SecureRandom();
        int sayi = rand.nextInt(1000) + 1;
        return sayi;
    }
    public int getValue() {
        return value;
    }
}
