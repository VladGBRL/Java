import java.util.ArrayList;
import java.util.List;
public class Companie {
    private String nume;
    private List<Angajat> angajati;
    private Adresa adresa;

    public Companie(String nume,Adresa adresa) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
        this.adresa=adresa;
    }

    public String getNume() {
        return nume;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void adaugaAngajat(Angajat angajat) {

        angajati.add(angajat);
    }

    public Adresa getAdresa(){
        return adresa;
    }
    public void mutaAngajat(Angajat angajat, Companie nouaCompanie) {
        angajati.remove(angajat);
        angajat.setCompanie(nouaCompanie);
        nouaCompanie.adaugaAngajat(angajat);
        System.out.println("Angajatul " + angajat.getNume() + " a fost mutat la " + nouaCompanie.getNume() + ".");
    }


    public void afiseazaAdreseAngajatiLaAdresa(Adresa adresa) {
        System.out.println("Angajații care lucrează la adresa " + adresa + ":");
        for (Angajat angajat : angajati) {
            if (angajat.getCompanie().getAdresa().equals(adresa)) {
                System.out.println(angajat.getNume() + " - " + angajat.getAdresa());
            }
        }
    }


    public void gasesteCompanieSiAfiseazaAngajati(String numeCompanie) {
        System.out.println("Angajatii care lucreaza la compania " + numeCompanie + ":");
       for (Angajat angajat : angajati) {
           if (angajat.getCompanie().getNume().equals(numeCompanie)) {
               System.out.println("Angajatul " + angajat.getNume() + " lucreaza la compania " + numeCompanie);
            }
        }
    }

}
