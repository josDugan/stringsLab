package dugan.joseph.stringLabs;

import java.util.Arrays;

/**
 * Created by joseph on 2/20/16.
 */
public class MyStringUtils {
    static String stringifyArrayOfCharsOrStrings(Object[] arrayOfCharsOrStrings) {
        return Arrays.toString(arrayOfCharsOrStrings).replaceAll("[\\[|\\]|\\s]", "");
    }

    static String[] multiLineStringToArray(String argString) {
        return argString.split("\n");
    }

    static String invertCapitalization(String argString) {
        StringBuilder sb = new StringBuilder();
        for (Character letter : String.join("", argString).toCharArray()) {
            if (Character.isUpperCase(letter))
                sb.append(Character.toLowerCase(letter));
            else if (Character.isLowerCase(letter))
                sb.append(Character.toUpperCase(letter));
            else
                sb.append(letter);
        }
        return sb.toString();
    }

    static String reverseWordsInString(String argString) {
        StringBuilder sb = new StringBuilder();
        for (String word : argString.split(" "))
            sb.append(reverseWord(word) + " ");
        return sb.toString().trim();
    }

    private static String reverseWord(String word) {
        char[] wordArray = word.toCharArray();
        StringBuilder backwardsWord = new StringBuilder();
        for (int i = wordArray.length - 1; i >=0; i--)
            backwardsWord.append(wordArray[i]);
        return backwardsWord.toString();
    }

    static String removeWhitespaceAndPlaceWordsOnDistinctLines(String argString) {
        return argString.replace(" ", "\n");
    }

    static String[] makeAllSubstrings(String argString) {
        int innerIterationsPerOuterIteration = argString.length(), lenOfSubstring = 1, outputArrayIndex = 0;
        String[] outputArray = new String[outputArraySize(argString.length())];
        while (innerIterationsPerOuterIteration > 0) {
            for (int i = 0; i < innerIterationsPerOuterIteration; i ++) {
                outputArray[outputArrayIndex] = argString.substring(i, i + lenOfSubstring);
                outputArrayIndex++;
            }
            innerIterationsPerOuterIteration--;
            lenOfSubstring++;
        }
        return outputArray;
    }

    private static int outputArraySize(int lengthOfString) {
        if (lengthOfString == 1)
            return 1;
        else
            return lengthOfString + outputArraySize(lengthOfString - 1);
    }




}
