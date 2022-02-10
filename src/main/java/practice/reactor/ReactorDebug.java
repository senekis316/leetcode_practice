package practice.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Hooks;

public class ReactorDebug {

    public static void main(String[] args) {
        Hooks.onOperatorDebug();
        Flux.range(1,10)
            .map(item -> "item-" + item)
            .concatWith(Flux.error(new RuntimeException("手动异常")))
            .subscribe(System.out::println);
    }

}
