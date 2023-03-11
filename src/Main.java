import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character>characters = new LinkedList<Character>();
        for (char b = 'A'; b <= 'Z'; b++) {
            characters.add(b);
        }
        System.out.println(characters);
        LinkedList<Integer>digits = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            digits.add(i);
        }
        System.out.println(digits);

        ArrayList<Character>charReverce = new ArrayList<>();
        charReverce.addAll(characters);
        Collections.reverse(charReverce);
        System.out.println(charReverce);

        ArrayList<Integer>digReverse = new ArrayList<>();
        digReverse.addAll(digits);
        Collections.reverse(digReverse);
        System.out.println(digReverse);


    }
    }

