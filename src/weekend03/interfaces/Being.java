package weekend03.interfaces;

public interface Being {
    int MAX_AGE =100;
    int getAge();

    default boolean isAlive(){
       return getAge()<MAX_AGE;
    }
}
