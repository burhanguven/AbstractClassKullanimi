package nesneOdev3;

public class Daire extends Geometrik {

	private double yariCap;
	
	public Daire(String selikAdi,double yariCap) {
		super(selikAdi);
		this.yariCap=yariCap;
	}

	@Override
	public double alanHesapla() {
		
		return pi*yariCap*yariCap;
	}

}
