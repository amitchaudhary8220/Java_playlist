package other;

import inner.Modifiers;

public class NoSubclass {
    public static void main(String[] args) {
        NoSubclass n = new NoSubclass();
        
        Modifiers m = new Modifiers(1000, "ankit");
        System.out.println(m.name);
    }
}
