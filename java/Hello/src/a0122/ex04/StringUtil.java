package a0122.ex04;

public class StringUtil {

    public static int countChar(String string, char c) {
        if (string == null)
            return 0;

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String string) {
        if (string == null)
            return null;

        String result = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }

        return result;
    }

    public static String toUpperCase(String string) {
        if (string == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String removeSpaces(String string) {
        if (string == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
