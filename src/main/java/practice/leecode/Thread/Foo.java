package practice.leecode.Thread;

import lombok.SneakyThrows;

public class Foo {

    private volatile Integer index;

    public Foo() {
        this.index = 0;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (true) {
            synchronized (index) {
                if (index == 0) {
                    break;
                }
            }
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        index++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (true) {
            synchronized (index) {
                if (index == 1) {
                    break;
                }
            }
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        index++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (true) {
            synchronized (index) {
                if (index == 2) {
                    break;
                }
            }
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        index++;
    }

    public static class PrintFirst implements Runnable {
        @Override
        public void run() {
            System.out.println("first");
        }
    }

    public static class PrintSecond implements Runnable {
        @Override
        public void run() {
            System.out.println("second");
        }
    }

    public static class PrintThird implements Runnable {
        @Override
        public void run() {
            System.out.println("third");
        }
    }

    public static class PrintThread extends Thread {

        private int index;
        private Foo foo;

        public PrintThread(int index, Foo foo) {
            this.index = index;
            this.foo = foo;
        }

        @SneakyThrows
        @Override
        public void run() {
            if (index == 1) {
                foo.first(new Foo.PrintFirst());
            } else if (index == 2) {
                foo.second(new Foo.PrintSecond());
            } else {
                foo.third(new Foo.PrintThird());
            }
        }
    }


}