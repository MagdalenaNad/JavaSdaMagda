package weekend02;
public class Family {
    String familyName;
    Person husband;
    Person wife;
    Person child;

    public Family() {
    }

    public Family(String familyName, Person husband, Person wife, Person child) {
        this.familyName = familyName;
        this.husband = husband;
        this.wife = wife;
        this.child = child;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "Family:" +
                "\n" + familyName + " " +
                " \nhusband = " + husband +
                ", \nwife = " + wife +
                ", \nchild = " + child +".";
    }

    public int sumOfFamilyAge(){
        return husband.getAge()+wife.getAge()+child.getAge();
    }
    public float averageAge(){
        return (float)sumOfFamilyAge()/3;
    }
}
