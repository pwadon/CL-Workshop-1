package pl.coderslab.game3;

import pl.coderslab.Services.ScannerService;

import java.util.Scanner;

public class game3 {
    public static void main(String[] args) {

        System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w max. 10 próbach");
            int min = 0;
            int max = 1000;
            int counter =0;
          int x = -1;
          while ( x < min || x > max){
              System.out.println(" Podaj liczbę od 0 do 1000 ");
              x = ScannerService.scanInt("Podaj liczbę");
          }

        for (int i = 0; i <10 ; i++) {

          int guess = ((max - min)/2) + min;
        System.out.println("zgaduję : " + guess);

        Scanner scan = new Scanner(System.in);
            System.out.println(" Podaj którąś z odpowiedzi: zgadłeś, za dużo, za mało");
        String odpowiedz = scan.nextLine();

         if ( odpowiedz.equals("zgadłeś") && x == guess){
             System.out.println( " Wygrałem!");
             counter ++;
             System.out.println("zgadłem w " + counter + " próbach");
             break;
         }

         else if(odpowiedz.equals("za dużo") && guess > x){
             max = guess;
             counter ++;
         }

         else if (odpowiedz.equals("za mało") && guess < x){
                 min = guess;
             counter ++;
         }

         else if ((guess < x && odpowiedz.equals("za dużo")) || (guess > x && odpowiedz.equals("za mało")) || (guess == x && !odpowiedz.equals("zgadłeś"))){
                System.out.println("oszukujesz");
                i--;
            }

         else{
             System.out.println("nie oszukuj ! podaj poprawną informację");
             i--;
         }
        }


    }
}
