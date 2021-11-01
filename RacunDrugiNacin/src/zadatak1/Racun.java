package zadatak1;

public class Racun {

	//ovi nizovima nam sluze za funkcionisanje metoda
	String[]  nazivArtikla;
	double[]  jedinicnaCena;
	int[]  kolicina;
	NacinPlacanja  nacinPlacanja;
	int brojRacuna;
	
	
	private int brojArtikala;
	
	static int brojacRacuna = 0;
	
	Racun(int brojArtikala){ //ubaci sam broj artikala za svaki objekat koji pravis preko ovog konstruktora koliko hoces
		brojacRacuna=brojacRacuna + 1;
       brojRacuna=brojacRacuna;
       nazivArtikla=new String[brojArtikala];//kreiramo niz nazivArtikla
       jedinicnaCena=new double[brojArtikala];//_||_ 
       kolicina = new int[brojArtikala];
       NacinPlacanja nacinPlacanja = NacinPlacanja.KARTICA;
       // u memoriji smo kreirali 3 niza
	}

	// ovaj konstruktor pravi objekat koji nam sluzi
	//za prikaz raznih racuna
	
	
	
	double izracunajIznos() {
		
		double iznos=0; // jedinicnaCena1*kolicina1 + jedinicnaCena2*kolicina2 + jedinicnaCena3*kolicina3;
		for( int i=0; i<nazivArtikla.length; i++) {
			iznos=iznos+jedinicnaCena[i]+kolicina[i];
			
		}
		
		return iznos;
		}
	
	
	
	double izracunajKusur(double uplacenIznos) {
		return uplacenIznos-izracunajIznos();
	}
	
	double izracunajProsecnuCenuArtikla() {
		double prosecnaCena = 0;//(jedinicnaCena1+jedinicnaCena2+jedinicnaCena3)/3.0;
		for(  int i=0; i<nazivArtikla.length; i++) {
			//u svakom nizu je isto el. pa je svj
			
			prosecnaCena=prosecnaCena+jedinicnaCena[i];
			return prosecnaCena/jedinicnaCena.length;
		}
		
		
		
		return prosecnaCena;
	}
	
	double izracunajUkupanPorez() {
		double porez = izracunajIznos() / 1.2;
		return porez;
	}
  
	
	boolean daLiJeBesplatnaIsporuka() {
		double iznos = izracunajIznos();
		
		
		if(iznos>3000) {
			return true;
		}else {
			return false;
		}
	}
	
	
	boolean nagradnaIgra() {
		double slucajniBroj = Math.random();
		if(slucajniBroj>0.5) { 
			return true;
		}
		return false;
	}
	
	
	static void prikaziRacun(Racun racun) {
		System.out.println("Broj racuna je  " + racun.brojRacuna);
		System.out.println("ARTIKLI: ");
		for( int i=0; i<racun.nazivArtikla.length; i++) {
			System.out.println(i+1 +  ")   "+ racun.nazivArtikla[i]+ "  " + racun.kolicina[i]  +  "   " + racun.jedinicnaCena[i]);
		}
	//	System.out.println("Artikal1: " + racun.nazivArtikla1+ "  " + racun.kolicina1  +  "   " + racun.jedinicnaCena1);
	//	System.out.println("Artikal2: " + racun.nazivArtikla2 + "  " + racun.kolicina2 + "    "  +  racun.jedinicnaCena2);
	//	System.out.println("Artikal3: " + racun.nazivArtikla3 + "   "+ racun.kolicina3 + "   "+  racun.jedinicnaCena3);
		System.out.println("Nacin placanja:" + racun.nacinPlacanja);
		double iznos = racun.izracunajIznos();
		System.out.println("Iznos racuna je:  " + iznos);
	    System.out.println("Kusur: " + racun.izracunajKusur(2000));
	    double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		System.out.println("Prosecna cena artikala je: " + prosecnaCena);
		System.out.println("Ukupan porez je:  "+ racun.izracunajUkupanPorez());
		if(racun.daLiJeBesplatnaIsporuka()) {  
			System.out.println("Besplatna isporuka");
			
		}else {
			System.out.println("Nije besplatna isporuka");
		}
		
		if(racun.nagradnaIgra()) {
			System.out.println("Cestitamo, vi ste srecni dobitnik!");
		}
		
		
		
		
	}
	
	
	
	
	static Racun kreirajRacun(String[] naziv, double[] cena, int[] kolicina) {
		//vraca Racun
Racun racun = new Racun(4); // mora unutra br. artikala tipa int
//prvim objekat noviRacun od 4 artikla preko konstruktora Racun()
		
	
     

racun.nazivArtikla=naziv;
racun.jedinicnaCena=cena;
racun.kolicina=kolicina;
		
//upisujemo vrednosti iz zagrade u nase nizove nase nizove
//koje smo ovde gore nazvali       

return racun;
	}//ova metoda je sablon(parametri i svi elementi naziv, cena, kolicina
	//da ubacimo ono sto zelimo
	
	
	
	
	
	
	
	
}
