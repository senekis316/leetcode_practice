package practice.Interview;

public class ProgrammeWorker implements Worker {

    @Override
    public void work(String name) {
        System.out.println("程序员" + name + "开始工作!");
    }

}
