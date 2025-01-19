package com.watch.model;

import java.util.Objects;

public class Clock  implements ObserverClock {
    private Hour hourClock;
    private Minute minuteClock;
    private Second secondClock;


    public Clock(Hour hourClock, Minute minuteClock, Second secondClock) {
        this.hourClock = hourClock;
        this.minuteClock = minuteClock;
        this.secondClock = secondClock;
    }

    public Hour getHourClock() {
        return hourClock;
    }

    public void setHourClock(Hour hourClock) {
        this.hourClock = hourClock;
    }

    public Minute getMinuteClock() {
        return minuteClock;
    }

    public void setMinuteClock(Minute minuteClock) {
        this.minuteClock = minuteClock;
    }

    public Second getSecondClock() {
        return secondClock;
    }

    public void setSecondClock(Second secondClock) {
        this.secondClock = secondClock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return Objects.equals(hourClock, clock.hourClock) && Objects.equals(minuteClock, clock.minuteClock) && Objects.equals(secondClock, clock.secondClock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourClock, minuteClock, secondClock);
    }

    @Override
    public String toString() {
        return hourClock+":"+minuteClock+":"+secondClock;
    }




    @Override
    public void changeClock(Clock a) {
        System.out.println(a.hourClock.toString()+":"+a.minuteClock.toString()+":"+a.secondClock.toString());
    }
}
