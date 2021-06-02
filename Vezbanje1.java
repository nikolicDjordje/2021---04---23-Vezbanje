/*Vezbanje1:
Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.*/

package domaci;

import java.util.Scanner;

public class DomaciKasa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double racun = 0;
		double naplataRacuna = 0;
		double cena = 0;
		double kusur = 0;
		int izadji = -1;
		
		while (izadji==-1) {
			System.out.println("0. Izlaz iz programa");
			System.out.println("1. Ubacivanje u potrosacku korpu");
			System.out.println("2. Naplata racuna");
			
			int izbor = sc.nextInt();
			
			switch (izbor) {
			case 0:
				System.out.println("Hvala sto ste koristili nase usluge! Dodjite nam ponovo!");
				izadji = 1;
				break;
			case 1:
				System.out.println("Unesite cenu proizvoda: ");
				cena = sc.nextDouble();
				racun = racun + cena;
				break;
			case 2:
					System.out.println("Unesite novcani iznos");
					naplataRacuna = sc.nextDouble();
					if (naplataRacuna < racun) {
					System.out.println("Nedovoljna kolicina novca");
					} else  {
						kusur = naplataRacuna - racun;
					System.out.println("Kusur iznosi: " + kusur);
					racun = 0;
					}
				break;
			}

		}

	}
}
