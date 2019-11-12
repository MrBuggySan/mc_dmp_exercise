package solution.src;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringHelper {

    /**
     * Return a new string without the char at index
     * @param s base string to get new string from
     * @param index index of char to be removed
     * @return
     */
    public static String removeIthChar(String s, int index){
        StringBuilder newStrBuilder = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            if (j == index) continue;
            newStrBuilder.append(s.charAt(j));
        }
        return newStrBuilder.toString();
    }

    /**
     * Return a string sorted in ascending order
     * @param s string to be sorted
     * @return
     */
    public static String sortString(String s) {
        return Stream.of(s.split(""))
            .sorted()
            .collect(Collectors.joining());
    }
}