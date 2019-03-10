package weekend02.loops;

public class Loops1 {
    public static void evenNumber(int n){
        int i;
        for (i=1; i<=n; i++) System.out.print(2*i + " ");
        System.out.println("");

    }
    public static int powerOfNumber(int a, int n){
            int i;
            int b=1;
            for (i=0; i<n; i++) b=b*a;
            return b;
    }

    public static void main(String[] args) {
        evenNumber(12);
        int power=powerOfNumber(4,6);
        System.out.println(power);

        char c;
        for (c='A';c<='Z';c++) System.out.print(c + " ");
        char k='A';
        System.out.println("");
        while (k<='Z') {
            System.out.print(k + " ");
            k++;
        }

    }
}
