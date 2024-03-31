public class Profesor extends Persoana {
    private String specialization;
    public Profesor(String name, Adresa adresa, String specialization){
        super(name, adresa);
        this.specialization=specialization;
    }
    public void changeAddress(Adresa newAdresa) {
        setAddress(newAdresa);
    }
    public String getName() {

        return super.getName();
    }

    public Adresa getAddress() {

        return super.getAddress();
    }

    public String getSpecialization() {

        return specialization;
    }
}
