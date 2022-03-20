package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        try{
          int c = a/b;
          divide(1,0);
        }catch (ArithmeticException e){ // more strict ones on top
            System.out.println("Arth exception");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will execute always");
        }
    }

    static int divide(int a, int b) throws  ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
