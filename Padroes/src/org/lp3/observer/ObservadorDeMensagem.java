package org.lp3.observer;

public class ObservadorDeMensagem extends Observer {

	@Override
	public void update(String mensagem) {
		System.out.println(mensagem + "(RECEBIDO)");
	}

}
