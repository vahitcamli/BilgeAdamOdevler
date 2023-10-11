package package1;

public class Kupa extends UrunOzellikleri
{
	public Kupa(int fiyat,int adet) {
		super(fiyat, adet);
		// TODO Auto-generated constructor stub
	}

	@Override
	void kirilirUrun() {
		System.out.println("Bu ürün Kirilmaz");
		
	}
	
}
