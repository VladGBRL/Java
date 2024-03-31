import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String nume;
    public Adresa adresa;
    public List<Persoana> invitati;

    public Hotel(String name, Adresa adress) {
        this.nume = name;
        this.adresa = adress;
        this.invitati = new ArrayList<>();
    }

    public void changeAddress(Adresa newAdress) {
        this.adresa = newAdress;
    }

    public void addInvitat(Persoana invitat) {
        invitati.add(invitat);
    }

    public void removeInvitat(Persoana invitat) {
        invitati.remove(invitat);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public List<Persoana> getInvitati() {
        return invitati;
    }

    public void setInvitati(List<Persoana> invitati) {
        this.invitati = invitati;
    }

    @Override
    public String toString() {
        return "Hotel: " + nume + ", Address: " + adresa.getStrada() + ", " + adresa.getOras();
    }

}
