import java.util.*;
class Generic{
    public static void main(String[] args) {
        int a = 10;
        String name = "amit";
        boolean sTrue = false;
        float l = 1000;
        print(a);
        print(name);
        print(sTrue);
        print(l);

        System.out.println("below are return values ");
        System.out.println("return value is "+returnValue(a));
        System.out.println("return value is "+returnValue(sTrue));
        System.out.println("return value is " + returnValue(l));
        

        Integer[] ar = { 1, 2, 3, 4, 5 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        String[] s = { "hello", "I'm", "Amit", "Chaudhary" };
        System.out.println("list is " + printList(ar));
        //here if we are passing object as an argument then for primitive ,we have to use Wrapper class

        // System.out.println("list is " + printList(arr)); //can not pass int array( instead use Integer array )

        
        System.out.println("list is "+printList(s));


    }

    static <T> void print(T n) {
        System.out.println("value is " + n);
    }
    
    static <T> T returnValue(T n) {
        return n;
    }
    static <T> List<T> printList(T[] a){
        List<T> list=new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            list.add(a[i]);

        return list;
    }
}