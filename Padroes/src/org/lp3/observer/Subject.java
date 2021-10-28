package org.lp3.observer;

import java.util.ArrayList;

public abstract class Subject<T> {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifyObservers(T dados);

}
