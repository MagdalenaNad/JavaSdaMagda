package weekend02.loops;

import java.util.Scanner;

public class Palindrom {
    public static String stringReverse(String text) {
        String reverse = "";
        for (int i = text.length(); i > 0; i--) {
            reverse = reverse + text.charAt(i-1);
        }
        return reverse;
    }

    public static boolean isPalindrom(String text){
        text=text.toLowerCase();
        String reverse=stringReverse(text).toLowerCase();
        return (text.equals(reverse));
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String text=scanner.next();
       // System.out.println(stringReverse("Ależ Marianno"));
        System.out.println(isPalindrom(text));
    }
}
