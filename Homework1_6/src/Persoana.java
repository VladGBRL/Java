public class Persoana {
    private String name;
    private Adresa adresa;

    public Persoana(String name, Adresa adresa){
        this.name=name;
        this.adresa = adresa;
    }
    public void setAddress(Adresa adresa) {

        this.adresa = adresa;
    }
    public String getName() {

        return name;
    }

    public Adresa getAddress() {

        return adresa;
    }
}
