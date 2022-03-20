public class Singleton {
    //only one object is created of this class
    private Singleton(){
    }

    static Singleton instance;

    //now only way to create an object of this singleton class is using the getInstance method which is public
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
