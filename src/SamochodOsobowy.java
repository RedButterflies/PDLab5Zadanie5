import java.util.Scanner;

public class SamochodOsobowy extends Samochod{
    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;


    public SamochodOsobowy(double waga, double pojemnoscSilnika, int iloscOsob) {
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, String rokProdukcji, double przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public SamochodOsobowy() {
        System.out.println("Wprowadz dane samochodu osobowego: ");
        System.out.println("Wprowadz  wage samochodu w tonach: ");
        Scanner swaga = new Scanner(System.in);
        double wagax = swaga.nextDouble();
        if(wagax <2 || wagax>4.5)
        {
            System.out.println("Wprowadzono nieprawidlowa wage, waga powinna sie zawierac w zakresie od 2 ton do 4,5 tony");
        }
        else {
            this.waga = wagax;

        }
        System.out.println("Wprowadz pojemnosc silnika: ");
        Scanner spojemnoscSilnika = new Scanner(System.in);
        double pojemnoscX = spojemnoscSilnika.nextDouble();
        if(pojemnoscX<0.8 || pojemnoscX>3.0)
        {
            System.out.println("Wprowadzono niepoprawna pojemnosc silnika, powinna sie ona zawiercc w przedziale od 0,8 do 3,0");
            System.out.println("Sprobuj ponownie z prawidlowa wartoscia");
        }
        else{
            this.pojemnoscSilnika = pojemnoscX;
        }
        System.out.println("Wprowadz ile osob moze zmiescic sie w samochodzie: ");
        Scanner siloscOsob = new Scanner(System.in);
        this.iloscOsob = siloscOsob.nextInt();
    }

    @Override
    public void oSamochodzie() {
        System.out.println("INFORMACJE O SAMOCHODZIE OSOBOWYM");
        super.oSamochodzie();
        System.out.println("Waga: "+waga+"t");
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika);
        System.out.println("Ilosc osob: "+iloscOsob);
    }
}
