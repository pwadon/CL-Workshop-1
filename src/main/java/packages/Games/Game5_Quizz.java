package packages.Games;

import packages.Services.QuizzQuestionsMap;
import packages.Services.ScannerService;

import java.util.Map;
import java.util.Set;

public class Game5_Quizz {

    public static void Game5Quiz(){
        System.out.println("Pick correct capital of a given country, if you give up type quit");
        int counter = 0;
        Map<String, String> map = QuizzQuestionsMap.questionsAndAnswersMap();
        Set <String> countries = map.keySet();
        for(String key : countries){
            String answer = ScannerService.scanString("what is the capital of " + key + " ?");
            if (answer.toLowerCase().equals("quit")) break;
            else if (answer.toLowerCase().equals(map.get(key).toLowerCase())){
                counter++;
            }
        }
        System.out.println("You Scored :  " + counter +" points for : " + countries.size() + " possible" );
    }
}
