import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //starting work
        HandleTruth.wordCount();
    }

    @Test void realTest(){
        TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount();
        TreeMap<Integer, Set<String>> expected;
        assert(actual, expected);
    }
}