	package savas;
	
	public class Koloni {
		
		
		private int populasyon;
	    private int yemekStogu;
	    private char sembol;
	    private int guc;
	    private int kazanma;
	    private int kaybetme;
	    private int UretilmeOran;
	    
	    public Koloni(int populasyon, int yemekStogu, char sembol, int guc, int kazanma, int kaybetme, int uretimOran) 
	    {
	    	this.populasyon = populasyon;
	        this.yemekStogu = yemekStogu;
	        this.sembol = sembol;
	        this.guc = guc;
	        this.kazanma = kazanma;
	        this.kaybetme = kaybetme;
	        this.UretilmeOran = uretimOran;
	       
	    }
	    
	    public static Koloni[] createKoloniler(String input ) {
	        String[] tokens = input.split(" ");
	        int koloniCount = tokens.length;
	        Koloni[] koloniler = new Koloni[koloniCount];
	        char sembol = 'A';

	        for (int i = 0; i < koloniCount; i++) {
	            int populasyon = Integer.parseInt(tokens[i]);
	            int yemekStogu = populasyon * populasyon;
	            koloniler[i] = new Koloni(populasyon, yemekStogu, sembol++, 0, 0, 0, 0);
	        }

	        return koloniler;
	    }


	    
	    public static String[] okuStringDizi(String girdi) {
	        String[] dizi = girdi.split(" ");
	        return dizi;
	    }
	    public static int sayiAdetiniHesapla(String girdi) {
	        String[] dizi = girdi.split(" ");
	        return dizi.length;
	    }
	    public int getPopulasyon() {
	        return populasyon;
	    }
	
	    public int getYemekStogu() {
	        return yemekStogu;
	    }
	
	    public char getSembol() {
	        return sembol;
	    }
	
	    public int getGuc() {
	        return guc;
	    }
	
	    public int getKazanma() {
	        return kazanma;
	    }
	
	    public int getKaybetme() {
	        return kaybetme;
	    }
	
	    public int getUretilmeOran() {
	        return UretilmeOran;
	    }
	    
	    public void setPopulasyon(int populasyon) {
	        this.populasyon = populasyon;
	    }
	    
	    public void setYemekStogu(int yemekStogu) {
	        this.yemekStogu = yemekStogu;
	    }
	    
	    public void setKazanma(int kazanma) {
	        this.kazanma = kazanma;
	    }
	    
	    public void setKaybetme(int kaybetme) {
	        this.kaybetme = kaybetme;
	    }
	    
	    public void setUretilmeOran(int uretilmeOran) {
	        this.UretilmeOran = uretilmeOran;
	    }
	    public void setGuc(int Guc) {
	        this.guc = Guc;
	    }
	
	    public void destroyColony() {
	        
	    }
	
	}
