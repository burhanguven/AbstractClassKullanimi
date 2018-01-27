package nesneOdev3;

public abstract class Geometrik {
	
	String sekilAdi;
	public double pi=3.14;
	
	public Geometrik(String selikAdi)
	{
		this.sekilAdi=selikAdi;
	}
	
	public abstract double alanHesapla();
}
