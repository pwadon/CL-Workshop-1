package packages.Games;



import java.util.Random;


import static packages.Services.RandomNumberService.randomNumber;
import static packages.Services.ScannerService.scanInt;

public class Game1 {



    public static void zgadnijLiczbe(int from, int to) {

        int x = randomNumber(from,to);
        while (true) {
            int value = scanInt("zgadnij liczbę z przedziału od " + from + " do " + to,"to nie jest liczba");
            if (value < x) {
                System.out.println("Za mało");
            } else if (value > x) {
                System.out.println("Za dużo");
            } else {
                System.out.println("Zgadłeś !");
                break;
            }
        }
    }
}



