package pl.coderslab.Services;

import java.util.Scanner;

public class ScannerService {

    public static int scanInt(String exception){

        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextInt()){
            System.out.println(exception);
            scan.next();
        }
        return  scan.nextInt();

    }
}
