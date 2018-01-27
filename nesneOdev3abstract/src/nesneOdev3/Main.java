package nesneOdev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ucgen ucgen=new Ucgen("Ucgen", 5, 5);
		Kare kare=new Kare("Kare", 7);
		Dikdortgen dikdortgen=new Dikdortgen("Dikdortgen",8,10);
		Yamuk yamuk=new Yamuk("Yamuk", 5, 5, 10);
		Daire daire=new Daire("Daire", 3);
		
		System.out.println("========ABSTRACT========");
		System.out.println(ucgen.sekilAdi+": "+ucgen.alanHesapla());
		System.out.println(kare.sekilAdi+": "+kare.alanHesapla());
		System.out.println(dikdortgen.sekilAdi+" "+dikdortgen.alanHesapla());
		System.out.println(yamuk.sekilAdi+": "+yamuk.alanHesapla());
		System.out.println(daire.sekilAdi+": "+daire.alanHesapla());
	}

}
