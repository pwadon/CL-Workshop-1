package packages.Services;

import java.util.HashMap;
import java.util.Map;

public class QuizzQuestionsMap {

    public static Map<String, String> questionsAndAnswersMap(){
        Map<String, String> questions = new HashMap<>();
        questions.put("Poland","Warsaw");
        questions.put("Albania","Tirana");
        questions.put("Andorra","Andorra");
        questions.put("Austria","Vienna");
        questions.put("Belgium","Brussels");
        questions.put("Belarus","Minsk");
        questions.put("Croatia","Zagreb");
        questions.put("Czech Republic","Prague");
        questions.put("France","Paris");
        questions.put("Spain","Madrid");
        questions.put("Greece","Athens");
        questions.put("Germany","Berlin");
        questions.put("Italy","Rome");
        questions.put("Ukraine","Kiev");
        questions.put("Switzerland","Zurich");
        questions.put("England","London");
        questions.put("Norway","Oslo");
        questions.put("Bulgaria","Sofia");

        return questions;
    }

}