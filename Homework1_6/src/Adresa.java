public class Adresa {
    private String street;
    private String city;

    public Adresa(String street, String city){
        this.street=street;
        this.city=city;
    }
    @Override
    public String toString() {
        return street+ ", " + city;
    }
}
