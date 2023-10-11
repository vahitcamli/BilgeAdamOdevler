package package1;

public abstract class UrunOzellikleri {
	private int fiyat;
	protected final int kargoTutari = 50;
	private int adet;
	
	public UrunOzellikleri(int fiyat,int adet) {
		super();
		this.fiyat = fiyat;
		this.adet = adet;
	}

	abstract void kirilirUrun();
	
	public void bedavaKargo() {
		int toplamFiyat = fiyat*adet;
		if( toplamFiyat>=300) {
			toplamFiyat	=	(fiyat*adet)-kargoTutari;
			System.out.println("Kargo Indirimi Yapildi");
			System.out.println("Eski Fiyat= "+fiyat*adet+" TL");
			System.out.println("Yeni Fiyat= "+toplamFiyat+" TL");
		}
		else {
			System.out.println("Kargo İndirimi Yapılmadı");
		}
		
	}
	
	
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public int getKargoTutari() {
		return kargoTutari;
	}

}
