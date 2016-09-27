package com.github.puddingspudding;

import java.util.Objects;

/**
 * Created by pudding on 26.09.16.
 */
public final class Name {

    private final String name;

    public Name(final String name) {
        Objects.requireNonNull(name);
        if (name.length() > 1000) {
            throw new IllegalArgumentException("name too long");
        }
        this.name = name;
    }

    public final String get() {
        return this.name;
    }

}
