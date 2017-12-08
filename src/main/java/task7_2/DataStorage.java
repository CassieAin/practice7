package task7_2;

import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    private HashMap<String,String> dictionary;

    public DataStorage(){
        dictionary = new HashMap<>();
     /*   dictionary.put("programming", "программирование");
        dictionary.put("dog", "собака");
        dictionary.put("cat", "кошка");
        dictionary.put("house", "дом");
        dictionary.put("trip", "путешествие");
        dictionary.put("year", "год");
        dictionary.put("festival", "фестиваль");
        dictionary.put("sky", "небо");*/
    }

    public void addPhrases(String russian, String english){
        dictionary.put(russian, english);
    }

    public String getRussianTranslation(String english){
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(english)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String getEnglishTranslation(String russian){
        if(dictionary.containsValue(russian)){
            return dictionary.get(russian);
        }
        return null;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }
}
