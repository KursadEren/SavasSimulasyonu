package savas;
import java.util.Scanner;

public class Oyun {
    private Koloni koloni1;
    private Uret YenidenUret;
    
    

    public Oyun() {
    	
    	koloni1 = null;
        YenidenUret = new Uret();
    }

    public void OyunBaslat() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Boşluklu verileriler giriniz: ");
        String input = scanner.nextLine();
        scanner.close();
        int koloniCount = 0;
        String[] tokens = input.split(" ");
        koloniCount = tokens.length;
        Koloni[] koloni = Koloni.createKoloniler(input);
          
       
        int n = 1;

        while (true) {
        	
        	int activeColonies = 0;
         	 

            

            for (int i = 0; i < koloniCount; i++) {
                for (int j = i + 1; j < koloniCount; j++) {
                    if (koloni[i].getPopulasyon() > 0 && koloni[i].getYemekStogu() > 0 &&
                            koloni[j].getPopulasyon() > 0 && koloni[j].getYemekStogu() > 0) {
                    	
                        Ataktik yeniAtaktik = new Ataktik();
                        Btaktik yeniBtaktik = new Btaktik();
                        Taktik yeniTaktik = new Taktik();

                        yeniAtaktik.calculateATaktikGuc();
                        yeniBtaktik.calculateBtaktikGuc();
                        koloni[j].setGuc(yeniAtaktik.getATaktikGuc());
                        koloni[j].setGuc(yeniBtaktik.getBtaktikGuc());
                        yeniTaktik.Savas(koloni[i], koloni[j]);

                        // Bellekten temizleme
                        yeniAtaktik = null;
                        yeniBtaktik = null;
                        yeniTaktik = null;
                    }
                }
            }
            

          
            
           

            for (int i = 0; i < koloniCount; i++) {
                if (koloni[i].getPopulasyon() > 0 && koloni[i].getYemekStogu() > 0) {
                    
                    YenidenUret.EkleUret(koloni[i]);
                    TurSonuDeger(koloni[i]);

                    // Bellekten temizleme
                   
                }
            }
            
            
            System.out.println("Tur Sayisi " + n);
            System.out.println("-------------------------------------------------");
            System.out.println("Koloni  Populasyon   Yemek Stogu  kazanma   kaybetme\n");
          for (int i = 0; i < koloniCount; i++) {
              if (koloni[i].getPopulasyon() > 0 && koloni[i].getYemekStogu() > 0) {
                  System.out.printf("%-8c  %-11d  %-11d  %-8d  %-8d\n\n",
                          koloni[i].getSembol(), koloni[i].getPopulasyon(), koloni[i].getYemekStogu(),
                          koloni[i].getKazanma(), koloni[i].getKaybetme());
              } else {
                  System.out.printf("%-8c   --          --         --          -- \n\n",
                          koloni[i].getSembol());
                  
              }
          }
            
            
            
            activeColonies = 0;
       	 for (int i = 0; i < koloniCount; i++) {
             if (koloni[i].getPopulasyon() > 0 && koloni[i].getYemekStogu() > 0) {
                 activeColonies++;
             }
         }
       	 if(activeColonies==1) {
       		 for (int i = 0; i < koloniCount; i++) {
       		if (koloni[i].getPopulasyon() > 0 && koloni[i].getYemekStogu() > 0) {
                System.out.printf("kazanan: " + koloni[i].getSembol());
            }
       	   }
       		 break;
       	 }
       	 else if (activeColonies==0) {
       		 System.out.printf("\n -- Berabere --  \n Yemek Stokları bitti " );
       		 break;
       	 }
           
            
            
            
            
            
            

            n++;
          

        }
        	
        // Bellekten temizleme
        
       
    }

    private Koloni[] createKoloniler(String input, int koloniCount) {
        // TODO: Boşluktan ayrılmış verileri kullanarak kolonileri oluşturun ve geri döndürün.
        return null;
    }

    public void TurSonuDeger(Koloni koloni1) {
        koloni1.setPopulasyon(koloni1.getPopulasyon() + (koloni1.getPopulasyon() * 20 / 100));
        koloni1.setYemekStogu(koloni1.getYemekStogu() - (koloni1.getPopulasyon() * 2));
    }
    
   
}
