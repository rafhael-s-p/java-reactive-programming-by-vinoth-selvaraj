package com.studies.sec02;

import com.studies.utils.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRangeAndLog {

    public static void main(String[] args) {

        Flux.range(1, 10)
                .log()
                .map(i -> Util.faker().name().fullName())
                .log()
                .subscribe(Util.onNext());

    }

}