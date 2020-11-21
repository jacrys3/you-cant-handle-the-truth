import org.junit.Test;

import java.util.*;

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
        Queue keys = new LinkedList();

        while (num > 0){
            actual = HandleTruth.wordCount(tests(num, expected, keys));
            assertEquals(actual.size(), expected.size());
            num--;
            while(keys.size() > 0) {
                int key = (int) keys.poll();
                assertEquals(actual.get(key), expected.get(key));
            }

        }
    }

    private static String tests(int num, TreeMap<Integer, Set<String>> expected, Queue keys){
        String msg;
        Set<String> set = new HashSet<>();
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
                expected.clear();
                set.clear();
                set.add("a");
                expected.put(12,set);
                set.clear();
                set.add("hi");
                expected.put(5,set);
                set.clear();
                set.add("no");
                expected.put(3,set);
                set.clear();
                set.add("right");
                expected.put(2,set);
                break;
            case 5:
                msg = "no";
                set.add("no");
                expected.put(1, set);
                keys.add(1);
                break;
            default:
                msg = " ";
                keys.add(0);
        }
        return msg;
    }
}