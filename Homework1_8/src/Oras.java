import java.util.List;
import java.util.ArrayList;

public class Oras {
    public String nume;
    public List<Hotel> hoteluri;

    public Oras(String name) {

        this.nume = name;
        this.hoteluri = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hoteluri.add(hotel);
    }

    public List<Turist> getTouristsInHotels() {
        List<Turist> turisti = new ArrayList<>();
        for (Hotel hotel : hoteluri) {
            for (Persoana invitati : hotel.getInvitati()) {
                if (invitati instanceof Turist) {
                    turisti.add((Turist) invitati);
                }
            }
        }
        return turisti;
    }

    public boolean isPersonAccommodated(Persoana persoana) {
        for (Hotel hotel : hoteluri) {
            if (hotel.getInvitati().contains(persoana)) {
                return true;
            }
        }
        return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Hotel> getHotels() {
        return hoteluri;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hoteluri = hotels;
    }

    @Override
    public String toString() {
        return "City: " + nume;
    }
}
