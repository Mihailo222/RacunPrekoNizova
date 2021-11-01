package zadatak1;

public class TestRacun {
	public static void main(String[] args) {
		// ove vrednosti hocemo da ubacimo u nizove
		String[] naziv = new String[] { "keks", "kola", "bombone", "lanene plocice"};
		double[] cena=new double[] {100, 200, 300, 400};
		int[]  kolicina=new int[] {1, 2, 3, 4};
		
		
		
		
		//kreiraj objekat racun i u njega upisi vrednost metode kreirajRacun	
	//1. metoda koja kreira racun 
	Racun racun= Racun.kreirajRacun(naziv ,cena, kolicina);
	
 //OBJEKAT RACUN JE NASTAO SABIRANJEM NIZOVA

  //2. metoda za prikaz racuna
	//vrednosti nizova ovih gore(parametri tamo u Racunu) ubaciti u SABLONE iz metode Racun
	Racun.prikaziRacun(racun);//ulazni parametar je objekat racun
		
		System.out.println("---------------------------------");
		Racun noviRacun=new Racun(3);//kreiranje objekta noviRacun preko konstr.Racun
		// ovo je kreiralo i one nizove za koje je zaduzen konstruktor...
		
	
		
		
		noviRacun.nazivArtikla = naziv;
		noviRacun.jedinicnaCena = cena;
		noviRacun.kolicina = kolicina;
		
		
		Racun.prikaziRacun(noviRacun);
		
	}

}
