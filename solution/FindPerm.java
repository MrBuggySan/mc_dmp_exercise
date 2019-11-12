package solution.src;

public class FindPerm {

    private static void printPermutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm.toString());
        }
        char prevChar = Character.MIN_VALUE ;
        for (int i = 0; i < str.length(); i++) {
            // prevent duplicate work
            if (prevChar == str.charAt(i)) {
                continue;
            }
            prevChar = str.charAt(i);
            String newPerm = perm + prevChar;  
            printPermutations(StringHelper.removeIthChar(str, i), newPerm);
            // printPermutations(str.substring(0, i) + str.substring(i + 1), newPerm); //this line makes run time a bit slower
        }
    }
    
    /**
     * Print all permutations of a string
     * @param str get all permutations of this string
     */
    public static void printPermutations(String str) {
        printPermutations(StringHelper.sortString(str), "");
    }

    public static void main(String[] args) {
        // long startTime = System.currentTimeMillis();
        if (args.length == 0) {
            return;
        }
        for (String arg : args) {
            // System.out.println("Printing solution for " + arg);
            FindPerm.printPermutations(arg);
        }
        // System.out.println("Time lapsed: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}