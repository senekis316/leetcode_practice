package practice.Interview;

public class DriverWorker implements Worker {

    @Override
    public void work(String name) {
        System.out.println("驾驶员" + name + "开始工作!");
    }

}
