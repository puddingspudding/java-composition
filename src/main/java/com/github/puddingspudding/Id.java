package com.github.puddingspudding;

import java.util.function.Supplier;

/**
 * Created by pudding on 26.09.16.
 */
public final class Id implements Supplier<Long> {

    private final long id;

    public Id(final long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id is negative " + id);
        }
        this.id = id;
    }

    public Long get() {
        return this.id;
    }
}
