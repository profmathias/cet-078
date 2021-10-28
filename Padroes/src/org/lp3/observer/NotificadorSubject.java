package org.lp3.observer;

public class NotificadorSubject extends Subject<String> {

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);

	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String dados) {
		// TODO Auto-generated method stub
		for(Observer observer: this.observers) {
			observer.update("Nova mensagem...");
		}
	}
}
