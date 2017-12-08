package task7_2;

import task7_2.DataStorage;

import java.util.*;

public class Translator {

    private DataStorage ds;
    private HashMap<String,String> dictionary;

    public Translator(){
        ds = new DataStorage();
        dictionary = ds.getDictionary();
    }

    public void fillDictionary(){
        ds.addPhrases("программирование", "programming");
        ds.addPhrases("собака","dog");
        ds.addPhrases( "кошка", "cat");
        ds.addPhrases("дом", "house");
        ds.addPhrases("путешествие", "trip");
        ds.addPhrases("год", "year");
        ds.addPhrases( "фестиваль", "festival");
        ds.addPhrases( "небо", "sky");
        ds.addPhrases( "начала", "started");
        ds.addPhrases( "любит", "loves");
        ds.addPhrases( "новый", "new");
        ds.addPhrases( "хочет", "wants");
        ds.addPhrases( "отпраздновать", "to celebrate");
    }

    public String translate(String word){
        if(isInDictionary(word)){
            return dictionary.get(word);
        }
        return null;
    }

    public String translateCheck(String word){
        if(isInDictionary(word)){
            return dictionary.get(word);
        }else{
            return "NotFound";
        }
    }

    public boolean isInDictionary(String word){
        return dictionary.containsKey(word);
    }

    public String translateSentence(String sentence){
        StringBuilder result = new StringBuilder();
        String[] splittedStrings = sentence.trim().split( " " );

        List<String> list = new ArrayList<>();
        for(String s : splittedStrings){
            result.append(translateCheck(s) + " ");
            list.add(translateCheck(s));
        }
        return result.toString();
    }

    public String getWord(String word){
        return dictionary.get(word);
    }
}
