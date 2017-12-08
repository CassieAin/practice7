package task7_1;

import java.util.*;

public class DataStructuresGenerator {

    private static void generateDataStructure(Collection<Integer> collection, int quantity, int from, int to){
        for(int i = 0; i < quantity; i++) {
            collection.add((new Random().nextInt(to - from) + from));
        }
    }

    public static List<Integer> generateList(int quantity, int from, int to) {
        ArrayList<Integer> list = new ArrayList<>(quantity);
        generateDataStructure(list, quantity, from, to);
        return list;
    }

    public static Set<Integer> generateSet(int quantity, int from, int to) {
        Set<Integer> set = new HashSet<>(quantity);
        generateDataStructure(set, quantity, from, to);
        return set;
    }

}
