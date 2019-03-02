package weekend02;
public class FamilyTest {
    public static void main(String[] args) {
        Person husband1=new Person("Stefan", "Wilk", 61);
        Person wife1=new Person("Hanna", "Wilk", 58);
        Person child1=new Person("Hubert", "Wilk", 32);
        Family family1=new Family("Rodzina Wilków", husband1, wife1, child1);
        System.out.println(family1);
        System.out.println("Sum of family member's age: "+ family1.sumOfFamilyAge());
        System.out.println("Average age: "+ family1.averageAge());
        Person husband2=new Person("Adam", "Kot", 32);
        Person wife2=new Person("Olga", "Kot", 32);
        Person child2=new Person("Maciej", "Kot", 8);
        Family family2=new Family("Rodzina Kotów", husband2, wife2, child2);
        System.out.println(family2);
        System.out.println("Sum of family member's age: "+ family2.sumOfFamilyAge());
        System.out.println("Average age: "+ family2.averageAge());
        Person husband3=new Person("Grzegorz", "Lew", 52);
        Person wife3=new Person("Anna", "Lew", 45);
        Person child3=new Person("Leon", "Lew", 18);
        Family family3=new Family("Rodzina Lwów", husband3, wife3, child3);
        System.out.println(family3);
        System.out.println("Sum of family member's age: "+ family3.sumOfFamilyAge());
        System.out.println("Average age: "+ family3.averageAge());
    }
}
