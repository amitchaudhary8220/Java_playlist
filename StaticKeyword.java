public class StaticKeyword {
    static int a=5;
    // static int b;

    // //static block runs only once at the loading of the class

    // static {
    //     System.out.println("inside static block");
    //     b += a * 3;
    // }
    class Demo {
         String name;
        public Demo(String name) {
            this.name = name;
    }
   }
    
    public static void main(String[] args) {
        // System.out.println(a + " " + b);

        // b += 4;
        // System.out.println(a + " " + b);

        // StaticKeyword st = new StaticKeyword();
        // b += 12;
        // System.err.println(a + " " + b);

        //now either create the object of StaticKeyword class then we can create object of Demo class or use static variable before Demo class

        //if you made a inner class as a static it is no more dependent on the outerclass

        //since static variable is a class variable and it does not depend on the class ,so last assigned value to static varibale will be refelected all the class ,no matter which object has changed it

        StaticKeyword st = new StaticKeyword();

        Demo d = st.new Demo("amit");
        Demo d1 = st.new Demo("ankit");
        System.out.println(d.name+" "+d1.name);


    }
}
