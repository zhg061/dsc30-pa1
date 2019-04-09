/*
 * NAME: Zhaoyi Guo
 * PID: A15180402
 */

/**
 * this class creates a function to create an array of new words based on the input array of words
 * then, the second function print out the actual output of newWords.
 */
public class EnglishDictionary {
    /**
     * creates a new word by concatenating elements from array letters,
     * starting from letters[i] through letters[i+n],
     * but only if letters[i] does not start with either “x” or “z”.
     * @param letters
     * @param n
     * @return result, which is a new array consisting of new words.
     */
    public static String [] newWords(String[] letters, int n) {
        String[] result= new String[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].charAt(0) == 'z' || letters[i].charAt(0) == 'x') {
                result[i] = "%empty%";
            }
            else {
                result[i] = letters[i];
                for (int j = 1; j < n + 1; j++) {
                    if (i + j < letters.length) {
                        result[i] += letters[i + j];
                    }
                }
            }
        }
        return result;
    }

    /**
     * a test for function newWords,
     * it calss newWords, and it prints out the actual output of the function.
     * @param args
     */
    public static void main(String[] args) {
        String[] test = {"xoxo", "yum" ,"lol", "ypop"};
        int n = 2;
        String[] output;
        output = newWords(test, n);

        // Should print %empty%, yumlolypop, lolypop, ypop
        System.out.println(java.util.Arrays.toString(output));
        String[] test2 = {"ma", "le", "zo", "sh", "tip", "pa"};
        int n2 = 3;
        String[] output2;
        output2 = newWords(test2, n2);

        // Should print malezosh, lezoshtip, %empty%, shtippa, tippa, pa
        System.out.println(java.util.Arrays.toString(output2));
    }

}
