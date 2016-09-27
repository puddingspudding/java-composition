package com.github.puddingspudding;

import java.util.Objects;

/**
 * Created by pudding on 26.09.16.
 */
public final class SomeOtherClass {

    public final Id id;

    public final SpecificName name;

    public SomeOtherClass(final Id id, final SpecificName name) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
    }

}
