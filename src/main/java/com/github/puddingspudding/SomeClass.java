package com.github.puddingspudding;

import java.util.Objects;

/**
 * Created by pudding on 26.09.16.
 */
public final class SomeClass {

    public final Id id;

    public final Name name;

    public SomeClass(final Id id, final Name name) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
    }

}
