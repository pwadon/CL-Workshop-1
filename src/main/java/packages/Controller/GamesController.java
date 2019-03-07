package packages.Controller;



import static packages.Services.PickAGame.runPickedGame;

public class GamesController {
    public static void main(String[] args) {
        System.out.println("Hello User ! Let's play a game !");
        runPickedGame();
    }
}
