package task7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, user! You can build your own sets and lists here!");
        System.out.println("Please, input the quantity of elements: ");
        int inputQuantity = scanner.nextInt();
        System.out.println("Please, input the range of elements starting from: ");
        int inputFrom = scanner.nextInt();
        System.out.println("And ending with: ");
        int inputTo = scanner.nextInt();
        List<Integer> list = DataStructuresGenerator.generateList(inputQuantity, inputFrom, inputTo);
        Set<Integer> set = DataStructuresGenerator.generateSet(inputQuantity, inputFrom, inputTo);
        displayList(list);
        displaySet(set);
    }

    public static void displaySet(Set<Integer> set){
        System.out.println("\nThis is your set: ");
        for(Integer element : set){
            System.out.print(element + " ");
        }
    }

    public static void displayList(List<Integer> list){
        System.out.println("\nThis is your list: ");
        for(Integer element : list){
            System.out.print(element + " ");
        }
    }
}
