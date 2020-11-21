import java.util.*;

public class HandleTruth {
    public static TreeMap<Integer, Set<String>> wordCount() {
        String msg = "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to";

        // split the message into word set
        String[] words = msg.split(" ");

        // use map to count the occurrences of each word
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
                continue;
            }
            wordMap.put(word, 1);
        }
        /*for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry);
        }*/

        // sort the map based on number of occurrences
        TreeMap<Integer, Set<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            int key = entry.getValue();
            Set<String> values = sortedMap.containsKey(key) ?
                    sortedMap.get(key) : new HashSet<>();
            values.add(entry.getKey());
            sortedMap.put(entry.getValue(), values);
        }

        /*for (Map.Entry<Integer, Set<String>> entry : sortedMap.entrySet()) {
            System.out.println(entry);
        }*/
        return sortedMap;
    }
}