package packages.Services;

import packages.Games.Game1_ProgramGuessingGivenNumber;
import packages.Games.Game2_Lotto;
import packages.Games.Game3_ProgramGuessingGivenNumber;
import packages.Games.Game4_CreatingADiceAndRollingIt;


import static packages.Services.ScannerService.scanInt;

public class PickAGame {

    private Game1_ProgramGuessingGivenNumber game1 = new Game1_ProgramGuessingGivenNumber();
    private Game2_Lotto game2 = new Game2_Lotto();
    private Game3_ProgramGuessingGivenNumber game3 = new Game3_ProgramGuessingGivenNumber();
    private Game4_CreatingADiceAndRollingIt game4 = new Game4_CreatingADiceAndRollingIt();

    protected static int pickGame() {

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


    public void runPickedGame() {

        switch (pickGame()) {
            case 1:
                System.out.println("zgadnij liczbe z podanego przedziału");
                game1.guessNumber(1, 100);
                break;
            case 2:
                System.out.println("Zagrajmy w Lotto");
                game2.lottoComparison();
                break;
            case 3:
                System.out.println("Zgaduje liczbę");
                game3.guessingNumber();
                break;
            case 4:
                System.out.println("Lets pick a cube to roll, and roll it !");
                game4.roll();
                break;
            default:
                System.out.println("there is no game with given number, try again");
                runPickedGame();
        }
    }
}





