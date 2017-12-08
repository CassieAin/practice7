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
    }

    public String translate(String word){
        if(isInDictionary(word)){
            return dictionary.get(word);
        }
        return null;
    }

    public String translateCheck(String word){
            return dictionary.get(word);
    }

    public boolean isInDictionary(String word){
        if(dictionary.containsKey(word)){
            return true;
        }
        return false;
    }

    public String translateSentence(String sentence){
        StringBuilder result = new StringBuilder();
        String[] splittedStrings = sentence.split( "\n" );

        List<String> list = new ArrayList<>();
        for(String s : splittedStrings){
            result.append(translateCheck(s));
            list.add(translateCheck(s));
        }
        return result.toString();
        //return list.toString();
    }

    public String getWord(String word){
        return dictionary.get(word);
    }
}
