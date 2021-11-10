package org.lp3.decorator;

public class HttpSender extends Sender {

    public void send(String txt) {
        System.out.println(txt + "--- HTTPSender enviando...");
    }

}
