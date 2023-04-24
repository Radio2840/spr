import java.util.Objects;

/**

 Klasa tworzy obiekt Uczen zawierające pola id, Imie, Nazwisko

 id : int, pole jest autoinprementowalne
 nazwisko: string, pole przechowujace nazwisko
 imie: string, pole przechowuje imie

 @author: Kinga Smolarek

 **/



public class Uczen {
    private String imie;
    private String nazwisko;
    static int id=1;

    public Uczen(String imie, String nazwisko) {
        id=id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Uczen kopiuj_ucznia(Uczen o){
        String i= o.imie;
        String n= o.nazwisko;
        id++;
        return  new Uczen(i, n);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczen uczen)) return false;
        return Objects.equals(getImie(), uczen.getImie()) && Objects.equals(getNazwisko(), uczen.getNazwisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko());
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
