package org.lp3.decorator;

public abstract class SenderDecorator extends Sender {

    private Sender _sender;

    public SenderDecorator(Sender sender) {
        this._sender = sender;
    }

    public void send(String txt) {
        this._sender.send(txt);
    };

}
