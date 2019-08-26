package com.training;

/**
 * {@link IsUnique} has methods to test whether a given string has all unique
 * characters.
 * {@link IsUnique#hasUniqueCharacters(String)} tests whether a string has all
 * unique characters or not.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class IsUnique {
    private static final int TOTAL_CHARS_ENGLISH = 26;
    private static final int FIRST_LOWER_CHAR_ENGLISH = 97;
    private static final int FIRST_UPPER_CHAR_ENGLISH = 65;

    /**
     * Returns true is the string has unique characters
     *
     * @param input string to be tested
     * @return true if string has unique characters or else false
     */
    public boolean hasUniqueCharacters(String input) {
        // let us assume that the string contains only uppercase and lowercase characters
        boolean[] entries = new boolean[2 * TOTAL_CHARS_ENGLISH];

        for (int i = 0; i < input.length(); i++) {
            int index = (int) input.charAt(i);
            index = getConvertedIndex(index);

            if (entries[index]) {
                return false;
            }

            entries[index] = true;
        }
        return true;
    }

    /**
     * Returns true efficiently is the string has unique characters
     *
     * @param input string to be tested
     * @return true if string has unique characters or else false
     */
    public boolean hasUniqueCharactersEfficiently(String input) {
        int checker = 0;
        for (int i = 0; i < input.length(); i++) {
            int index = (int) input.charAt(i);
            index = getConvertedIndex(index);

            int val = 1 << index;
            if ((checker & val) > 1) {
                return false;
            } else {
                checker = checker | val;
            }
        }

        return true;
    }

    private int getConvertedIndex(int index) {
        if (index >= FIRST_LOWER_CHAR_ENGLISH) {
            index -= FIRST_LOWER_CHAR_ENGLISH;
            index += TOTAL_CHARS_ENGLISH;
        } else {
            index -= FIRST_UPPER_CHAR_ENGLISH;
        }
        return index;
    }
}
