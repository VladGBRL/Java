import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adresa adresa1 = new Adresa("123", "Craiova", "Romania");
        Adresa adresa2 = new Adresa("321", "Bucuresti", "Romania");

        Persoana persoana1 = new Persoana("Vlad", adresa1);
        Persoana persoana2 = new Persoana("Radu", adresa2);

        Companie companie1 = new Companie("Google",adresa1);
        Companie companie2 = new Companie("Microsoft",adresa2);

        Angajat angajat1 = new Angajat("Vlad",adresa1, companie1);
        Angajat angajat2 = new Angajat("Radu",adresa2, companie2);

        companie1.adaugaAngajat(angajat1);
        companie2.adaugaAngajat(angajat2);

        companie1.mutaAngajat(angajat1, companie2);

        companie2.afiseazaAdreseAngajatiLaAdresa(adresa2);

        companie2.gasesteCompanieSiAfiseazaAngajati("Microsoft");
    }
}
