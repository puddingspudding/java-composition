package com.github.puddingspudding;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created by pudding on 26.09.16.
 */
public final class SomeClass {

    public final Supplier<Long> id;

    public final ShortName name;

    public SomeClass(final Supplier<Long> id, final ShortName name) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
    }

}
