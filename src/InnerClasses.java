
public class InnerClasses {
    //now it is not dependent on InnerClasses class so can create it's own objects
    //if it was not static then we cannot create it's own objects
    static class Test{
        static String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Nitin");
        Test b = new Test("Ayush");
    }
}
