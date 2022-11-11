import java.util.Scanner;

public class Samochod {
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private String rokProdukcji;
    private double przebieg;

    public Samochod() {
        System.out.println("Wprowadz dane o samochodzie");
        System.out.println("Wprowadz marke samochodu: ");
        Scanner smarka = new Scanner(System.in);
        this.marka = smarka.next().toString();
        System.out.println("Wprowadz model samochodu: ");
        Scanner smodel = new Scanner(System.in);
        this.model = smodel.next().toString();
        System.out.println("Wprowadz rodzaj nadwozia: ");
        Scanner snadwozie = new Scanner(System.in);
        this.nadwozie = snadwozie.next().toString();
        System.out.println("Wprowadz kolor samochodu: ");
        Scanner skolor = new Scanner(System.in);
        this.kolor = skolor.next().toString();
        System.out.println("Wprowadz rok produkcji: ");
        Scanner srokProdukcji = new Scanner(System.in);
        this.rokProdukcji = srokProdukcji.next().toString();
        System.out.println("Wprowadz przebieg samochodu: ");
        Scanner sprzebieg = new Scanner(System.in);
        double przebiegx = sprzebieg.nextDouble();
        if (przebiegx >= 0) {
            this.przebieg = przebiegx;
        }
        else {
            System.out.println("Przebieg nie moze byc ujemny, sprobuj ponownie");
        }
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, String rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }
    public void oSamochodzie()
    {
        System.out.println("INFORMACJE O SAMOCHODZIE");
        System.out.println("Marka: "+ marka);
        System.out.println("Model: "+model);
        System.out.println("Nadwozie: "+nadwozie);
        System.out.println("Kolor: "+ kolor);
        System.out.println("Rok produkcji: "+rokProdukcji);
        System.out.println("Przebieg: "+przebieg);

    }
}
