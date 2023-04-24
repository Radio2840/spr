import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Uczen nie = new Uczen("test","test");
        ListaUczniow listaUczniow = new ListaUczniow();
        listaUczniow.dodaj("Kinga","Smolarek");
        listaUczniow.dodaj("tak","nie");
        listaUczniow.dodaj("eo","eo");
        Scanner od_uz = new Scanner(System.in);
        String imie;
        String nazwisko;
        for(int i=1;i<=5;i++){

           System.out.println("Podaj imie: "+ i +" ucznia");
           imie = od_uz.next();
           System.out.println("Podaj nazwisko: "+ i +" ucznia");
           nazwisko = od_uz.next();
           listaUczniow.dodaj(imie,nazwisko);
        }
        listaUczniow.wyswietl();
        listaUczniow.losuj(1);
        listaUczniow.losuj(3);

        Comparator<Uczen> uczenComparator = new Comparator<Uczen>() {
            @Override
            public int compare(Uczen o1, Uczen o2) {
                return 0;
            }
        };

        Consumer<Uczen> uczenConsumer = (u)->{if( nie.getNazwisko().length()%2==0) System.out.println(true);};
    }
}