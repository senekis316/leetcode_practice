package practice.Interview;

public class StartWork {

    public Worker worker;

    public StartWork(Worker worker) {
        this.worker = worker;
    }

    public void doWork(String name) {
        worker.work(name);
    }

}
