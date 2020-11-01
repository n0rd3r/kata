package NumbersToWords;

import java.util.HashMap;
import java.util.Map;

public class NumbersToWords {
    Map<Integer, String> singles = new HashMap<>();
    public NumbersToWords() {
        singles.put(1, "One");
        singles.put(2, "Two");
        singles.put(3, "Three");
        singles.put(4, "Four");
        singles.put(5, "Five");
        singles.put(6, "Six");
        singles.put(7, "Seven");
        singles.put(8, "Eight");
        singles.put(9, "Nine");
    }

    public String convert(Integer i) {
        return singles.get(i);
    }
}
