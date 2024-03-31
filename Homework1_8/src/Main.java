public class Main {
    public static void main(String[] args) {

        Adresa adresa1 = new Adresa("Emil", "Craiova", "Romania");
        Adresa adresa2 = new Adresa("Calea Bucuresti", "Bucuresti", "Romania");

        Hotel hotel1 = new Hotel("Hotel Dragut", adresa1);
        Hotel hotel2 = new Hotel("Hotel Frumos", adresa2);

        Persoana persoana1 = new Persoana("Vlad", adresa1);
        Persoana persoana2 = new Persoana("Roxi", adresa2);

        Turist turist1 = new Turist("Cristi", adresa1);
        Turist turist2 = new Turist("Darius", adresa2);

        hotel1.addInvitat(persoana1);
        hotel2.addInvitat(persoana2);
        hotel1.addInvitat(turist1);
        hotel2.addInvitat(turist2);


        hotel1.removeInvitat(turist1);
        hotel2.addInvitat(turist1);
        turist1.mutaHotel(hotel2);
        System.out.println("Turistul Cristi a fost mutat de la Hotel Dragut la Hotel Frumos.");

        Oras oras1 = new Oras("Pitesti");

        oras1.addHotel(hotel1);
        oras1.addHotel(hotel2);

        System.out.println("Hoteluri in Orasul1: " + oras1.getHotels());
        System.out.println("Turisti in hotelurile Orasului1: " + oras1.getTouristsInHotels());
        System.out.println("Este Vlad acomodat in unele hoteluri din Orasul1? " + oras1.isPersonAccommodated(persoana1));
        System.out.println("Este Roxi acomodata in unele hoteluri din Orasul1?  " + oras1.isPersonAccommodated(persoana2));
    }
}
