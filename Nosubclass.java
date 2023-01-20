import inner.Modifiers;

public class Nosubclass {
    public static void main(String[] args) {
        Nosubclass obj = new Nosubclass();
        Modifiers m = new Modifiers(100, "amit");
        String s = m.name;
       System.out.println(s);
    }
}
