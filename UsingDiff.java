public class UsingDiff {
    public static void main(String[] args) {
        System.out.println("started");


        //now here every object is pointing to same reference 
        //because same reference is returned everytime since it is singleton class
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
               
    }
}
