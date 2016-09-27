package com.github.puddingspudding;

import java.util.Objects;

/**
 * Created by pudding on 26.09.16.
 */
public class SpecificName {

    private final String name;

    public SpecificName(final String name) {
        Objects.requireNonNull(name);
        if (name.length() > 100) {
            throw new IllegalArgumentException("name too long");
        }   
        this.name = name;
    }

    public final String get() {
        return this.name;
    }

}
