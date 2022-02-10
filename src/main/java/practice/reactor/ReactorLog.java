package practice.reactor;

import reactor.core.publisher.Flux;

public class ReactorLog {

    public static void main(String[] args) {
        Flux.range(1,10)
            .map(item -> "item-" + item)
            .concatWith(Flux.error(new RuntimeException("手动异常")))
            .log()
            .subscribe(System.out::println);
    }

}
