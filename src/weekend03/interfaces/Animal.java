package weekend03.interfaces;

public interface Animal extends Being {
    String getName();
    String speak();

    default void print(){
        System.out.println(getName()+ " speaks " + speak()+". Alive: " + isAlive());
    }
}
