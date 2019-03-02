package weekend02.string;

public class StringMethods {
    public static void main(String[] args) {
        String text="Badamy metody klasy String!";
        System.out.println("intern: " + text.intern());
        System.out.println("charAt12: "+ text.charAt(12));
        System.out.println("lenght: " +text.length());
        System.out.println("substring(7,13): "+text.substring(7,13));
        System.out.println("substring(14): " + text.substring(14));
        System.out.println("replace(Badamy, sprawdzamy): " + text.replace("Badamy", "Sprawdzamy"));
        System.out.println("replace(S,K): " + text.replace("S", "K"));
        System.out.println("replaceAll(metody, klasy): " + text.replaceAll("metody", "klasy"));
        System.out.println("replaceFirst(metody, klasy): " + text.replaceFirst("metody", "klasy"));
        System.out.println("toLowerCase: " + text.toLowerCase());
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("codePointAt(14): " + text.codePointAt(14));
        System.out.println("trim: " + text.trim());
        System.out.println("codePointBefore(15): " + text.codePointBefore(15));
        System.out.println("codePointCount(7,13): " + text.codePointCount(7,13));
        System.out.println("compareTo: " + text.compareTo(text.toLowerCase()));
        System.out.println("contains(met): " + text.contains("met"));
        System.out.println("compareToIgnoreCase(metody): " + text.compareToIgnoreCase("metody"));
        System.out.println("getBytes: " + text.getBytes());
        System.out.println("hashCode: " + text.hashCode());
        System.out.println("matches(klasy): " + text.matches("klasy"));


    }

}
