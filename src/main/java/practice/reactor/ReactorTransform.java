package practice.reactor;

import reactor.core.publisher.Flux;

public class ReactorTransform {

    public static void main(String[] args) {
        Flux.range(1000,3)
            .map(i -> "User-" + i)
            .transform(stream -> stream.index()
                .doOnNext(tp -> System.out.println("[" + tp.getT1() + "] User: " + tp.getT2())))
                .subscribe(e -> System.out.println("onNext:" + e));
    }

}
