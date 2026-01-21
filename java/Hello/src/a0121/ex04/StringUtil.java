package a0121.ex04;

public class StringUtil {

    public static int countVowels(String string) {
        if (string == null)
            return 0;

        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String toUpperCase(String string) {
        if (string == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean containsWord(String string, String string2) {
        if (string == null || string2 == null)
            return false;

        return string.contains(string2);
    }

    public static String replaceChar(String string, char c, char d) {
        if (string == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == c) {
                sb.append(d);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
