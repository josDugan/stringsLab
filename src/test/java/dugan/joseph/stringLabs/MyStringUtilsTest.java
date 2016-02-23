package dugan.joseph.stringLabs;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
/**
 * Created by joseph on 2/20/16.
 */
public class MyStringUtilsTest {
    @Test
    public void testStringifyArrayOfCharsOrStrings() {
        // given
        Character[] testCharArray = new Character[]{'a', 'b', 'c'};
        String[] testStringArray = new String[]{"a", "an", "the"};

        // when
        String actualStringOfTestCharArray = MyStringUtils.stringifyArrayOfCharsOrStrings(testCharArray);
        String expectedStringOfTestCharArray = "a,b,c";

        String actualStringOfTestStringArray = MyStringUtils.stringifyArrayOfCharsOrStrings(testStringArray);
        String expectedStringOfTestStringArray = "a,an,the";

        // then
        assertTrue("Character array processed incorrectly: " + actualStringOfTestCharArray, expectedStringOfTestCharArray.equals(actualStringOfTestCharArray));
        assertTrue("String array processed incorrectly: " + actualStringOfTestStringArray, expectedStringOfTestStringArray.equals(actualStringOfTestStringArray));
    }

    @Test
    public void testMultiLineStringToArray() {
        // given
        String testString = "a\nan\nthe";

        // when
        String[] actualResultStringArray = MyStringUtils.multiLineStringToArray(testString);
        String[] expectedResultStringArray = new String[]{"a", "an", "the"};

        // then
        assertArrayEquals("Arrays not equal", expectedResultStringArray, actualResultStringArray);
    }

    @Test
    public void testInvertCapitaliztion() {
        // given
        String testString = "This Is The Test String";

        // when
        String actualInvertedString = MyStringUtils.invertCapitalization(testString);
        String expectedInvertedString = "tHIS iS tHE tEST sTRING";

        // then
        assertTrue("Capitalization was not reversed properly" + actualInvertedString, expectedInvertedString.equals(actualInvertedString));

    }

    @Test
    public void testReverseWordsInStrings() {
        // given
        String testString = "I am frontwards string";

        // when
        String actualReversedWordsString = MyStringUtils.reverseWordsInString(testString);
        String expectedReversedWordsString = "I ma sdrawtnorf gnirts";

        // then
        assertTrue("Words in string reversed incorectly: " + actualReversedWordsString, expectedReversedWordsString.equals((actualReversedWordsString)));
    }

    @Test
    public void testRemoveWhitespaceAndPlaceStringsOnDistinctLines() {
        // given
        String testString = "A line with spaces";

        // when
        String actualNoWhitespaceStringsOnDistinctLines = MyStringUtils.removeWhitespaceAndPlaceWordsOnDistinctLines(testString);
        String expectedNonWhitespaceStringOnDistinctLines = "A\nline\nwith\nspaces";

        // then
        assertTrue("String unprocessed incorrectly", expectedNonWhitespaceStringOnDistinctLines.equals(actualNoWhitespaceStringsOnDistinctLines));
    }

    @Test
    public void testMakeAllStrings() {
        // given
        String testString = "abc";

        // when
        String[] actualSubstringArray = MyStringUtils.makeAllSubstrings(testString);
        String[] expectedSubstringArray = new String[]{"a", "b", "c", "ab", "bc", "abc"};

        // then
        assertArrayEquals("Substrings processed incorrectly" + Arrays.toString(actualSubstringArray), expectedSubstringArray, actualSubstringArray);
    }
}
