package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        son.career("Doctor");
        daughter.career("Engineer");
        son.partner("Sara",21);
        daughter.partner("Nitin",24);

        //cannot create an object of the abstract class only extended
        //cannot create abstract constructor,static methods
    }
}
