import com.watch.control.ControlClock;
import com.watch.model.*;

public class Main {
    public static void main(String[] args) {
        ControlClock control = new ControlClock();
        Integer n = 11;
        ObserverClock observerOne = new Clock(new Hour(n),new Minute(n),new Second(n));
        ObserverClock observerTwo = new Clock(new Hour(12),new Minute(n),new Second(n));
        control.addObserverClock(observerOne);
        control.addObserverClock(observerTwo);
        control.setClock(new Clock(new Hour(12),new Minute(13),new Second(n)));
    }
}
