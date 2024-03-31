public class Persoana {
    private String nume;
    private Adresa adresa;

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }
    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

}
