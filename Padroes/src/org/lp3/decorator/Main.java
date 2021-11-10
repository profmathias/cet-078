package org.lp3.decorator;

public class Main {

    public static void main(String[] args) {

        HttpSender sender = new HttpSender();
        EncryptedSender encryptedSender = new EncryptedSender(sender);
        AuthenticatedSenderDecorator authenticatedSender = new AuthenticatedSenderDecorator(encryptedSender);
        authenticatedSender.send("Oi...");
    }
}
