package org.lp3.singleton;

public class AcervoSingleton {

    private static final Object acervo = new Object();

    private AcervoSingleton() {

    }

    public static Object getInstance() {
        return AcervoSingleton.acervo;
    }

}
