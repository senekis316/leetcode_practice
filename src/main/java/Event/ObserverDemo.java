package Event;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

    public static void main(String[] args) {
        EventObservable observable = new EventObservable();
        observable.addObserver(new EventObserver());
        observable.notifyObservers(new EventObject("Event Publish1!"));
    }

    public static class EventObservable extends Observable {

        @Override
        public void notifyObservers(Object arg) {
            setChanged();
            super.notifyObservers(arg);
        }

    }

    public static class EventObserver implements Observer, EventListener {

        @Override
        public void update(Observable o, Object arg) {
            System.out.println("收到消息: " + arg);
        }

    }

}
