package com.empirix.expandinput;

/**
 *
 */
public class StringExpander {

    public static final String INVALID_INDICATOR = "Start & End cannot be the same indicator";
    public static final String NULL_MESSAGE = "Provided Input is NULL";
    public static final String EMPTY_MESSAGE = "Provided Input is EMPTY";

    /**
     *
     * @param input
     * @param startIndicator
     * @param endIndicator
     * @return
     */
    public String expandInput(String input, char startIndicator, char endIndicator) {
        if (null == input) return NULL_MESSAGE;
        if (input.trim().length() == 0) return EMPTY_MESSAGE;
        if (startIndicator == endIndicator) return INVALID_INDICATOR;

        int index = 0;
        input = input.trim();
        char[] inputAsCharArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();


        while (index < inputAsCharArray.length) {
            if (Character.isLetter(inputAsCharArray[index])) {
                stringBuilder.append(inputAsCharArray[index]);
                index++;
                continue;
            }

            if ((int)inputAsCharArray[index] < 48 && isCharacterNotAnIndicator(inputAsCharArray[index], startIndicator, endIndicator)) {
                stringBuilder.append(inputAsCharArray[index]);
                index++;
                continue;
            }

            if (Character.isDigit(inputAsCharArray[index]) && isCharacterStartIndicator(inputAsCharArray[index + 1], startIndicator)) {
                int repeateableInt = Character.getNumericValue(inputAsCharArray[index]);
                index = index + 2;
                StringBuilder stringBuilderRepeatable = new StringBuilder();
                //todo: generalize finding of start indicator
                while (index < inputAsCharArray.length && isCharacterNotAnIndicator(inputAsCharArray[index], startIndicator, endIndicator)) {
                    stringBuilderRepeatable.append(inputAsCharArray[index]);
                    index++;
                }

                for (int i = 0; i < repeateableInt; i++) {
                    stringBuilder.append(stringBuilderRepeatable);
                }

                if (isCharacterEndIndicator(inputAsCharArray[index], endIndicator)) {
                    index++;
                    continue;
                } else {
                    continue;
                }

            }

             if (isCharacterStartIndicator(inputAsCharArray[index], startIndicator)) {
                stringBuilder.append(inputAsCharArray[index]);
                index++;
                continue;
            }
        }
        printExpandedInput(stringBuilder.toString());
        return stringBuilder.toString();
    }

    /**
     *
     * @param input
     * @return
     */
    public String expandInput(String input) {
        return expandInput(input, '[', ']');
    }

    /**
     *
     */
    private void printExpandedInput(String expandedInput) {
        System.out.println(expandedInput);
    }

    private boolean isCharacterStartIndicator(char c, char startIndicator) {
        return c == startIndicator;
    }

    private boolean isCharacterEndIndicator(char c, char endIndicator) {
        return c == endIndicator;
    }

    private boolean isCharacterNotAnIndicator(char c, char startIndicator, char endIndicator) {
        return !(c == startIndicator || c == endIndicator);
    }
}
