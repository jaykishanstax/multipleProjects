package com.java.application.java8.stream;


import java.util.stream.IntStream;

import static com.java.application.java8.stream.LogUtil.log;

// What are the advantages of Laziness?
// Lazy operations achieve efficiency. It is a way not to work on stale data
//  Lazy operations might be useful in the situations where input data is consumed gradually rather than having whole complete set of elements beforehand.
//  the terminal operation may be called at very different part of the application or at very late in time

public class LazyExample {

    public static void main (String[] args) {
        IntStream stream = IntStream.range(1, 5);
        stream = stream.peek(i -> log("starting", i))
                .filter(i -> {
                    log("filtering", i);
                    return i % 2 == 0;
                })
                .peek(i -> log("post filtering", i));
        log("Invoking terminal method count.");
        log("The count is", stream.count());
    }
}