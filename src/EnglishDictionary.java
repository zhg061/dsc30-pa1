public class EnglishDictionary {
    public static String [] newWords(String[] letters, int n) {
        /** Your code is here */
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
