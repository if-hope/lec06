import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String[] rows = new String[]{"logo", "mama", "coco", "yes"};
        searchUnique(rows);
    }

    public static Set searchUnique(String[] rows){
        Set<Character> mySet = new HashSet<>();

        for (String element : rows){
            char [] chars = element.toCharArray();
            for (Character character : chars){
                mySet.add(character);
            }
        }
        return mySet;

    }
}