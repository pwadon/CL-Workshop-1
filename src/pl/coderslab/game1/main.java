package pl.coderslab.game1;


import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        zgadnijLiczbe();
    }

    static void zgadnijLiczbe() {

        Random r = new Random();
        int x = r.nextInt(100) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbę");
        while (true) {
            while (!scan.hasNextInt()) {
                System.out.println("To nie jest liczba");
                scan.next();
            }
            int value = scan.nextInt();

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



