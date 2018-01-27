package nesneOdev3;

public class Yamuk extends Geometrik{
	
	private double taban,tavan,yukseklik;
	
	public Yamuk(String selikAdi,double taban,double tavan,double yukseklik) {
		super(selikAdi);
		this.taban=taban;
		this.tavan=tavan;
		this.yukseklik=yukseklik;
	}

	@Override
	public double alanHesapla() {

		return ((taban+tavan)*yukseklik)/2;
	}

}
