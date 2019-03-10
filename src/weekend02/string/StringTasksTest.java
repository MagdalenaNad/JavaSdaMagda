package weekend02.string;

public class StringTasksTest {
    public static void main(String[] args) {
        System.out.println(StringTasks.trimAndLower(" To ZdaNie, Ma WielkIe liTery, taM, GdZie nie trzEBA.    "));
        System.out.println(StringTasks.sameFirstLetter("Miłosz","Monika"));
        System.out.println(StringTasks.threeLastLetters("baton", "maraton"));
        System.out.println(StringTasks.noNoNo("nie powiem, nie wiem, nie nie nie nie nie"));
    }
}
