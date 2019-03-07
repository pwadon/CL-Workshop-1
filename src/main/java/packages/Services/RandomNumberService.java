package packages.Services;

import java.util.Random;

public class RandomNumberService {

    public static int randomNumber(int from, int to){
        Random r = new Random();
        return r.nextInt(to-from) + from;
    }
}
