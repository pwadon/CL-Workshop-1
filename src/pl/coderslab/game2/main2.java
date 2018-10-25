package pl.coderslab.game2;


import pl.coderslab.Services.ScannerService;

import java.util.ArrayList;
import java.util.Random;

public class main2 {

    public static void main(String[] args) {

        System.out.println("podaj 6 liczb z przedziału 1-49");

        ArrayList<Integer> tab = new ArrayList<>();
            int liczba=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj " + (i + 1) + " liczbę");
             liczba = ScannerService.scanInt("podaj wartosc liczbowa z przedzialu 1-49 ktorej jeszcze nie podawales");

            if ( !tab.contains(liczba) && liczba >= 1 && liczba <= 49){
                tab.add(liczba);
            }
            else{
                i--;
            }
        }

        tab.sort(Integer::compareTo);

        System.out.println("podane liczby "  +tab);

        Random rand = new Random();
        ArrayList<Integer> lotto = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int roll = rand.nextInt(49) + 1;

            if (!lotto.contains(roll)){
                lotto.add(roll);
            }
            else{
                i--;
            }
        }
        lotto.sort(Integer::compareTo);
        System.out.println(" wylosowane liczby " + lotto);
        tab.retainAll(lotto);
        System.out.println("liczba trafionych = " + tab.size());
            if(tab.size()==3){
                System.out.println("Trafiłeś trójkę");
            }
            if(tab.size()==4){
            System.out.println("Trafiłeś czwórkę");
            }
            if(tab.size()==5){
            System.out.println("Trafiłeś piątkę");
            }
            if(tab.size()==6){
            System.out.println("Trafiłeś szóstkę !!!!!!!");
            }
            else{
                System.out.println("niestety tym razem  nie udało się trafić nawet trójki");
            }



    }

}






//    Symulator LOTTO
//    Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.
//        Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6
//        poprawnych liczb.
//        Napisz program, który:
//        zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
//        czy wprowadzony ciąg znaków jest poprawną liczbą,
//        czy użytkownik nie wpisał tej liczby już poprzednio,
//        czy liczba należy do zakresu 1-49,
//        po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
//        wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
//        poinformuje gracza, czy trafił przynajmniej "trójkę"
