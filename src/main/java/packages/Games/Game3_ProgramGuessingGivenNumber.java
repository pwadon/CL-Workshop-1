package packages.Games;

import packages.Services.ScannerService;
import static packages.Services.ScannerService.scanString;

public class Game3_ProgramGuessingGivenNumber {
    private static int max =1000;
    private static int min =0;

    private static int givenNumber(){

        int x = -1;
        while ( x < min || x > max){

            x = ScannerService.scanInt(" pick number between 0 and 1000","this is not a number");
        }
        return x;
    }

    public void guessingNumber(){
        int x =givenNumber();
        int counter =0;
        for (int i = 0; i <10 ; i++)
        {

            int guess = ((max - min)/2) + min;
            System.out.println("guessing : " + guess);
            String answer =scanString(" Say if my answer is: correct, too much, not enough");

            if (answer.equals("correct") && x == guess){
                System.out.println( "I won!");
                counter ++;
                System.out.println("I picked the correct answear in " + counter + " attempts");
                break;
            }

            else if(answer.equals("too much") && guess > x){
                max = guess;
                counter ++;
            }

            else if (answer.equals("not enough") && guess < x){
                min = guess;
                counter ++;
            }

            else if ((guess < x && answer.equals("too much")) || (guess > x && answer.equals("not enough")) || (guess == x && !answer.equals("correct"))){
                System.out.println("you are cheating!");
                i--;
            }

            else{
                System.out.println("don't cheat ! give the correct answer");
                i--;
            }
        }
    }
}
