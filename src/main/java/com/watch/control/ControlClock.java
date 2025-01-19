package com.watch.control;

import com.watch.model.Clock;
import com.watch.model.ObserverClock;

import java.util.ArrayList;
import java.util.List;

public class ControlClock {

    private Clock clock;
    private List<ObserverClock> observers=new ArrayList<>();



    public void notifyObservers(){
        for(ObserverClock a: observers){
            a.changeClock(clock);
        }
    }
    public void addObserverClock(ObserverClock a){
        observers.add(a);
    }
    public void removeObserverClock(ObserverClock a){
        observers.remove(a);
    }

    public void setClock(Clock clockNew){
        this.clock=clockNew;
        notifyObservers();
    }
}
