import inner.Modifiers;

public class SubClass extends StaticKeyword {
    //we can access static varibale of base class either by usign object of child
    // class or child class itself  or baseclass name
    public static void main(String[] args) {
        SubClass c = new SubClass();
        System.out.println("access static varibale of base class using the object of child class "+SubClass.a);
    }
}
