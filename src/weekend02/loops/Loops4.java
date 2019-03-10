package weekend02.loops;

import javax.swing.*;

public class Loops4 {
    public static boolean areTheSameStrings(String t1, String t2) {
        int k = 1;
        if (t1.length() == t2.length()) {
            for (int i = 0; i < t1.length(); i++) {
                if (t1.charAt(i) == t2.charAt(i)) k = i;
                else break;
            }
            return (k == (t1.length() - 1));

        } else return false;
    }

    public static int phraseNumber(String phrase, String text) {
        String lowerText = text.toLowerCase();
        phrase = phrase.toLowerCase();
        int m = 0;
        int phraseCounter = 0;
        while (lowerText.contains(phrase)) {
            phraseCounter++;
            m = lowerText.indexOf(phrase);
            lowerText = lowerText.substring(m + 1);
        }
        return phraseCounter;
    }

    private static void sumNumbersFromUser(int numbersSize) {
        float sum = 0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
        }

        System.out.println("sum = " + sum + ", average= " + sum / numbersSize);
    }

    private static void rectangle(int width, int height,char c) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println(areTheSameStrings("wieloryb", "wieloryb"));
        System.out.println(phraseNumber("MA", "Pan Marek ma małego kotka o imieniu Malma."));
        //sumNumbersFromUser(5);
        rectangle(10, 5, '+');
        rectangle(13,4,'@');
    }
}
