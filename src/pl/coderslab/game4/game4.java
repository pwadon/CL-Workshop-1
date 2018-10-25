package pl.coderslab.game4;

import pl.coderslab.Services.ScannerService;

import java.util.Random;

public class game4 {
    public static void main(String[] args) {
        int x =0;
        int z = 0;
        int y = 0;
        int wynik=0;
        Random r = new Random();

        System.out.println("Podaj liczbę rzutów");

        while ( x < 1){
            System.out.println("Wartość musi być większa od 0");
        x = ScannerService.scanInt("podaj wartośc liczbową");

        }

        System.out.println("Podaj liczbę pól na kostce");
        while( y < 1) {
            System.out.println("Wartość musi być większa od 0");
            y = ScannerService.scanInt("podaj wartość liczbową");

        }

        System.out.println(" Podaj modyfikator ( liczba ujemna oznacza modyfikator ujemny");
        z = ScannerService.scanInt("podaj wartość liczbową");


        String rzut = (x + "D" + y  + " + " + z);

        System.out.println(" Rzucamy kostką " +  rzut);

        for (int i = 0; i < x ; i++) {
            int c = r.nextInt(y)+1;
            wynik += c + z;
            System.out.println("wyrzucona liczba na kostce za " + i + " razem = " + c);

        }
        System.out.println("wynik rzutu : " +   wynik);
    }
}

