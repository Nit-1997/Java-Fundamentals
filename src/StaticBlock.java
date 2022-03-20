public class StaticBlock {
    static int a = 1;
    static int b;

    //will only run once when the first object of the class is loaded , for other objs not run
    static{
        System.out.println("Inside static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a+" : "+obj.b );
    }
}
