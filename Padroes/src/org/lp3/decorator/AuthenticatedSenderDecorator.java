package org.lp3.decorator;

public class AuthenticatedSenderDecorator extends SenderDecorator {

    public AuthenticatedSenderDecorator(Sender sender) {
        super(sender);
    }

    @Override
    public void send(String txt) {
        System.out.println("Autenticando...");
        super.send(txt);
        System.out.println("Logout...");
    }
}
