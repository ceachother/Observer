package com.cecil;

/**
 * Created by cecillee on 27/3/16.
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
