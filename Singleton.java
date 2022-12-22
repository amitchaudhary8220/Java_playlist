public class Singleton {
    //singleton class means we can not make more than one object of this class ,which means that we have to restirct the use of its constructer becaue we know that objects are created with the help of constructor
    
    //creating object variable of Singleton type
    static private Singleton object1;

    private Singleton() {

    }
    //since we are accesss it in different class with the help of class name so make it static
    
    public static Singleton getInstance(){
        if(object1==null)
        object1=new Singleton();
        return object1;
    }
}
