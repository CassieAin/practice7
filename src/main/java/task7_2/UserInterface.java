package task7_2;

import java.util.Scanner;

public class UserInterface {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();
        System.out.println("Input the phrase to translate:");
        translator.fillDictionary();
        String input = scanner.nextLine();
        System.out.println(translator.translateSentence(input.toLowerCase().trim()));
        //System.out.println("get rus word" + translator.getWord("небо"));
    }
}
