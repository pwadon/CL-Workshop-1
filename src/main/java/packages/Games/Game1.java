package packages.Games;



import java.util.Random;


import static packages.Services.RandomNumberService.randomNumber;
import static packages.Services.ScannerService.scanInt;

public class Game1 {



    public static void zgadnijLiczbe(int from, int to) {

        int x = randomNumber(from,to);
        while (true) {
            int value = scanInt("guess a number from " + from + " to " + to,"this is not a number");
            if (value < x) {
                System.out.println("not enough");
            } else if (value > x) {
                System.out.println("too much");
            } else {
                System.out.println("correct !");
                break;
            }
        }
    }
}



