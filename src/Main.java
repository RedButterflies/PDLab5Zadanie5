public class Main {
    public static void main(String[] args) {
        System.out.println("Samochod1 - konstruktor1");
        Samochod samochod1 = new Samochod();
        System.out.println();
        System.out.println();
        System.out.println();
        samochod1.oSamochodzie();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Samochod2 - konstruktor2");
        Samochod samochod2= new Samochod("Jeep","Gladiator","spersonalizowane","czerwony","2022",350);
        samochod2.oSamochodzie();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Samochod osobowy ");
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        samochodOsobowy.oSamochodzie();
    }
}