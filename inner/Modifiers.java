package inner;

public class Modifiers {
    static String globe="world";
    public int salary;
    String name;

    public Modifiers(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}

//in case of protected (if we will access it in different pacakge) only subclass object can access the protected varibale of base class 
//ie is name of base class is say A and protected varibale is say name

//then in  A obj =new A(); obj.name //not alloweed
// suppose subclass is B , then B object =new B(); object.name // is allowed 
