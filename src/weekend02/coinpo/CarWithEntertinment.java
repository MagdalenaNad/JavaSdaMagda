package weekend02.coinpo;

public class CarWithEntertinment {
    public static void main(String[] args) {

        Car car=new Car("Audi", "blue", new Entertainment(0,2));
        car.turnOnOF();
        System.out.println(car);
        car.selectStation(13);
        car.changeVolume(31);
        System.out.println(car);
        car.selectStation(135);
        System.out.println(car);
    }
}
