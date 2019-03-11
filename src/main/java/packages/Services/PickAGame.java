package packages.Services;

import packages.Games.*;


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
        stringBuilder.append("\n");
        stringBuilder.append("game number 5 - European Capitals test");
        int gameNumber;
        gameNumber = scanInt(stringBuilder.toString(), "give a number");
        return gameNumber;
    }


    public void runPickedGame() {

        switch (pickGame()) {
            case 1:
                System.out.println("guess number from given range");
                game1.guessNumber(1, 100);
                break;
            case 2:
                System.out.println("Lets play Lotto");
                game2.lottoComparison();
                break;
            case 3:
                System.out.println("I will guess the number that you picked in 10 guesses maximum");
                game3.guessingNumber();
                break;
            case 4:
                System.out.println("Lets pick a cube to roll, and roll it !");
                game4.roll();
                break;
            case 5:
                System.out.println("Lest test your knowledge of some European Capitals");
                Game5_Quizz.Game5Quiz();
                break;
            default:
                System.out.println("there is no game with given number, try again");
                runPickedGame();
        }
    }
}





