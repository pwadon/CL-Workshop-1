package packages.Controller;


import packages.Services.PickAGame;

public class GamesController {


    public static void main(String[] args) {
        PickAGame pickAGame = new PickAGame();
        System.out.println("Hello User ! Let's play a game !");
        pickAGame.runPickedGame();
    }
}
