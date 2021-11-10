package org.lp3.singleton;

public class Main {

    public static void main(String[] args) {
        Object obj1 = AcervoSingleton.getInstance();
        System.out.println(obj1);

        Object obj2 = AcervoSingleton.getInstance();
        System.out.println(obj2);

        Object obj3 = new Object();
        System.out.println(obj3);
    }

}
