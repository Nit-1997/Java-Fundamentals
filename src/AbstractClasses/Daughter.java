package AbstractClasses;

public class Daughter extends Parent {
    @Override
    void career(String name){
        System.out.println("Gonna be a" + name + " , a good one");
    }

    @Override // runtime polymorphism
    void partner(String name, int age){
        System.out.println("Will love " + name + " , with age "+age);
    }
}
