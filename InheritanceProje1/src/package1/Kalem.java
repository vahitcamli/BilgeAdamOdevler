package package1;

public class Kalem extends UrunOzellikleri{

	public Kalem(int fiyat, int adet) {
		super(fiyat, adet);
		// TODO Auto-generated constructor stub
	}

	@Override
	void kirilirUrun() {
			System.out.println("Bu ürün Kirilmaz");		
	}

}
