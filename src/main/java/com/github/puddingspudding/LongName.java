package com.github.puddingspudding;

import java.util.Objects;

/**
 * Created by pudding on 26.09.16.
 */
public class LongName {

    private final String name;

    public LongName(final String name) {
        Objects.requireNonNull(name);
        if (name.length() < 100) {
            throw new IllegalArgumentException("name too long");
        }
        this.name = name;
    }

    public final String get() {
        return this.name;
    }

}
