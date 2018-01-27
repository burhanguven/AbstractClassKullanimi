package nesneOdev3;

public class Kare extends Geometrik{
	
	private double kenar;
	
	public Kare(String selikAdi,double kenar) {
		super(selikAdi);
		this.kenar=kenar;
	}
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar;
	}

}
