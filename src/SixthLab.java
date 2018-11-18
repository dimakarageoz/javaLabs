import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SixthLab {
    private static final char openRoundBracket = '(';

    private static final char closeRoundBracket = ')';

    private static final char openCurlyBracket = '{';

    private static final char closeCurlyBracket = '}';

    private static final char openSquareBracket = '[';

    private static final char closeSquareBracket = ']';
    
    public static void main(String[] args) {
        SixthLab.stringValidation();
//        SixthLab.bufferStringValidation();
    }

    public static void stringValidation() {
        List bracketsList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        String processString = scanner.nextLine();

        for (int index = 0; processString.length() > index; index++) {
            char currentChar = processString.charAt(index);

            if (
                currentChar != openRoundBracket
                && currentChar != closeRoundBracket
                && currentChar != openCurlyBracket
                && currentChar != closeCurlyBracket
                && currentChar != openSquareBracket
                && currentChar != closeSquareBracket
            ) {
                continue;
            }

            if (bracketsList.size() == 0
                && (currentChar == closeCurlyBracket
                    || currentChar == closeSquareBracket
                    || currentChar == closeRoundBracket)
            ) {
                System.out.println("String: \"" + processString + "\" is not valid");

                return;
            }

            if (bracketsList.size() == 0) {
                bracketsList.add(currentChar);

                continue;
            }

            if (
                (char) bracketsList.get(bracketsList.size() - 1) == openRoundBracket && currentChar == closeRoundBracket
                || (char) bracketsList.get(bracketsList.size() - 1) == openCurlyBracket && currentChar == closeCurlyBracket
                || (char) bracketsList.get(bracketsList.size() - 1) == openSquareBracket && currentChar == closeSquareBracket
            ) {
                bracketsList.remove(bracketsList.size() - 1);

                continue;
            }

            if (
                (char) bracketsList.get(bracketsList.size() - 1) == openRoundBracket
                    && (currentChar == closeSquareBracket || currentChar == closeCurlyBracket)
                || (char) bracketsList.get(bracketsList.size() - 1) == openCurlyBracket
                    && (currentChar == closeSquareBracket || currentChar == closeRoundBracket)
                || (char) bracketsList.get(bracketsList.size() - 1) == openSquareBracket
                    && (currentChar == closeCurlyBracket || currentChar == closeRoundBracket)
            ) {
                System.out.println("String: \"" + processString + "\" is not valid");

                return;
            }

            bracketsList.add(currentChar);
        }

        if (bracketsList.size() == 0) {
            System.out.println("String: \"" + processString + "\" is absolutely valid");
        } else {
            System.out.println("String: \"" + processString + "\" is not valid");
        }
    }

    public static void bufferStringValidation() {
        StringBuffer buffer = new StringBuffer();

        Scanner scanner = new Scanner(System.in);

        String processString = scanner.nextLine();

        for (int index = 0; processString.length() > index; index++) {
            char currentChar = processString.charAt(index);

            if (currentChar != openRoundBracket
                && currentChar != openCurlyBracket
                && currentChar != openSquareBracket
                && currentChar != closeRoundBracket
                && currentChar != closeCurlyBracket
                && currentChar != closeSquareBracket
            ) {
                continue;
            }

            if (buffer.length() == 0
                && (currentChar == closeCurlyBracket
                    || currentChar == closeSquareBracket
                    || currentChar == closeRoundBracket)
            ) {
                System.out.println("String: \"" + processString + "\" is not valid");

                return;
            }

            if (buffer.length() == 0) {
                buffer.append(currentChar);

                continue;
            }

            if (buffer.charAt(buffer.length() - 1) == openRoundBracket && currentChar == closeRoundBracket
                || buffer.charAt(buffer.length() - 1) == openCurlyBracket && currentChar == closeCurlyBracket
                || buffer.charAt(buffer.length() - 1) == openSquareBracket && currentChar == closeSquareBracket
            ) {
                buffer.deleteCharAt(buffer.length() - 1);

                continue;
            }

            if (buffer.charAt(buffer.length() - 1) == openRoundBracket
                    && (currentChar == closeSquareBracket || currentChar == closeCurlyBracket)
                || buffer.charAt(buffer.length() - 1) == openCurlyBracket
                    && (currentChar == closeSquareBracket || currentChar == closeRoundBracket)
                || buffer.charAt(buffer.length() - 1) == openSquareBracket
                    && (currentChar == closeCurlyBracket || currentChar == closeRoundBracket)
            ) {
                System.out.println("String: \"" + processString + "\" is not valid");

                return;
            }

            buffer.append(currentChar);
        }

        if (buffer.length() == 0) {
            System.out.println("String: \"" + processString + "\" is absolutely valid");
        } else {
            System.out.println("String: \"" + processString + "\" is not valid");
        }
    }
}
