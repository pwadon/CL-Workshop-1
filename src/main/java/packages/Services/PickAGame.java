package packages.Services;

import java.sql.SQLOutput;

import static packages.Games.Game1.zgadnijLiczbe;
import static packages.Games.Game2.lottoComparison;
import static packages.Games.Game3.guessingNumber;
import static packages.Games.Game4.roll;
import static packages.Services.ScannerService.scanInt;

public class PickAGame {

    public static int pickGame() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("which game do you want to pick ?");
        stringBuilder.append("\n");
        stringBuilder.append("game number 1 - guess a number from given range");
        stringBuilder.append("\n");
        stringBuilder.append("game number 2 - Lotto");
        stringBuilder.append("\n");
        stringBuilder.append("game number 3 - I'll guess the number you have picked from range 0 - 1000 in 10 guesses max");
        stringBuilder.append("\n");
        stringBuilder.append("game number 4 - Rolling a cube with given parameters");
        int gameNumber;
        gameNumber = scanInt(stringBuilder.toString(), "podaj wartosc liczbowa");
        return gameNumber;
    }


    public static void runPickedGame() {

        switch (pickGame()) {
            case 1:
                System.out.println("zgadnij liczbe z podanego przedziału");
                zgadnijLiczbe(1, 100);
                break;
            case 2:
                System.out.println("Zagrajmy w Lotto");
                lottoComparison();
                break;
            case 3:
                System.out.println("Zgaduje liczbę");
                guessingNumber();
                break;
            case 4:
                System.out.println("Lets pick a cube to roll, and roll it !");
                roll();
                break;
            default:
                System.out.println("there is no game with given number, try again");
                runPickedGame();
        }
    }
}





