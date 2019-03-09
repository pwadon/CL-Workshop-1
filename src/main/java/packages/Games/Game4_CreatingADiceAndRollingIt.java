package packages.Games;

import packages.Services.ScannerService;
import static packages.Services.RandomNumberService.randomNumber;

public class Game4_CreatingADiceAndRollingIt {

    private static int numberOfRolls(){
        int x = 0;
        while ( x < 1){
            System.out.println("number of rolls has to be bigger than 0");
            x = ScannerService.scanInt("How many rolls ?","give a number");
        }
        return x;
    }
    private static int numberOfCubeFields(){
        int y =0;
        while( y < 1) {
            System.out.println("number of fields has to be higher than 0");
            y = ScannerService.scanInt("give number of fields","give a number");

        }
        return y;
    }
    private static int getModifier(){
        int z =ScannerService.scanInt(" give modifier ( minus number means minus modifier)","give a number");
        return z;
    }

    public void roll(){
        int rolls = numberOfRolls();
        int fields = numberOfCubeFields();
        int modifier = getModifier();
        int score =0;

        String roll = (rolls + "D" + fields  + " + " + modifier);

        System.out.println(" Rolling a cube " +  roll);

        for (int i = 1; i <= rolls ; i++) {
            int c = randomNumber(1,fields);
            score += c + modifier;
            System.out.println("Rolled in " + i + " time = " + c);

        }
        System.out.println("score : " +   score);
    }
}

