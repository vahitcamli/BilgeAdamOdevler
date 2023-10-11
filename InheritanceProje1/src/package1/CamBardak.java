package package1;

public class CamBardak extends UrunOzellikleri{

	public CamBardak(int fiyat, int adet) {
		super(fiyat, adet);
		// TODO Auto-generated constructor stub
	}

	@Override
	void kirilirUrun() {
		System.out.println("Ben Kirilirim, O yüzden Iadem yoktur");
	}
	
}
