package com.bigdatamatrix;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author bigdatamatrix@gmail.com
 */
@Service
public class CountingService {

    private final AtomicInteger counter = new AtomicInteger();

    public void increment() {
        counter.incrementAndGet();
    }

    public int currentValue() {
        return counter.intValue();
    }
}
