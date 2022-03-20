package AbstractClasses;

public class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I will be a" + name);
    }

    @Override // runtime polymorphism
    void partner(String name, int age){
        System.out.println("In love with " + name + " , with age "+age);
    }
}
