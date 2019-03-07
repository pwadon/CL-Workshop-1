package packages.Services;

import java.util.Scanner;

public class ScannerService {

    public static int scanInt(String question, String exception){
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextInt()){
            System.out.println(exception);
            scan.next();
        }
        return  scan.nextInt();

    }

    public static String scanString(String question){
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }


}
