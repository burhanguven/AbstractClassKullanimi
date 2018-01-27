package nesneOdev3;

public class Dikdortgen extends Geometrik{
	
	private double taban,yukseklik;
	
	public Dikdortgen(String selikAdi,double taban,double yukseklik) {
		super(selikAdi);
		this.taban=taban;
		this.yukseklik=yukseklik;
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return 2*(taban+yukseklik);
	}

}
