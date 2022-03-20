package cloning;

public class Human implements Cloneable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    //does shallow copy
       // primitives copied as it is but objects are referenced , not copies new object
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
