package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nitin = new Human(24,"Nitin Bhat");
       // Human nitinb = new Human(nitin);
        //cloneable interface is faster
        Human twin = (Human)nitin.clone();
    }
}
