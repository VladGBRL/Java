public class Turist extends Persoana{
    private Hotel hotelCurent;

    public Turist(String nume, Adresa adresa) {
        super(nume, adresa);
    }

    public void mutaHotel(Hotel hotelNou) {
        this.hotelCurent = hotelNou;
    }

    public Hotel getHotelCurent() {
        return hotelCurent;
    }

    public void setHotelCurent(Hotel hotel) {
        this.hotelCurent = hotel;
    }
    @Override
    public String toString() {
        return "Turist: " + getNume();
    }
}
