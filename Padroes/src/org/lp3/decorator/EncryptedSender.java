package org.lp3.decorator;

public class EncryptedSender extends SenderDecorator {

    public EncryptedSender(Sender sender) {
        super(sender);
    }

    public void send(String txt) {
        System.out.println("Criptografando os dados...");
        super.send(txt);
        System.out.println("Fim da criptografia...");
    }
}
