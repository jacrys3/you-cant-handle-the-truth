import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //starting work
        //HandleTruth.wordCount();
    }

    @Test
    public void realTest(){
        TreeMap<Integer, Set<String>> actual;
        TreeMap<Integer, Set<String>> expected = new TreeMap<>();
        int num = 6;
        ArrayList<Integer> keys = new ArrayList<>();

        while (num > 0){
            actual = HandleTruth.wordCount(tests(num, expected, keys));
            num--;
            for (int i = 0; i < actual.size(); i++) {
                assertEquals(actual.get(i), expected.get(i));
            }

        }
    }

    private static String tests(int num, TreeMap<Integer, Set<String>> expected, ArrayList<Integer> keys){
        String msg;
        switch (num){
            case 1:
                msg = "hi how are you i am great thanks hi again are you good dude what is up dude how is everything what is your name oh hi";
                break;
            case 2:
                msg = "hey low hey high hey slow hey bye sigh nevermind bye";
                break;
            case 3:
                msg = "a dog went to a park and a different dog followed a little dog was there and a big dog was there too";
                break;
            case 4:
                msg = "a a a a a a a a a a a a hi hi hi hi hi no no no right right";
                break;
            case 5:
                msg = "no";
                break;
            default:
                msg = " ";
        }
        return msg;
    }
}