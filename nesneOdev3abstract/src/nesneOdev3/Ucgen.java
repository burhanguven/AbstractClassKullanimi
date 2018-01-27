package nesneOdev3;

public class Ucgen extends Geometrik{
	
	private double taban,yukseklik;
	
	
	public Ucgen(String selikAdi, double taban, double yukseklik) {
		super(selikAdi);
		this.taban=taban;
		this.yukseklik=yukseklik;		
	}
	
	@Override
	public double alanHesapla() {
		
		return yukseklik*taban;
	}
}
