import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Problem:
        // Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string.
        // For example, given the string "abracadabra" and the pattern "abr", you should return [0, 7].

        // given string (where we will look to match a pattern)
        String testString = "abracadabra";

        // pattern to check
        String patternString = "abr";

        // arraylist to holde index/indices
        ArrayList<Integer> indices = new ArrayList<>();


        // head position at the pattern string to check
        int headAtPatternString = 0;

        // index where the pattern is matched
        int indexOfMatch = 0;

        // for will run over the given string
        for (int i = 0; i < testString.length(); i++) {

            // get the char from test string and pattern string
            char charAtTestString = testString.charAt(i);
            char charAtPatternString = patternString.charAt(headAtPatternString);

            // if above two chars are equal then we perform further operations
            // else reset the head position of the pattern string to 0
            if (charAtTestString == charAtPatternString) {


                if (headAtPatternString == 0) { indexOfMatch = i; }

                // check if we have reached to the end of the pattern string or not
                // if we reached to the end then we have found a match
                // so, add the "indexOfMatch" to the arraylist "indices"
                // otherwise we are still in the middle of the pattern string,
                // update the head positing to find the next char
                if (headAtPatternString == (patternString.length()-1) ) {
                    indices.add(indexOfMatch);
                    headAtPatternString = 0;
                } else {
                    headAtPatternString += 1;
                }
            } else {
                headAtPatternString = 0;
            }
        }

        // print the arraylist "indices"
        for (Integer value:indices){
            System.out.println(value);
        }


    } // main() ends here

} // class ends here
