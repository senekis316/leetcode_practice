package practice.Interview;

import java.util.concurrent.atomic.AtomicReference;

public class ABCThread extends Thread {

    private Current current;

    public ABCThread(String name, Current current) {
        super(name);
        this.current = current;
    }

    @Override
    public void run() {
        while (true) {
            if (current.getCurrent().equals(getName())) {
                synchronized (current) {
                    System.out.println(getName());
                    if (current.getCurrent().equals(getName())) {
                        String name = getName();
                        if (name.equals("A")) {
                            current.setCurrent("B");
                        } else if (name.equals("B")) {
                            current.setCurrent("C");
                        } else {
                            current.setCurrent("A");
                        }
                    }
                }
            }
        }
    }

}
