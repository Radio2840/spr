/**

 Klasa przechowuje listę obiektów uczen

 uczenList : list, linkedlist która przechowuje obiekty typu uczen

 @author: Kinga Smolarek

 **/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;


public class ListaUczniow {
    private List<Uczen> uczenList = new LinkedList<>();

    public  void dodaj(String imie, String nazwisko){
        uczenList.add(new Uczen(imie,nazwisko));
    }
    public void wyswietl(){
        for(Uczen i : uczenList){
            System.out.println(i.toString());
        }
    }
    public void usun(String imie,String nazwisko){
        for(Uczen i : uczenList){
            uczenList.remove(i.equals(Uczen.id));
        }
    }
    public void losuj(int n){
        List<Integer> jakie_losowe = new ArrayList<>();
        int size = jakie_losowe.size();
        Random rad = new Random();
        for(int i=0;i<n;i++){
            int random = rad.nextInt();
            if(jakie_losowe.contains(random)) {
                random = rad.nextInt();
            }
            else {
                jakie_losowe.add(random);
            }

        }
        for(int a=0;a<size;a++){
            System.out.println(uczenList.get(jakie_losowe.get(a)).toString());
        }


    }
}
