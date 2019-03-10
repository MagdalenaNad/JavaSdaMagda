package weekend02.string;

public class StringTasks {
    public static String trimAndLower(String text) {
        return text.trim().toLowerCase();
    }

    public static boolean sameFirstLetter(String text1, String text2) {
        return (text1.charAt(0) == text2.charAt(0));
    }

    public static boolean threeLastLetters(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        if (n1 < 3 || n2 < 3) {
            return false;
        } else {
            String text11 = text1.substring(n1 - 3);
            String text22 = text2.substring(n2 - 3);
            return (text11.equals(text22));
        }
    }

    public static boolean noNoNo(String string) {
        String lower = string.toLowerCase();
        int m = 0;
        int nieCounter = 0;
        if (lower.contains("nie")) {

            while (lower.contains("nie")) {
                nieCounter++;
                m = lower.indexOf("nie", m);
                lower = lower.substring(m + 1);
            }
        }
        return nieCounter > 2;

        //return lower.contains("nie");
    }


}
